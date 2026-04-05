class Solution {
    public int mirrorFrequency(String s) {
        int[] freq = new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int sum = 0;
        for(int i=0;i<13;i++){
            char c1 = (char)('a'+i);
            char c2 = (char)('z'-i);
            sum+=Math.abs(freq[c1]-freq[c2]);
        }
        for(int i=0;i<5;i++){
            char d1 = (char)('0'+i);
            char d2 = (char)('9'-i);
            sum+=Math.abs(freq[d1]-freq[d2]);
        }
        return sum;
    }
}