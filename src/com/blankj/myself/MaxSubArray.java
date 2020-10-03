package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/3
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] = Math.max(nums[i-1],0) + nums[i];
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
