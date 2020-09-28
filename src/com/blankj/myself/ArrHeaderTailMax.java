package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/28
 */
public class ArrHeaderTailMax {

    public static int max(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("sum="+sum);

        return maxDetail(a,sum,0,a.length-1,0);
    }

    public  static int maxDetail(int[] a,int sum,int leftIndex,int rightIndex,int max){
        int chooseNum = 0;
        if(rightIndex-leftIndex>1){
            int leftMax = sum - maxDetail(a,sum-a[leftIndex],leftIndex+1,rightIndex,max);
            int rightMax = sum - maxDetail(a,sum-a[rightIndex],leftIndex,rightIndex-1,max);

            chooseNum = Math.max(leftMax,rightMax);
            return chooseNum;
        }else {
            return Math.max(a[leftIndex],a[rightIndex]);
        }
    }

    public static void main(String[] args) {
        int v[] = { 1, 2, 3, 6, 9, 5, 7, 4, 2, 6, 9, 5, 8, 7, 2, 1, 55, 3, 6, 9, 7, 5, 2 };
        int n = max(v);
        System.out.println(n);

        System.out.println(max2_dync(v));
    }

    /**
     *
     *
     * dp[i][j]=sum[i,j]-min(dp[i-1][j],dp[i][j-1])
     * @param b
     * @return
     */
    public static int max2_dync(int[] b){
        int n = b.length;
        int[] a=new int[n+1];
        int[][] dp=new int[n+1][n+1];
        int[] sum=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=b[i-1];
            sum[i]=sum[i-1]+a[i];
            dp[i][i]=a[i];
        }

        for(int i=n;i>0;i--){
            for(int j=i+1;j<=n;j++){
                dp[i][j]=sum[j]-sum[i-1]-Math.min(dp[i+1][j],dp[i][j-1]);
            }
        }
        int first=dp[1][n];
        int second=sum[n]-first;
        System.out.println(first+" "+second);
        return first;

    }




}
