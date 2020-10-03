package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/2
 */
public class Rotate {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        Rotate rotate = new Rotate();
        rotate.rotate(a,3);
    }

    public void rotate(int[] nums, int k) {

        for(int i=0;i<k;i++){
            int temp = nums[nums.length-1];
            for (int j=nums.length-1;j>=0;j--){
                if(j==0){
                    nums[j] = temp;
                }else{
                    nums[j] = nums[j-1];
                }
            }
        }
        //int[] temps = new int[k];
        //for(int i=nums.length-k;i<=nums.length-1;i++){
        //    temps[i+k-nums.length]=nums[i];
        //}
        //for(int j=nums.length-1;j>=0;j--){
        //    if(j>=k){
        //        nums[j]=nums[j-k];
        //    }else{
        //        nums[j]=temps[j];
        //    }
        //}

    }

}
