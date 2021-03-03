package com.lemon.classify.binarytreeAndGraph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemoon on 2021/3/3 8:03 AM
 * leetcode 236
 */
public class T2_Lowest_Common_Ancestor_of_a_Binary_Tree {
    List<TreeNode> listP = new ArrayList<>();
    List<TreeNode> listQ = new ArrayList<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        dfsP(root, p, new ArrayList<>());
        dfsQ(root, q, new ArrayList<>());
        if (listP.size() == 0 || listQ.size() == 0) {
            return null;
        }
        int index = 0;
        while (index < Math.min(listP.size(), listQ.size())) {
            if (listP.get(index) == listQ.get(index)) {
                index++;
            } else {
                break;
            }
        }
        return listP.get(index - 1);
    }

    private void dfsP(TreeNode root, TreeNode node, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        if (root == node) {
            listP = new ArrayList<>(list);
            return;
        }
        dfsP(root.left, node, list);
        dfsP(root.right, node, list);
        list.remove(list.size() - 1);
    }

    private void dfsQ(TreeNode root, TreeNode node, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        if (root == node) {
            listQ = new ArrayList<>(list);
            return;
        }
        dfsQ(root.left, node, list);
        dfsQ(root.right, node, list);
        list.remove(list.size() - 1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
