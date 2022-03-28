package Recursion;

import java.util.*;
class permutation_with_spaces {
    public static void pws(String s, String s1){
        if(s.length()==1||s.length()==0){
            System.out.println(s1+s);
            return;
        }
        pws(s.substring(1), s1+s.charAt(0));
        pws(s.substring(1), s1+s.charAt(0)+" ");
        s=s.substring(1);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        pws(st,"");
        in.close();
    }
}
