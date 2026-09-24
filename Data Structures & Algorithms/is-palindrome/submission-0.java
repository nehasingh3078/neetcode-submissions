class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
        }
        }  

        String clean = filtered.toString();
        String result = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            result += clean.charAt(i);
        }

        return clean.equals(result);
    }

}