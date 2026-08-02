class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0; // next even position
        for (int j = 0; j < nums.length; j++) {
            // If current number is even
            if (nums[j] % 2 == 0) {
                // Swap current even with front position
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++; // move next even position
            }
        }
        return nums;
    }
}