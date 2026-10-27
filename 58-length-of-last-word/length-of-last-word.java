class Solution {
    public int lengthOfLastWord(String s) {

        String sTrim = s.trim();
        String[] words = sTrim.split(" ");
        int n = words.length-1;
        int charCount = words[n].length();
        return charCount;
    }
}