class Solution {
    public boolean hasDuplicate(int[] nums) {

        //Using hashset to store the data and check the number already seen or not
        Set<Integer> set = new HashSet<>();

        for(int num: nums){

            if(!set.add(num)){
                return true; //duplicate found
            }
        }
        return false;   
    }
}