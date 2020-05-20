package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/5/20
 */
public class SkipLadder {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
       int[] nums = new int[n];
       nums[0] = 1;
       nums[1] = 2;
       for (int i=2;i<n;i++){
           nums[i] = nums[i-2] + nums[i-1];
       }
       return nums[n-1];
    }
}
