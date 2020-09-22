package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/21
 */
public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(1001));
    }
    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;
        String xStr = String.valueOf(x);

        for (int i=0;i<xStr.length()/2;i++){
            if(xStr.charAt(i)!=xStr.charAt(xStr.length()-i-1)){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
