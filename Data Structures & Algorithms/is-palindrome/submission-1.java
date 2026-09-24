class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
        }
        }  
        String original = filtered.toString();
        String reverse = filtered.reverse().toString();
        
        if(!original.equals(reverse)){
            return false;
        }
        return true;


    }
}