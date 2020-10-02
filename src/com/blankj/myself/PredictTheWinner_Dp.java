package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/1
 */
public class PredictTheWinner_Dp {
    public static void main(String[] args) {
        int v[] = { 1, 2, 3, 6, 9, 5, 7, 4, 2, 6, 9, 5, 8, 7, 2, 1, 55, 3, 6, 9, 7, 5, 2 };
        PredictTheWinner_Dp predictTheWinner = new PredictTheWinner_Dp();
        System.out.println(predictTheWinner.PredictTheWinner(v));
    }

    public boolean PredictTheWinner(int[] nums) {
        if(nums.length%2==0){
            return true;
        }

        int[][] dp = new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i][i] = nums[i];
        }

        for(int i=nums.length-2;i>=0;i--){
            for (int j=i+1;j<nums.length;j++){
                dp[i][j] = Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
        }
        return dp[0][nums.length-1]>=0;
    }


}
