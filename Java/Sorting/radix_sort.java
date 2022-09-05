// Time Complexity
// Best	O(n+k)
// Worst	O(n+k)
// Average	O(n+k)
// Space Complexity	O(max) less than counting sort 0-10 for decimal numbers

import java.util.*;
class radix_sort {
    public static void counting_sort(int[] a, int n, int k){
        int[] out=new int[n+1];
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
            temp[i]=(a[i]/k)%10;
        int max=temp[0];
        for(int i=1;i<n;i++){
            if(max<temp[i])
                max=temp[i];
        }
        int[] h=new int[max+1];
        for(int i=0;i<n;i++)
            h[temp[i]]++;
        for(int i=1;i<h.length;i++)
            h[i]=h[i]+h[i-1];
        for(int i=n-1;i>=0;i--){
            out[h[temp[i]]-1]=a[i];
            h[temp[i]]--;
        }
        for(int i=0;i<n;i++)
            a[i]=out[i];
    }
    public static void sort(int[] a, int n){
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max)
                max=a[i];
        }
        int k=1;
        while(max!=0){
            counting_sort(a, n, k);
            k*=10;
            max/=10;
        }
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
