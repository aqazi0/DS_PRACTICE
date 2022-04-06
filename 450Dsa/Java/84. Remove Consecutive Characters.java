import java.util.*;
class Remove_Consecutive_Characters {
    public static String helper(String s,int n){
        if(n==s.length()-1){
        if(n!=0 && s.charAt(n)==s.charAt(n-1))
            return "";
        else
            return Character.toString(s.charAt(n));
        }
        if(n==0)
            return s.charAt(n)+helper(s, n+1);
        if(s.charAt(n)==s.charAt(n-1))
            return ""+helper(s, n+1);
        return s.charAt(n)+helper(s, n+1);
    }
    public static  String removeConsecutiveCharacter(String S){
        String s=helper(S, 0);
        return s;
    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        String s=in.next();
        System.out.println(removeConsecutiveCharacter(s));
        in.close();
    }
}
