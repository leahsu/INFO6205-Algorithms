package edu.northeastern.Leahsu;

/*Q10
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
*/

import java.util.Arrays;

public class MeetingRoomsII {

    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0)
            return 0;
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int res = 0, j = 0;
        for(int i = 0; i < starts.length; i++) {
            if(starts[i] >= ends[j]) j++;
            else res++;
        }
        return res;
    }
}
