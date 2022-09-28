package Recursion;

import java.util.*;
class Nbit_binary_numbers_having_more_1s_than_0s {
    public static void solve(int n, int n1, int n0,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        solve(n-1,n1+1,n0+0, s+"1");
        if(n1>n0)
        solve(n-1,n1, n0+1, s+"0");
    }
    public static void NBitBinary(int N) {
        solve(N, 0, 0, "");
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        NBitBinary(n);
        in.close();
    }
}
