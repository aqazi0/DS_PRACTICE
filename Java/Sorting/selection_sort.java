// Time Complexity	 
// Best	O(n2)
// Worst	O(n2)
// Average	O(n2)
// Space Complexity	O(1)

import java.util.*;
public class selection_sort {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int min;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j])
                    min=j;
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");
        in.close();
    }
}
