class Solution {
    public int search(int[] nums, int key) {
        int low = 0, high = nums.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;   // safe mid calculation

            if (key == nums[mid])
                return mid;
            else if (key < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
