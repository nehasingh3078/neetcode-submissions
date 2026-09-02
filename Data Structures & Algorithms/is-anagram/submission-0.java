class Solution {
    public boolean isAnagram(String s, String t) {

        //by using Hastmap, we can store frequency of each character from the first String, then decrement the frequency while processing the second string. If frequencies match then they are anagrams.

//step 1 compare the length for both the String, if not match return false
        if(s.length() != t.length()){
            return false; 
        }

 //step 2 copare using HashMap, count each character frequency and then         
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            //store freq of first string, if this character already exist get it count otherwise take o i.e (c,0) then +1 increase the count
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

//Process the second String
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){ 
                return false;
            }

            map.put(ch, map.get(ch)-1);
            if (map.get(ch)<0){
                return false;
            }
        }
   
return true;
}

}