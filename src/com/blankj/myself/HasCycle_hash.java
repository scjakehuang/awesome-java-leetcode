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
public class HasCycle_hash {

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head!=null){
            if(hashSet.contains(head)){
                return true;
            }else {
                hashSet.add(head);
                head = head.next;
            }
        }
        return false;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
