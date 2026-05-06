class Solution {
    public int singleNumber(int[] nums) {
        int resultantXOR = 0;
        for(int i = 0;i< nums.length;i++) {
            resultantXOR = resultantXOR ^ nums[i];
        }
        return resultantXOR;
    }
}
