class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle k > n

        reverse(nums, 0, n - 1);     // Step 1: reverse entire array
        reverse(nums, 0, k - 1);     // Step 2: reverse first k elements
        reverse(nums, k, n - 1);     // Step 3: reverse remaining elements
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
