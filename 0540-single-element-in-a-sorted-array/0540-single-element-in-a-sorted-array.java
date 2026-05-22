class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            // Ensure mid is even so we can easily check the pair (mid, mid + 1)
            if (mid % 2 == 1) {
                mid--;
            }
            
            // If the partner element is at the next index, the single element 
            // is further down the right side.
            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } 
            // Otherwise, the single element is to the left (or is 'mid' itself).
            else {
                hi = mid;
            }
        }
        
        // 'lo' and 'hi' will converge on the single non-duplicate element
        return nums[lo];
    }
}