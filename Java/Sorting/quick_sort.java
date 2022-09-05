// Time Complexity
// Best	O(n*log n)
// Worst	O(n2)
// Average	O(n*log n)
// Space Complexity	O(log n)

import java.util.*;
class quick_sort {
    public static void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static int partition(int[] a, int l, int h){
        int pivot=a[h];
        int i=-1;
        for(int j=0;j<h;j++){
            if(a[j]<pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a,i+1,h);
        return i+1;
    }
    public static void sort(int[] a, int l, int h){
        if(l<h){
            int k=partition(a, l, h);
            sort(a, l, k-1);
            sort(a, k+1, h);
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
