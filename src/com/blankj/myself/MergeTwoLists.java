package com.blankj.myself;

import com.blankj.myself.HasCycle_fast_slow_point.ListNode;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/3
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return l2;
        }
        if(l1==null&&l2!=null){
            return l2;
        }
        if(l2==null&&l1!=null){
            return l1;
        }
        ListNode res ;
        if(l1.val<=l2.val){
            res = new ListNode(l1.val);
            res.next = mergeTwoLists(l1.next,l2);
        }else {
            res = new ListNode(l2.val);
            res.next = mergeTwoLists(l1,l2.next);
        }
        return res;

    }
}
