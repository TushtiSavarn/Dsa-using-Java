class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZeroIndex = 0; // position to place the next non-zero

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap current non-zero with the element at lastNonZeroIndex
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                
                lastNonZeroIndex++;
            }
        }
    }
}
