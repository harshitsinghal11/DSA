class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int n = nums.length;
        int oneCount = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                oneCount++;
                max = Math.max(max, oneCount);
            } else{
                oneCount = 0;
            }
        }
        return max;
    }
}