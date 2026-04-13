class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int solution = 0;
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        
        for (int i=0; i< nums.length; i++){
            if (nums[i]==target){
                indexes.add(i);

                if(Math.abs(i-start) < solution || indexes.size() ==1){
                    solution = Math.abs(i-start);
                }
            }
        }
        return solution;
    }
}