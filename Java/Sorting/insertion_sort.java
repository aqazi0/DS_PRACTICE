// Time Complexity	 
// Best	O(n)
// Worst	O(n2)
// Average	O(n2)
// Space Complexity	O(1)

import java.util.*;
class insertion_sort {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int i=1, j=0;
        in.close();
        for(;i<n;i++){
            int k=a[i];
            for(j=i-1;j>=0 && a[j]>k;j--){
                a[j+1]=a[j];
            }
            a[j+1]=k;
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
