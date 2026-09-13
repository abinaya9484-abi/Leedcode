class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '-')
                str.append(Character.toUpperCase(c));
        }

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (count == k) {
                ans.append('-');
                count = 0;
            }
            ans.append(str.charAt(i));
            count++;
        }

        return ans.reverse().toString();
    }
}