import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        
        // If no intervals, return empty
        if (intervals.length == 0) return new int[0][0];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // List to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 2: Add first interval
        merged.add(intervals[0]);

        // Step 3: Compare and merge
        for (int i = 1; i < intervals.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] current = intervals[i];

            // If overlapping
            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]); // merge
            } 
            // If not overlapping
            else {
                merged.add(current);
            }
        }

        // Convert List to 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
