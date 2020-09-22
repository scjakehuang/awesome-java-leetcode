package com.blankj.myself;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.blankj.myself.InorderTraversal.TreeNode;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/14
 */
public class InorderTraversalByStack {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack stack = new Stack();
        TreeNode curr = root;
        while (curr!=null||!stack.isEmpty()){
            if(curr!=null){
                stack.push(curr.left);
                curr = curr.left;
            }else {
                curr = (TreeNode) stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }
        return list;
    }
}
