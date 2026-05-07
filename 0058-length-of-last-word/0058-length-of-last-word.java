class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n - 1;
        
        // Step 1: Remove trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        int length = 0;
        
        // Step 2: Count the length of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
}
