import java.util.*;
class Palindrome_String {
    public static int isPalindrome(String S) {
        String s1="";
        int n=S.length();
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            s1=ch+s1;
        }
        if(s1.equals(S))
            return 1;
        else
            return 0;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s=in.next();
        System.out.print(isPalindrome(s));
        in.close();
    }
}
