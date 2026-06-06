class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // sum of elements to the left of i
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // sum of elements to the right of i
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            ans[i] = Math.abs(leftSum - rightSum);
        }

        return ans;
    }
}