package edu.northeastern.Leahsu;

/*
17. Mini Parser: Leet code 385
 */
public class MiniParser {

    private int i;
    public class NestedInteger {
        public NestedInteger deserialize(String s){
            return dfs(s);
        }

        public void add(NestedInteger dfs) {
        }

        public void setInteger(int i) {
        }
    }

    private NestedInteger dfs(String s) {
        boolean negative = false;
        if(s.charAt(i) == '['){
            NestedInteger r = new NestedInteger();
            i++;
            while (s.charAt(i) != ']'){
                if(s.charAt(i) == ','){
                    i++;
                }else{
                    r.add(dfs(s));
                }
            }i++;
            return r;
        }else{
            if(s.charAt(i)== '-'){
                negative = true;
                i++;
            }
            int num=0;
            while (i<s.length() && Character.isDigit(s.charAt(i))){
                num *=10;
                num +=s.charAt(i)-'0';
                i++;
            }
            NestedInteger r = new NestedInteger();
            r.setInteger(negative ? -num : num);
            return r;
                
            }
        }
    }

