class Solution {
    public String defangIPaddr(String arr) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length(); i++) {

            if (arr.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(arr.charAt(i));
            }
        }

        return sb.toString();
    }
}