// Time Complexity	 
// Best	O(n+k)
// Worst	O(n2)
// Average	O(n)
// Space Complexity	O(n+k)

import java.util.*;
class bucket_sort {
    public static void sort(Float[] a, int n){
        if(n<=0)
            return;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] h=new ArrayList[n];
        for(int i=0;i<n;i++)
            h[i]=new ArrayList<Float>();
        for(int i=0;i<n;i++){
            int idx=(int)Math.floor(a[i]*n);
            h[idx].add(a[i]);
        }
        for(int i=0;i<n;i++)
            Collections.sort(h[i]);
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<h[i].size();j++){
                a[k++]=h[i].get(j);
            }
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Float[] a=new Float[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextFloat();
        }
        sort(a, n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        in.close();
    }
}
