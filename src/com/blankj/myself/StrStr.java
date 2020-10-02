package com.blankj.myself;

import java.util.Objects;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/1
 */
public class StrStr {
    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        strStr.strStr("mississippi",
            "issip");
    }

    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i=0;i<hLen-nLen;i++){
            for (int j=0; j<nLen;j++){
                if (haystack.charAt(i+j)==needle.charAt(j)){
                    if(j==nLen-1){
                        return i;
                    }
                }else {
                    break;
                }
            }

        }
        return -1;
    }
}
