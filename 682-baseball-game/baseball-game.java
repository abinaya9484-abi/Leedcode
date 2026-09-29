class Solution {
    public int calPoints(String[] operations) {
        int[] a = new int[operations.length];
        int n = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                n--;
            } else if (op.equals("D")) {
                a[n] = 2 * a[n - 1];
                n++;
            } else if (op.equals("+")) {
                a[n] = a[n - 1] + a[n - 2];
                n++;
            } else {
                a[n++] = Integer.parseInt(op);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        return sum;
    }
}