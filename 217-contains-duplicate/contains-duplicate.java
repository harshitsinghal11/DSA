class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int k = 1;
        for (int i=0; i<nums.length-1; i++){
            if (nums[j] == nums[k]){
                return true;
            }
            j++;
            k++;
        }
        return false;
    }
        
}