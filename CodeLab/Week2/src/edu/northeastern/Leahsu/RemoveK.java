package edu.northeastern.Leahsu;

/*
19. Remove K Digits: Leet code 402
 */
public class RemoveK {
    public String removeK(String num, int k){
        int remain = num.length()-k;
        char[] numArray = num.toCharArray();
        char[] res = new char[remain];
        int index=0;
        for(int i=0; i<numArray.length; i++){
            while ((numArray.length-i > remain-index) && (index > 0 && numArray[i] < res[index - 1])) index--;
            if (index < remain) res[index++]= numArray[i];
        }
        index=-1;
        while (++index<remain){
            if(res[index] != '0'){
                break;
            }
            String s = new String(res).substring(index);
            return s.length() == 0 ? "0" : s;
        }

        return num;
    }
}
