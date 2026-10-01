class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i: nums1){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[nums1.length];
        int k = 0;
        
        for (int j: nums2){
            int count = map1.getOrDefault(j, 0);
            if (count == 0){
                continue;
            }else{
                result[k] = j;
                k++;
                map1.put(j, count-1);
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }
}