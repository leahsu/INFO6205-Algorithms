package edu.northeastern.Leahsu;

/*Q9
There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
*/

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] from = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) from[i] = new ArrayList();
        int[] to = new int[numCourses];
        boolean[] cur = new boolean[numCourses];
        boolean[] isV = new boolean[numCourses];
        for (int[] pre : prerequisites) {
            from[pre[1]].add(pre[0]);
            to[pre[0]]++;
        }
        // check if circle exists
        for (int i = 0; i < numCourses; i++) {
            if (to[i] == 0 && !isV[i]) {
                if (findCircle(i, from, cur, isV)) {
                    return false;
                }
            }
        }
        // check if all courses are reachable
        for (int i = 0; i < numCourses; i++) {
            if (to[i] != 0 && !isV[i]) return false;
        }
        return true;
    }
    private boolean findCircle(int index, List<Integer>[] from, boolean[] cur, boolean[] value) {
        if (value[index]) return false;
        if (cur[index]) return true;
        cur[index] = true;
        for (int i : from[index]) {
            if (findCircle(i, from, cur, value)) {
                return true;
            }
        }
        cur[index] = false;
        value[index] = true;
        return false;
    }
}
