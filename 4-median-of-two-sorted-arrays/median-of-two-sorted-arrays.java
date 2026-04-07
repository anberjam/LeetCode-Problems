class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //create new array of size n+m
        //add both arrays to new array
        //sort array 
        //if n+m is odd, return middle value
        //if n+m is even, return average of two middle values
        int n = nums1.length;
        int m = nums2.length;
        int combinedLength = n+m;
        int[] combinedArray = new int[combinedLength];
        System.arraycopy(nums1,0,combinedArray,0,n);
        System.arraycopy(nums2,0,combinedArray, n,m);
        Arrays.sort(combinedArray);
        double solution =0;
        if(combinedLength%2==1){
            solution = (double) combinedArray[combinedLength/2];
        }
        else if(combinedLength%2==0){

            solution = (double) (combinedArray[combinedLength/2 -1] + combinedArray[combinedLength/2]) /2.0;
        }
    return solution;

    }
}