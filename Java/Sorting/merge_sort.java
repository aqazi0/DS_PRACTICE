// Time Complexity	 
// Best	O(n*log n)
// Worst	O(n*log n)
// Average	O(n*log n)
// Space Complexity	O(n)

import java.util.*;
class merge_sort {
    public static void merge(int[] a, int l, int m, int h){
        int[] lf=new int[m-l+1];
        int[] rt=new int[h-m];
        for(int i=0;i<m-l+1; i++)
            lf[i]=a[l+i];
        for(int i=0;i<h-m; i++)
            rt[i]=a[m+1+i];
        int i=0, j=0, k=l;
        while(i<lf.length && j<rt.length){
            if(lf[i]<=rt[j])
                a[k]=lf[i++];
            else
                a[k]=rt[j++];
            k++;
        }
        while(i<lf.length){
            a[k]=lf[i++];
            k++;
        }
        while(j<rt.length){
            a[k]=rt[j++];
            k++;
        }
    }
    public static void sort(int[] a, int l, int h){
        if(l<h){
            int m=(l+h)/2;
            sort(a, l, m);
            sort(a, m+1, h);
            merge(a, l, m, h);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        sort(a, 0, n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        in.close();
    }
}
