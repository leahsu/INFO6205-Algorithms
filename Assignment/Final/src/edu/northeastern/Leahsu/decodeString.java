package edu.northeastern.Leahsu;

/*Q7
Given an encoded string, return its decoded string.
*/

public class decodeString {

    public String decodeString(String s) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        char[] ch = s.toCharArray();
        int num = 0;
        int len = s.length();
        while (i < len) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                num = num * 10 + ch[i] - '0';
                i++;
            } else if (ch[i] == '[') {
                int j = i+1, cnt = 1;
                while (j++ < len && cnt > 0) {
                    if (ch[j] == '[') cnt++;
                    else if (ch[j] == ']') cnt--;
                }
                String sub = decodeString(new String(ch, i+1, j-2-i));
                for (int k = 0; k < num; k++) {
                    sb.append(sub);
                }
                i = j;
                num = 0;
            } else {
                num = 0;
                sb.append(ch[i]);
                i++;
            }
        }
        return sb.toString();
    }
}

