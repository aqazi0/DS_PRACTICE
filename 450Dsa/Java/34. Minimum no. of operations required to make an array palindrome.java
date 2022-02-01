import java.util.*;
class Minimum_no_of_operations_required_to_make_an_array_palindrome
{
	public static int findMinOps(int[] a, int n)
	{
        if(a.length<=1)
            return 0;
        int i=0, j=n-1, ans=0;
        while(i<j){
            if(a[i]==a[j]){
                i++;
                j--;
            }
            else if(a[i]>a[j]){
                ans++;
                j--;
                a[j]=a[j]+a[j+1];
            }
            else{
                ans++;
                i++;
                a[i]=a[i]+a[i-1];
            }
        }
        return ans;
	}
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=in.nextInt();
            int[] a = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Count of minimum operations is "+
        findMinOps(a, a.length));
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        in.close();
    }
}
