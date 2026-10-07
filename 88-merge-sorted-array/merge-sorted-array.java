class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int L = 0;
       int R = 0;
       while (m != nums1.length) {
        if (nums2 == null || nums2.length == 0){
            return;
        }
         nums1[m] = nums2[R];
         R++;
         m++;
       }
       Arrays.sort(nums1);
    }
}