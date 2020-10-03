package com.blankj.myself;

import java.util.HashSet;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/2
 */
public class HasCycle_fast_slow_point {

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }

        }
        return false;
    }

    static class ListNode {
      int val;
      ListNode next;
      public ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
