package leetcode;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * ��Ŀ��The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * ������Ҷ�ӽ��ľ���
 */
public class MinimumDepthofBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1; //�������Һ�ֽʱ������Ҷ�ӽ��
            if (root.left == null) { //����ֽ�����������Һ�ֽ��ʼ��
                return minDepth(root.right) + 1;
            } else if (root.right == null) { //ͬ��
                return minDepth(root.left) + 1;
            } else {
                return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
            }
        }
    }
}
