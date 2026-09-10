class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int n = s.length() - 1;
        int L = 0;
        int R = n;
        for(int i = 0; i < n ; i++){
            if(s.charAt(L) != s.charAt(R)){
                return false;
            }
            L++;
            R--;
        }
        return true;
    }
}