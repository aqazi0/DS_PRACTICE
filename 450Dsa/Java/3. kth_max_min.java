import java.util.*;
class kth_max_min {
    static public void swap(int[] a, int i, int j){
        int p=a[i];
        a[i]=a[j];
        a[j]=p;
    }
    public static int partition(int[] a, int l, int u){
        int p=a[u], j=l;
        for(int i=l;i<u;i++){
            if(a[i]<p){
                swap(a, i, j);
                j++;
            }
        }
        swap(a, j, u);
        return j;
    }
    static int kth_min(int[] a,int l, int u, int k){
        if(k<=u+1 && k>0){
            int r=partition(a, l, u);
            if(r+1==k){
                return a[r];
            }
            else if(r+1>k){
                return kth_min(a, l, r-1, k);
            }
            return kth_min(a, r+1, u, k);
        }
        return -1;
    }
    static int kth_max(int[] a,int l, int u, int k){
        if(k<=u+1 && k>0){
            int r=partition(a, l, u);
            if(r+1==k){
                return a[r];
            }
            else if(r+1>k){
                return kth_max(a, l, r-1, k);
            }
            return kth_max(a, r+1, u, k);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter 10 elements");
        for(int i=0;i<10;i++)
            a[i]=in.nextInt();
        System.out.println("Enter k");
        int k=in.nextInt();
        System.out.println(kth_min(a, 0, 9, k));
        System.out.println(kth_max(a, 0, 9, 10-k+1));
        in.close();
    }
}
