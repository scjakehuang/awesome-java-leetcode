package com.blankj.myself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:三数之和
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/21
 */

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

 注意：答案中不可以包含重复的三元组。

  

 示例：

 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

 满足要求的三元组集合为：
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/3sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
