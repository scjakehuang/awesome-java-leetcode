package com.blankj.myself;

import java.util.Stack;

import com.blankj.myself.HasCycle_fast_slow_point.ListNode;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/2
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode listNode = new ListNode(stack.pop().intValue());
        while(!stack.isEmpty()){
            listNode.next = new ListNode(stack.pop().intValue());
        }
        return listNode;
    }

}
