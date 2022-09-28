package Recursion;
import java.util.*;
class Generate_all_Balanced_Parentheses {
    public static void solve(int o, int c, String s){
        if(o==0&&c==0){
            System.out.println(s);
            return;
        }
        if(o>0){
            solve(o-1, c, s+"(");
        }
        if(c>o)
        {
            solve(o, c-1, s+")");
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        solve(n, n, "");
        in.close();
    }
}
