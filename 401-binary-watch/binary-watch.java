class Solution {

    List<String> ans = new ArrayList<>();

    int[] hour = {8, 4, 2, 1};

    int[] minute = {32, 16, 8, 4, 2, 1};

    public List<String> readBinaryWatch(int turnedOn) {

        backtrack(0, 0, 0, turnedOn);

        return ans;
    }

    private void backtrack(int index,
                           int hours,
                           int minutes,
                           int ledsLeft) {

        if (hours > 11 || minutes > 59)
            return;

        if (ledsLeft == 0) {

            ans.add(hours + ":" +
                    (minutes < 10 ? "0" : "") + minutes);

            return;
        }

        if (index == 10)
            return;

        // Choose current LED
        if (index < 4)
            backtrack(index + 1,
                      hours + hour[index],
                      minutes,
                      ledsLeft - 1);
        else
            backtrack(index + 1,
                      hours,
                      minutes + minute[index - 4],
                      ledsLeft - 1);

        // Skip current LED
        backtrack(index + 1,
                  hours,
                  minutes,
                  ledsLeft);
    }
}