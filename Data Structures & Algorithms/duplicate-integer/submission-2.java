class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean dup = false;

        //hashset

        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                return true;

            }
        }
        return dup;

    }
}