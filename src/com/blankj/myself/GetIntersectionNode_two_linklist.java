package com.blankj.myself;

import com.blankj.myself.HasCycle_fast_slow_point.ListNode;

/**
 * Description:leecode 160. 相交链表
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/2
 */
public class GetIntersectionNode_two_linklist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA!=pB){
            pA = pA==null?headB:pA.next;
            pB = pB==null?headA:pB.next;
        }
        return pA;
    }
}
