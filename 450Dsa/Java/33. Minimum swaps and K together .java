import java.util.*;
class Minimum_swaps_and_K_together  {
    public static void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static int minSwap(int[] a, int n, int k) {
        int i=0, j=0, c=0, f=0;
        for(i=0;i<n;i++){
            if(f==1 && a[i]>k){
                j=i;
                break;
            }
            if(a[i]<=k)
                f=1;
        }
        while(i<n){
            if(a[i]<=k){
                swap(a, i, j);
                c++;
                j++;
            }
            i++;
        }
        return c;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m");
        int m=in.nextInt();
        System.out.println("Enter numbers in array");
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter k");
        int k=in.nextInt();
        System.out.println(minSwap(arr, m, k));
        in.close();
    }
}
