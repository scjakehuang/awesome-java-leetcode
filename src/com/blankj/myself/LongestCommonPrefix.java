package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/22
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result = new String();
        String first = strs[0];
        if(first==null){
            return "";
        }
        for(int j=0;j<first.length();j++){
            boolean end = false;
            char b = first.charAt(j);
            for(int i=1;i<strs.length;i++){
                String a = strs[i];
                if(first.charAt(i)!=b){
                    end = true;
                    break;
                }
            }
            result = result+b;
            if(end==true){
                break;
            }
        }
        return result;
    }
}
