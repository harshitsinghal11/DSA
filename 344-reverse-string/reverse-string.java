class Solution {
    public void reverse(char[] s, int start, int end){
        char temp = 0;
        while(start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public void reverseString(char[] s) {
        int n = s.length;
        reverse(s, 0, n-1);
    }
}