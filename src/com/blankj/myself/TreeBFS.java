package com.blankj.myself;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import com.blankj.myself.InorderTraversal.TreeNode;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/10/3
 */
public class TreeBFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);

        while (queue.peek()!=null){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for (int i=0;i<size;i++){
                TreeNode treeNode = queue.removeFirst();

                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.add(treeNode.right);
                }

                temp.add(treeNode.val);
            }

            res.add(temp);
        }
        return res;
    }
}
