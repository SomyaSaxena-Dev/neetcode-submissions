class Solution {
    public int[] twoSum(int[] nums, int target) {
         
        int[] result = new int[2];
        HashMap<Integer,Integer> numbers = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(numbers.containsKey(target - nums[i])){
                result[0] = numbers.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            numbers.put(nums[i],i);
        }
        return result;
    }
}
