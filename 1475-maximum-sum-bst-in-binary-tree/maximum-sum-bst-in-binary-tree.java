/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxSum;

    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        findMaxSum(root);
        return maxSum;
    }

    // Returns {isBST, minValue, maxValue, sum}
    private int[] findMaxSum(TreeNode node) {

        if (node == null) {
            return new int[]{
                1,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            };
        }

        int[] leftResult = findMaxSum(node.left);
        int[] rightResult = findMaxSum(node.right);

        boolean isLeftBST = leftResult[0] == 1;
        boolean isRightBST = rightResult[0] == 1;

        if (isLeftBST && isRightBST && leftResult[2] < node.val && node.val < rightResult[1]) {

            int currentSum = node.val + leftResult[3] + rightResult[3];
            maxSum = Math.max(maxSum, currentSum);

            int minValue = Math.min(leftResult[1], node.val);
            int maxValue = Math.max(rightResult[2], node.val);

            return new int[]{
                1,
                minValue,
                maxValue,
                currentSum
            };
        }

        return new int[]{0, 0, 0, 0};
    }
}