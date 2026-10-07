class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int sq = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            sq = nums[i] * nums[i];
            result[i] = sq;
        }
        Arrays.sort(result);
        return result;
    }
}