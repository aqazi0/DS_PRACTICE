import java.util.*;
class Smallest_Subarray_with_sum_greater_than_a_given_value {
    public static int smallestSubWithSum(int a[], int n, int x)
    {
        int i=0, j=0, sum=0, ans=a.length+1;
        while(i<n || sum>=x){
            if(sum>=x){
                ans=Math.min(ans, i-j);
                sum=sum-a[j];
                j++;
            }
            else{            
                sum=sum+a[i];
                i++;
            }
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
