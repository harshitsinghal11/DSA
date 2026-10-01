class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>(firstSet);

        for (int firstNum: nums1){
            firstSet.add(firstNum);
        }
        for (int secondNum: nums2){
            secondSet.add(secondNum);
        }

        int[] res = new int[firstSet.size()];
        int k = 0;
        for (int num: firstSet){
            if(secondSet.contains(num)){
                res[k] = num;
                k++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
} 