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
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int x,y,unit,carry=0;
        while (l1!=null||l2!=null){
            x = (l1==null?0:l1.val);
            y = (l2==null?0:l2.val);


            unit = (x + y + carry)%10 ;

            curr.next = new ListNode(unit);
            carry = (x + y + carry)/10;

            if(l1!=null){
                l1=l1.next;
            }

            if(l2!=null){
                l2=l2.next;
            }

            curr = curr.next;

        }

        if(carry!=0){
            curr.next = new ListNode(carry);
        }

        return res.next;
    }
}
