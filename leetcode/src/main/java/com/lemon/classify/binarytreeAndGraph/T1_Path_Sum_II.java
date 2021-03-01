package com.lemon.classify.binarytreeAndGraph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemoon on 2021/3/1 6:15 PM
 * leetcode 113
 */
public class T1_Path_Sum_II {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, targetSum);

        return result;
    }

    private void dfs(TreeNode root, List<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null) {
            if (sum == 0) {
                result.add(new ArrayList<>(list));
            }
        }


        if (root.left != null) {
            dfs(root.left, list, sum);
        }
        if (root.right != null) {
            dfs(root.right, list, sum);
        }
        list.remove(list.size() - 1);
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode root1 = new TreeNode(4);
        TreeNode root2 = new TreeNode(8);
        TreeNode root3 = new TreeNode(11);
        TreeNode root4 = new TreeNode(13);
        TreeNode root5 = new TreeNode(4);
        TreeNode root6 = new TreeNode(7);
        TreeNode root7 = new TreeNode(2);
        TreeNode root8 = new TreeNode(5);
        TreeNode root9 = new TreeNode(1);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        root5.left = root8;
        root5.right = root9;
        System.out.println(new T1_Path_Sum_II().pathSum(root, 22));
    }
}
