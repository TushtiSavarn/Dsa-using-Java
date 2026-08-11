class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        // Convert int[] to String[]
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using concatenation comparison
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If largest element is "0", all elements are 0
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            ans.append(arr[i]);
        }

        return ans.toString();
    }
}