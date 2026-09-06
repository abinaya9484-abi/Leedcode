class Solution {

    static final int MOD = 1_000_000_007;

    public int checkRecord(int n) {

        // prev[c][a]: DP states for previous day
        // curr[c][a]: DP states for current day
        // c = consecutive L (0–2), a = absence used (0/1)
        int[][] prev = new int[3][2];
        int[][] curr = new int[3][2];

        // base case: 0 days, no L, no A
        prev[0][0] = 1;

        for (int day = 1; day <= n; day++) {

            // clear curr before reuse
            // (important because we reuse arrays after swapping)
            for (int c = 0; c < 3; c++)
                for (int a = 0; a < 2; a++)
                    curr[c][a] = 0;

            for (int consec = 0; consec <= 2; consec++) {
                for (int absent = 0; absent <= 1; absent++) {

                    int ways = prev[consec][absent];
                    if (ways == 0)
                        continue;

                    // take P → reset consecutive L
                    curr[0][absent] = (curr[0][absent] + ways) % MOD;

                    // take A → only if not used, reset L
                    if (absent == 0) {
                        curr[0][1] = (curr[0][1] + ways) % MOD;
                    }

                    // take L → only if consec < 2
                    if (consec < 2) {
                        curr[consec + 1][absent] = (curr[consec + 1][absent] + ways) % MOD;
                    }
                }
            }

            // swap references:
            int[][] temp = prev;
            prev = curr;
            // important: advance DP (current day becomes previous day)
            curr = temp;
            // not part of DP logic; done only to reuse memory and avoid new allocation

            
        }

        // sum all valid ending states
        int ans = 0;
        for (int consec = 0; consec <= 2; consec++) {
            for (int absent = 0; absent <= 1; absent++) {
                ans = (ans + prev[consec][absent]) % MOD;
            }
        }

        return ans;
    }
}