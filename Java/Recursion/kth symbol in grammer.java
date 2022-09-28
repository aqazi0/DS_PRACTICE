package Recursion;
import java.util.*;
import java.lang.Math;
class kth_symbol_in_grammar {
    public static int solve(int n, int k){
        if(n==1||k==1)
            return 0;
        int mid=(int)Math.pow(2, n-1)/2;
        if(k<=mid){
            return solve(n-1, k);
        }
        else{
            int t = solve(n-1, k-mid);
            if(t==0)
                return 1;
            else
                return 0;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        System.out.print(solve(n,k));
        in.close();
    }
}
