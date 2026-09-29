class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int ans = Integer.MIN_VALUE;
        while (left < right){
            if(height[left] < height[right]){
                maxArea = height[left] * (right - left);
                ans = Math.max(maxArea, ans);
            } else{
               maxArea = height[right] * (right - left);
                ans = Math.max(maxArea, ans);
            }
                if (height[left] <= height[right] ){
                    left++;
                }else {
                    right--;
                }
        }
        return ans;
    }
}