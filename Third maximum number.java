class Solution {

    public int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int n : nums) {

            long val = n;

            // Skip duplicates
            if (val == max1 ||
                val == max2 ||
                val == max3) {

                continue;
            }

            // New largest
            if (val > max1) {

                max3 = max2;
                max2 = max1;
                max1 = val;

            // New second largest
            } else if (val > max2) {

                max3 = max2;
                max2 = val;

            // New third largest
            } else if (val > max3) {

                max3 = val;
            }
        }

        return (max3 == Long.MIN_VALUE)
                ? (int) max1
                : (int) max3;
    }
}
