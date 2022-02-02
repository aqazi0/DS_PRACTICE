import java.util.*;
class Median_of_two_sorted_arrays_of_different_size {
    static double getMedian(int a[], int b[], int n, int m){
        int i=0, j=0, c=1, n1=Integer.MIN_VALUE, n2=Integer.MIN_VALUE, k=0, mid=(n+m)/2;
        if((n+m)%2!=0)
            k=1;
        if(n==0 && k==1)
            return b[mid];
        if(m==0 && k==1)
            return a[mid];
        while(i<n && j<m && c<=mid+1){
            if(a[i]>=b[j]){
                if(c==mid)
                    n1=b[j];
                if(c==(mid+1))
                    n2=b[j];
                j++;
            }
            else{
                if(c==mid)
                    n1=a[i];
                if(c==(mid+1))
                    n2=a[i];
                i++;
            }
            c++;
        }
        if(i==n && n1==Integer.MIN_VALUE){
            n1=b[mid-n-1];
            n2=b[mid-n];
        }
        else if(i==n && n2==Integer.MIN_VALUE)
            n2=b[j];
        if(j==m && n1==Integer.MIN_VALUE){
            n1=a[mid-n-1];
            n2=a[mid-n];
        }
        else if(j==m && n2==Integer.MIN_VALUE)
            n2=a[i];
        if(k==1)
            return n2;
        else
            return (n1+n2)/2.0;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size");
        int n=in.nextInt();
        System.out.println("Enter numbers in array 1");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter size");
        int m=in.nextInt();
        System.out.println("Enter numbers in array 2");
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }
        System.out.println(getMedian(a, b, n, m));
        in.close();
    }
}
