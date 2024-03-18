package dsapractice.Array;

import java.util.ArrayList;
import java.util.List;

public class LC57_InsertInterval {
	
	/*
	 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, 
	 * endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti.
	 *  You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
	 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals
	 * still does not have any overlapping intervals (merge overlapping intervals if necessary).
	 * Return intervals after the insertion.
	 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
	 */
	
	public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
      
      // Iterate through intervals and add non-overlapping intervals before newInterval
      int i = 0;
      while (i < intervals.length && intervals[i][1] < newInterval[0]) {
          result.add(intervals[i]);
          i++;
      }
      
      // Merge overlapping intervals
      while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
          newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
          newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
          i++;
      }
      
      // Add merged newInterval
      result.add(newInterval);
      
      // Add non-overlapping intervals after newInterval
      while (i < intervals.length) {
          result.add(intervals[i]);
          i++;
      }
      
      return result.toArray(new int[result.size()][]);
  }

}
