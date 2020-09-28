package com.blankj.myself;

import java.util.Stack;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/23
 */
public class StackTest {
    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.isValid("()");
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char a:s.toCharArray()){
           if(a=='('){
               stack.push(')');
           }else if(a=='['){
               stack.push(']');
           }else if(a=='{'){
               stack.push('}');
           }else {
               if(stack.pop()!=a||stack.isEmpty()){
                   return false;
               }
           }
        }
        return stack.isEmpty();
    }
}
