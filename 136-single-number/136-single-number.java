class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i: nums) {
            if(!answer.contains(i)) {
                answer.add(i);
            }
            else {answer.remove(new Integer(i));}
        }
    return answer.get(0);
    }
}