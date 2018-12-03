package com.lailai.algorithm_repo.InvertBinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    Scanner scanner = new Scanner(System.in);


    public void main(String[] args) {

    }


    /**
     * 创建
     *
     * @param root
     * @return
     */
    public TreeNode createTree(TreeNode root) {
        String val;
        val = scanner.next();
        if ("#".equals(val)) {
            return null;
        }
        root = new TreeNode(Integer.valueOf(val));
        root.left = createTree(root.left);
        root.right = createTree(root.right);
        return root;
    }

    /**
     * 翻转镜像
     *
     * @param root
     */
    public void mirror(TreeNode root) {
        if (null == root) {
            return;
        }
        if (root.right == null && root.left == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }


    /**
     * 不用地柜翻转二叉树
     * @param root
     */
    public void reverseNode(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp = null;
        if (root == null) {
            return;
        }
        queue.add(root);
        while (queue.size() != 0) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if (root.right != null) {
                queue.add(root.right);
            }
            if (root.left != null) {
                queue.add(root.left);
            }
        }
    }


}
