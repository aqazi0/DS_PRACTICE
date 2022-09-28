package Recursion;

import java.util.*;
class Permutation_with_Case_Change {
    public static void permutation_change(String s, String s1){
        if(s==""){
            System.out.print(s1+" ");
            return;
        }
        String st="";
        if(s.length()>1)
            st=s.substring(1);
        permutation_change(st, s1+s.charAt(0));
        if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            permutation_change(st, s1+((char)(s.charAt(0)+32)));
        }
        if(s.charAt(0)>=97 && s.charAt(0)<='z'){
            permutation_change(st, s1+((char)(s.charAt(0)-32)));
        }
        s=st;
    }
    public static void permutation(String s, String s1){
        if(s==""){
            System.out.print(s1+" ");
            return;
        }
        String st="";
        if(s.length()>1)
            st=s.substring(1);
        permutation(st, s1+s.charAt(0));
        permutation(st, s1+((char)(s.charAt(0)-32)));
        s=st;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        permutation(s,"");
        System.out.println();
        permutation_change(s,"");
        in.close();
    }
}
