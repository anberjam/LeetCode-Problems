class Solution {
    public String longestCommonPrefix(String[] strs) {
    
        if (strs.length == 0) return "";
        
        String inCommon = strs[0];
        
        for (int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(inCommon) !=0) {
                inCommon = inCommon.substring(0, inCommon.length()-1);
            }
            if (inCommon.equals("")) return "";
            
        }


        return inCommon;
        
        
        
    }
}