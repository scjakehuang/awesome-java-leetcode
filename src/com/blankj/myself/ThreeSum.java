package com.blankj.myself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/21
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int k=0;k<length-2;k++){
            if(nums[k]>0){
                return result;
            }
            if(k>0&&nums[k]==nums[k-1]){
                continue;
            }
            int L=k+1;
            int R=length-1;
            while (L<R){
                int sum = nums[k] + nums[L] + nums[R];
                if(sum==0){
                    result.add(Arrays.asList(nums[k] , nums[L] , nums[R]));
                    while (L<R &&nums[L]==nums[L+1]){
                        L = L+1;
                    }
                    while (L<R &&nums[R]==nums[R-1]){
                        R = R-1;
                    }
                    L = L+1;
                    R = R-1;
                }
                if(sum < 0){
                    L = L+1;
                }
                if(sum > 0){
                    R = R-1;
                }
            }
        }
        return result;
    }
}
