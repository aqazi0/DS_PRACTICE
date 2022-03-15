// Recursive Approach
import java.util.*;
class Knapsack {
    public static int knapsack(int[] wt, int[] val, int W, int n){
        if(W==0||n==0)
            return 0;
        if(wt[n-1]>W)
            return knapsack(wt, val, W, n-1);
        else{
            return Math.max(wt[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] wt=new int[n];
        int[] val=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=in.nextInt();
        for(int i=0;i<n;i++)
            val[i]=in.nextInt();
        int W=in.nextInt();
        System.out.println(knapsack(wt, val, W, n));
        in.close();
    }
}