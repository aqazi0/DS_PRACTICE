import java.util.*;
class Merge_sorted_arrays {
    public static void swap(int[] a, int i, int j){
        int p=a[i];
        a[i]=a[j];
        a[j]=p;
    }
    public static int partition(int[] a, int l, int h){
        int pivot=a[l], i=0;
        for(int j=l+1;j<h;j++){
            if(a[j]<pivot)
                i++;
            }
        return i;
    }
    public static void sort_array(int[] a, int[] b){
        int i=0,j=0;
        while(i<a.length){
            if(a[i]>b[j]){
                {int p=a[i];
                a[i]=b[j];
                b[j]=p;}
                int t=partition(b, 0, b.length);
                int k= b[0];
                for(int x=0;x<t;x++){
                    b[x]=b[x+1];
                }
                b[t]=k;
            }
            i++;
        }
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
        for(i=0;i<b.length;i++)
            System.out.print(b[i]+", ");
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int m,n;
        m=in.nextInt();
        n=in.nextInt();
        int[] a=new int[m];
        System.out.println("Enter elements in A");
        for(int i=0;i<m;i++)
            a[i]=in.nextInt();
        int[] b=new int[n];
        System.out.println("Enter elements in B");
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }        
        Arrays.sort(a);
        Arrays.sort(b);
        sort_array(a,b);
        in.close();
    }    
}
