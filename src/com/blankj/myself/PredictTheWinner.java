package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/1
 */
public class PredictTheWinner {
    public static void main(String[] args) {
        int v[] = { 1, 2, 3, 6, 9, 5, 7, 4, 2, 6, 9, 5, 8, 7, 2, 1, 55, 3, 6, 9, 7, 5, 2 };
        PredictTheWinner predictTheWinner = new PredictTheWinner();
        System.out.println(predictTheWinner.PredictTheWinner(v));
    }

    public boolean PredictTheWinner(int[] nums) {
        if(nums.length%2==0){
            return true;
        }
        return predictTheWinnerReal(nums,0,nums.length-1)>=0;
    }

    public int predictTheWinnerReal(int[] nums,int l,int r){
        if(l==r){
            return nums[l];
        }
        int left = nums[l] - predictTheWinnerReal(nums,l+1,r);
        int right = nums[r] - predictTheWinnerReal(nums,l,r-1);

        return Math.max(left,right);
    }

}
