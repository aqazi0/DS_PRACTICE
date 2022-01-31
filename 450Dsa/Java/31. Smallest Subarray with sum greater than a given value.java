import java.util.*;
class Smallest_Subarray_with_sum_greater_than_a_given_value {
    public static int smallestSubWithSum(int a[], int n, int x)
    {
        int sum, minc=n+1, c=0;
        for(int i=0;i<n;i++){
            sum=a[i];
            c=1;
            if(sum>=x){
                return c;
            }
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                c++;
                if(sum>=x){
                    break;
                }
            }
            if(c<minc && sum>=x){
                minc=c;
            }
        }
        return minc;
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
        System.out.println("Enter n");
        int n=in.nextInt();
        int ans=smallestSubWithSum(a, m, n);
        if(ans==m+1)
            System.out.println("Not Possible");
        else
            System.out.println(ans);
        in.close();        
    }
}
