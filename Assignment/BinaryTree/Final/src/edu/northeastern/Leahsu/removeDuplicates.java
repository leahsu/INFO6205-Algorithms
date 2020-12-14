package edu.northeastern.Leahsu;

/*Q3
Given a string s, a k duplicate removal consists of choosing k adjacent and equal letters from s and
removing them causing the left and the right side of the deleted substring to concatenate together.
*/

public class removeDuplicates {
    public String removeDuplicates(String s, int k) {

        StringBuilder sb = new StringBuilder(s);
        int cnt[] = new int[sb.length()];
        for (int i = 0; i < sb.length(); ++i) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                cnt[i] = 1;
            }
            else {
                cnt[i] = cnt[i - 1] + 1;
                if (cnt[i] == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
        }
        return sb.toString();
    }
}
