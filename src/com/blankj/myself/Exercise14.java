package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/28
 */
public class Exercise14 {
    static int max(int[] a, int i, int j) {
        int sum = 0;
        while (i <= j) {
            sum += a[i];
            i++;
        }
        return act(a, sum, 0, a.length - 1);
    }

    private static int act(int[] a, int sum, int l, int r) {
        int lmax, rmax;
        if (r - l > 1) {
            // 意思是先选一个，然后求剩下数组对方先选获得的最大值，用sum减去对方获得的最大值，即是自己的最大值
            // 然后比较选头还是尾更好
            lmax = sum - act(a, sum - a[l], l + 1, r);
            rmax = sum - act(a, sum - a[r], l, r - 1);
            return lmax > rmax ? lmax : rmax;
        } else {//剩下2个
            return a[l] > a[r] ? a[l] : a[r];
        }

    }

    public static void main(String[] args) {
        int v[] = {1, 2, 3, 6, 9, 5, 7, 4, 2, 6, 9, 5, 8, 7, 2, 1, 55, 3, 6, 9, 7, 5, 2};
        int n = max(v, 0, v.length - 1);
        System.out.println(n);
    }
}
