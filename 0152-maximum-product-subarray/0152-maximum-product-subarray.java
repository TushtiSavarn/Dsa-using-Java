class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];   // max product ending here
        int min = nums[0];   // min product ending here
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // store previous max before updating
            int tempMax = max;

            max = Math.max(curr, Math.max(curr * max, curr * min));
            min = Math.min(curr, Math.min(curr * tempMax, curr * min));

            result = Math.max(result, max);
        }

        return result;
    }
}
