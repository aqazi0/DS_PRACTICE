// Time Complexity	 
// Best	O(n+k)
// Worst	O(n+k)
// Average	O(n+k)
// Space Complexity	O(max)

import java.util.*;
class Counting_sort {
    public static void sort(int[] a, int n){
        int max=a[0];
        for(int i=1;i<n;i++)
            max=Math.max(a[i], max);
        int[] h=new int[max+1];
        for(int i=0;i<n;i++){
            h[a[i]]++;
        }
        for(int i=1;i<h.length;i++){
            h[i]=h[i]+h[i-1];
        }
        int[] out=new int[n+1];
        for(int i=0;i<n;i++){
            out[h[a[i]]-1]=a[i];
            h[a[i]]--;
        }
        for(int i=0;i<n;i++)
            a[i]=out[i];
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        sort(a, n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        in.close();
    }
}
