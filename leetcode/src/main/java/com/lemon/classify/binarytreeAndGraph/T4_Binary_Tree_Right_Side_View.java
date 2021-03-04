package com.lemon.classify.binarytreeAndGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lemoon on 2021/3/4 11:04 PM
 */
public class T4_Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));
        int index = 1;
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> node = queue.poll();
            if (node.v == index) {
                index++;
                list.add(node.k.val);
            }
            if (node.k.right != null) {
                queue.offer(new Pair<>(node.k.right, node.v + 1));
            }
            if (node.k.left != null) {
                queue.offer(new Pair<>(node.k.left, node.v + 1));
            }
        }
        return list;
    }

    class Pair<K, V> {
        private K k;
        private V v;

        public Pair(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
