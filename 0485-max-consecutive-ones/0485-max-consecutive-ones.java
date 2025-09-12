class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                currentConsecutiveOnes++;
            } else {
                // If a 0 is encountered, reset the current count
                // and update the maximum if the current count was higher
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
                currentConsecutiveOnes = 0;
            }
        }

        // After the loop, one final check is needed to capture the maximum
        // if the array ends with a sequence of 1s
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);

        return maxConsecutiveOnes;
    }
}