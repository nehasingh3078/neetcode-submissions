class Solution {
    public int[] twoSum(int[] nums, int target) {

        //optimised solution o(n) by using HashMap and calculating the complement =  target - nums[i]

    //Use HashMap to store each number along with its index. For every element calculate the complement by subtracting the current number from the target. if the complement already exist in the map, you have found the required pair and return its stored index and current index, otherwise store the current number and index in the map
    
        Map<Integer, Integer> map = new HashMap<>();
        

        for(int i =0; i<nums.length; i++){
           int complement = target - nums[i]; //store index
           if(map.containsKey(complement)){
            return new int [] {map.get(complement), i};
           }
           map.put(nums[i], i);
        }
        return new int [] {-1, -1};



        
    }
}
