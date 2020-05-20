package com.blankj.myself;

import java.util.Objects;
import java.util.Stack;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/5/18
 */

public class TreePostNode {

    public static void main(String[] args) {

    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode result = null;
        if(Objects.nonNull(p.right)){
            result = p.right;
            while (Objects.nonNull(result.left)){
                result = result.left;
            }
        }else {
           stack.add(root);
           TreeNode temp = root;
           Boolean findFlag = false;
           while (!findFlag){
              if(p.val>temp.val){
                  temp = temp.right;
                  stack.add(temp);

              }else if(p.val<temp.val){
                  temp = temp.left;
                  stack.add(temp);

              }else {
                  findFlag = true;
              }
           }
           findFlag = false;
           TreeNode child = p;
           while (stack.size()>0&&!findFlag){
               TreeNode parent = stack.pop();
               if(child == parent.left){
                   result = parent;
                   findFlag = true;
               }else {
                   child = parent;
               }
           }

        }
        return result;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
