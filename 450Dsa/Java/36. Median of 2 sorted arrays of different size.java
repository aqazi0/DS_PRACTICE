import java.util.*;
class Median_of_two_sorted_arrays_of_different_size {
    static double getMedian(int a[], int b[], int n, int m){
        int i=0, j=0, c=1, n1=-1, n2=-1, k=0;
        if((n+m)%2!=0)
            k=1;
        while(i<n && j<m && c<=n+1){
            if(a[i]>=b[j]){
                if(c==(n+m)/2)
                    n2=b[j];
                if(c==((n+m)/2+1))
                    n1=b[j];
                j++;
            }
            else{
                if(c==(n+m)/2)
                    n2=a[i];
                if(c==((n+m)/2+1))
                    n1=a[i];
                i++;
            }
            c++;
        }
        if(i==n && n2==-1)
            n2=b[j];
        if(i==n && n1==-1){
            
            n2=b[j];
        }
        if(j==n && n2==-1)
            n2=a[i];
        if(j==n && n1==-1){
            n2=a[i];
        }
        if(k==1)
            return n1;
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
