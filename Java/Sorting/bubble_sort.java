// Time Complexity	 
// Best	O(n)
// Worst	O(n2)
// Average	O(n2)
// Space Complexity	O(1)
import java.util.*;
class bubble_sort
{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int f=0;
        for(int i=0;i<n-1;i++){
            f=0;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    f=1;
                }
            }
            if(f==0)
            break;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"  ");
        in.close();
    }
}