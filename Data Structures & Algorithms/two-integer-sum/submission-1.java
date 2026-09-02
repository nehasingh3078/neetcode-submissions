class Solution {
    public int[] twoSum(int[] nums, int target) {

        //optimised solution o(n) by using HashMap and calculating the complement =  target - nums[i]
        Map<Integer, Integer> map = new HashMap<>();
        

        for(int i =0; i<nums.length; i++){
           int complement = target - nums[i];
           if(map.containsKey(complement)){
            return new int [] {map.get(complement), i};
           }
           map.put(nums[i], i);
        }
        return new int [] {-1, -1};



        
    }
}
