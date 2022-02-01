import java.util.*;
class Minimize_the_Heights_II {
    public static int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
        int ans =a[n-1]-a[0];
        int l=a[n-1]-k, f=a[0]+k;
        for(int i=0; i<n-1;i++){
            int min=Math.min(f, a[i+1]-k);
            int max=Math.max(l, a[i]+k);
            if(min<0)
                continue;
            ans=Math.min(ans, max-min);
        }
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
        System.out.println(getMinDiff(arr, m, k));
        in.close();
    }
}
