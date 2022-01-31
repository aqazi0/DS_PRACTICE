import java.util.*;
class Trapping_Rain_water_problem {
    public static long trappingWater(int a[], int n){
        if(n<=2)
            return 0;
        int ans=0;
        int[] L=new int[n];
        int[] R=new int[n];
        L[0]=a[0];
        R[n-1]=a[n-1];
        for(int i=1;i<n;i++){
            L[i]=Math.max(L[i-1], a[i]);
        }
        for(int i=n-2;i>=0;i--){
            R[i]=Math.max(R[i+1], a[i]);
        }
        for(int i=0;i<n;i++){
            ans=ans+Math.min(L[i], R[i])-a[i];
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m");
        int m=in.nextInt();
        System.out.println("Enter numbers in array");
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=in.nextInt();
        }
        System.out.println(trappingWater(a, a.length));
        in.close();        
    }
}
