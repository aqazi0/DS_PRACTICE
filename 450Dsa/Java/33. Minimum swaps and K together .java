import java.util.*;
class Minimum_swaps_and_K_together  {
    public static int minSwap(int[] a, int n, int k) {
        int i=0, j, c=0, b=0;
            for(i=0;i<n;i++){
                if(a[i]<=k)
                    c++;
            }
            for(i=0;i<c;i++){
                if(a[i]>k)
                    b++;
            }
            i=0;
            j=c;
            int ans=b;
            while(j<n){
                System.out.print(ans+"   ");
                if(a[i]>k)c--;
                if(a[j]>k)c++;
                ans=Math.min(ans, c);
                i++;j++;
            }
            System.out.println();
            return ans;
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
