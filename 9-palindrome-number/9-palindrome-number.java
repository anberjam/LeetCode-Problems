class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) { return false;}
        
        String value = String.valueOf(x);
        
        for (int i=0; i < value.length(); i++) {
            if (value.charAt(i) != value.charAt(value.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}