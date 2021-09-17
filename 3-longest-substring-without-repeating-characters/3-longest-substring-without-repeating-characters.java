class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() ==0 ) {
            return 0;
        }
        
     
        int start = 0;
        int end = 0;
        int max = 0;
        ArrayList<String> sub = new ArrayList<String>();
        
        while (end < s.length()) {
            String letter = String.valueOf(s.charAt(end));
            
            if (!sub.contains(letter)) {
                sub.add(letter);
                end++;
                if (max < sub.size()) {
                    max = sub.size();
                }
            }
            else {
                sub.remove(0);
                start++;
            }
        }
        
        return max;
        
    }
}