class Solution {
    int count = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    void mergeSort(int[] nums, int l, int r) {
        if (l >= r)
            return;

        int mid = l + (r - l) / 2;

        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    void merge(int[] nums, int l, int mid, int r) {

        // Count reverse pairs
        int i = l;
        int j = mid + 1;

        while (i <= mid && j <= r) {
            if ((long) nums[i] > 2L * nums[j]) {
                count += (mid - i + 1);
                j++;
            } else {
                i++;
            }
        }

        // Merge step
        int[] temp = new int[r - l + 1];

        i = l;
        j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= r) {
            temp[k++] = nums[j++];
        }

        for (i = l; i <= r; i++) {
            nums[i] = temp[i - l];
        }
    }
}