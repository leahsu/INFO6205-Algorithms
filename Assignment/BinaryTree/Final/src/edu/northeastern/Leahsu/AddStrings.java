package edu.northeastern.Leahsu;

/*Q1
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
*/

public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        while (n1 >= 0 || n2 >= 0) {
            int val1 = n1 >= 0 ? num1.charAt(n1) - '0' : 0;
            int val2 = n2 >= 0 ? num2.charAt(n2) - '0' : 0;
            int temp = val1 + val2 + carry;
            if (temp > 9){
                carry = 1;
                sb.append(temp - 10);
            }
            else {
                carry = 0;
                sb.append(temp);
            }
            n1--;
            n2--;
        }

        if (carry == 1)
            sb.append(1);

        return sb.reverse().toString();
    }

}
