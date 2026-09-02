class Solution {
    public boolean isAnagram(String s, String t) {
        //by using frequency array since s and t consist of only lowercase english letters
       if (s.length() != t.length()){
        return false;
       }

       //increase the count for character in s and decrease the count for character in t

       int[] count = new int [26]; //there are 26 lowercase in english letters
       for(int i=0; i<s.length(); i++){
        count[s.charAt(i)- 'a']++;
        count[t.charAt(i)- 'a']--;
       }

       for (int n : count){
        if(n != 0){
            return false;
        }
       }
       return true;



    }
}
