//to be done using dp

import java.util.*;
class Count_Palindromic_Subsequences {
    static int c=0;
    public static void count(String st, String st1){
        if(st==""){
            String s1="";
            for(int i=0;i<st1.length();i++){
                s1=st1.charAt(i)+s1;
            }
            if(s1.equals(st1)){
                c++;
            }
            return;
        }
        else{
            String st2="";
            if(st.length()>1)
                st2=st.substring(1);
            count(st2, st1);
            count(st2, st1+st.charAt(0));
            st=st2;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        count(st, "");
        System.out.println(c-1);
        in.close();
    }
}
