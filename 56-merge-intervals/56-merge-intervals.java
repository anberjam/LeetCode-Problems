class Solution {
    public int[][] merge(int[][] intervals) {

        int[][] results = new int[intervals.length][2]; // what we'll return, using Arrays.copyOf()
        int indexIntoResults = 0;
        
        // sort `intervals` in ascending order by start value
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        int startOfCurrentResultInterval = intervals[0][0];
        int greatestKnownEnd = intervals[0][1]; // initialize to first interval's end
        
        for (int index = 0; index < intervals.length - 1; ++index) {
            int curStart = intervals[index][0];
            int curEnd = greatestKnownEnd; // assign `greatestKnownEnd` to the current interval to represent the currently building interval
            int nextStart = intervals[index + 1][0];
            int nextEnd = intervals[index + 1][1];
            
            if (nextEnd <= curEnd) {                            // next interval is wholly within the currently building interval, so we can ignore it and move on
                continue;
            }
            
            // now we know: nextEnd > curEnd
            
            if (curStart <= nextStart && nextStart <= curEnd) { // next interval starts within this one and pushes out the `greatestKnownEnd`
                greatestKnownEnd = nextEnd;
                continue;
            } else {                                            // next interval starts after this one ends, so close out currently building interval
                results[indexIntoResults][0] = startOfCurrentResultInterval;
                results[indexIntoResults][1] = curEnd;
                ++indexIntoResults;
                // begin to track the next non-overlapping interval:
                startOfCurrentResultInterval = nextStart;
                greatestKnownEnd = nextEnd;
            }
        }
        
		// close out final interval
        results[indexIntoResults][0] = startOfCurrentResultInterval;
        results[indexIntoResults][1] = greatestKnownEnd;
        ++indexIntoResults;
        
        return Arrays.copyOf(results, indexIntoResults);
    }
}