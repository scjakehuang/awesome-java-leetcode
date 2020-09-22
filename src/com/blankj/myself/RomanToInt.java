package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/21
 */
public class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        int pre = cast(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int cuur = cast(s.charAt(i));
            if(pre<cuur){
                sum = sum -pre;
            }else {
                sum = sum +pre;
            }
            pre = cuur;
        }
        sum = sum + cast(s.charAt(s.length()-1));
        return sum;
    }

    private int cast(char i){
        switch (i){
            case('I'):return 1;
            case('V'):return 5;
            case('X'):return 10;
            case('L'):return 50;
            case('C'):return 100;
            case('D'):return 500;
            case('M'):return 1000;
            default:return 0;
        }

    }
}
