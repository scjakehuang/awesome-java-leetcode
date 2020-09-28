package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/23
 */
public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(System.currentTimeMillis());
        System.out.println(climbStairs.climbStairs(46));
        System.out.println(System.currentTimeMillis());

        System.out.println("--------------------------");

        System.out.println(System.currentTimeMillis());
        System.out.println(climbStairs.climbStairs2(46));
        System.out.println(System.currentTimeMillis());

        System.out.println("--------------------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(climbStairs.climbStairs3(46));
        System.out.println(System.currentTimeMillis());
    }
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public int climbStairs3(int n) {
        int[] nums = new int[n];
        nums[0]=1;
        nums[1]=2;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        for (int i=2;i<n;i++){
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n-1];
    }

    public int climbStairs2(int n) {
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
