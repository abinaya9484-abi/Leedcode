class Solution {

    public int missingNumber(int[] nums) {

        // Start with n
        int xor = nums.length;

        // Traverse array
        for (int i = 0; i < nums.length; i++) {

            /*
             * Cancel matching values
             * using XOR
             */

            xor ^= i ^ nums[i];
        }

        // Remaining value is missing number
        return xor;
    }
}
