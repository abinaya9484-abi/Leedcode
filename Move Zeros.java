class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // No zero found
        if (j == -1) {
            return;
        }

        // Move non-zero elements to the earliest zero position
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}
