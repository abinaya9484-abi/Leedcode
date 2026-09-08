class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];

        for (int num: nums) {
            arr[num]++;
        }
        for (int i=1; i<arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        int[] ans = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) ans[i] = 0;
            else ans[i] = arr[nums[i] - 1];
        }

        return ans;
    }
}