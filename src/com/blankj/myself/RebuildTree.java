package com.blankj.myself;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Copyright: Copyright (c) 2012
 * Company: keruyun Technology(Beijing) Chengdu Co. Ltd.
 *
 * @author huangjk
 * @version 1.0 2020/9/16
 */
public class RebuildTree {
    

    public TreeNode buildTree(int[] preorder, int[] inorder) {
       Map indexMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < preorder.length; i++) {
            indexMap.put(inorder[i],i);
        }
        return reBuildTree(0,0,inorder.length-1,preorder,inorder,indexMap);
    }


    public TreeNode reBuildTree(int preRootIndex, int inorderLeftIndex,int inorderRightIndex,int[] preorder, int[] inorder,Map indexMap) {
        if(inorderLeftIndex>=inorderRightIndex){
            return null;
        }
        int index = (int)indexMap.get(preorder[preRootIndex]);
        TreeNode treeNode = new TreeNode(preorder[preRootIndex]);
        treeNode.left = reBuildTree(preRootIndex+1,inorderLeftIndex,index-1,preorder,inorder,indexMap);
        treeNode.right = reBuildTree(preRootIndex+index-inorderLeftIndex+1,index+1,inorderRightIndex,preorder,inorder,indexMap);
        return treeNode;
    }



    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
