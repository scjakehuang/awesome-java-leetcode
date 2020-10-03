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
public class GetKthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = null;

        //head.next=new ListNode(2);
        //head.next.next=new ListNode(3);
        //head.next.next.next=new ListNode(4);
        //head.next.next.next.next=new ListNode(5);

        for (int i=1;i<5;i++){
            if(tail==null){
                tail = new ListNode(i+1);
                head.next = tail;
            }else {
                tail.next = new ListNode(i+1);
                tail = tail.next;
            }

        }

        GetKthFromEnd getKthFromEnd = new GetKthFromEnd();
        getKthFromEnd.getKthFromEnd(head,2);


    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        int size = 0;
        ListNode headSecond = head;
        while(head!=null){
            head = head.next;
            size = size + 1;
        }
        ListNode res = null;
        ListNode temp = null;
        int index = 0;
        while(headSecond!=null){

            index = index + 1;
            if(size-k<index){
                if(res==null){
                    temp = new ListNode(headSecond.val);
                    res = temp;
                }else{
                    temp.next = headSecond;
                    temp=temp.next;
                }
            }
            headSecond = headSecond.next;
        }
        return res;
    }

}
