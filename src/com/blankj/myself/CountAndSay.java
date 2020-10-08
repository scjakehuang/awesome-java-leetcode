package com.blankj.myself;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/3
 */
public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        for(int i=1;i<=n;i++){
            char[] tempArr = res.toString().toCharArray();
            char temp;
            int k=0;
            res = new StringBuilder();
            for (int j=0;j<tempArr.length;j++){
                if(tempArr[j]==tempArr[j+1]){
                    k = k+1;
                }else {
                    res.append(k).append(tempArr[j]);
                    k = 0;
                }
            }
        }
        return res.toString();
    }
}
