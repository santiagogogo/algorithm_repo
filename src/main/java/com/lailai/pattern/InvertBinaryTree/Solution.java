package com.lailai.pattern.InvertBinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Solution solution=new Solution();
        TreeNode root=null;
        solution.createTree(root);
        solution.levelTraverse(root);
        System.out.println("\n遍历输出原二叉树");
        solution.mirror(root);
        solution.levelTraverse(root);
        System.out.println("\n递归遍历输出翻转二叉树");
        solution.reverseNode(root);
        solution.levelTraverse(root);
        System.out.println("\n非递归遍历输出翻转二叉树");
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
        //System.out.println(val);
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
    public TreeNode mirror(TreeNode root) {
        if (null == root) {
            return null;
        }
        if (root.right == null && root.left == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
        return root;
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


    public  void levelTraverse(TreeNode root){
        if (root==null){
            return;
        }
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size()!=0){
            TreeNode node=queue.removeFirst();
            System.out.print(node.val+" ");
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
    }


}
