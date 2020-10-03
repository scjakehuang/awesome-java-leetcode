package com.blankj.myself;

import com.blankj.myself.InorderTraversal.TreeNode;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/2
 */
public class KthLargest {

    int resp;
    int index;
    public int kthLargest(TreeNode root, int k) {
        index = k;
         dfs(root);
         return resp;
    }

    public void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.right);

        if(--index==0){
            resp = root.val;
        }
        dfs(root.left);
    }
}
