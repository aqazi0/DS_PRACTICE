package Recursion;

import java.util.*;
class tower_of_hanoi {
    public static int solve(int n, int s, int h, int d){
        if(n==1){
            System.out.println("Main plate "+n+" from "+s+" to "+d);
            return (int)Math.pow(2,n)-1;
        }
        solve(n-1, s, d, h);
        System.out.println("Main plate "+n+" from "+s+" to "+d);
        solve(n-1, h, s, d);
        return (int)Math.pow(2,n)-1;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=solve(n, 1, 2, 3);
        System.out.println(t);
        in.close();
    }
}
