import java.util.*;
class Median_of_two_sorted_arrays_of_same_size {
    static int getMedian(int a[], int b[], int n){
        int i=0, j=0, c=1, n1=-1, n2=-1;
        while(i<n && j<n && c<=n+1){
            if(a[i]>=b[j]){
                if(c==n)
                    n1=b[j];
                if(c==n+1)
                    n2=b[j];
                j++;
            }
            else{
                if(c==n)
                    n1=a[i];
                if(c==n+1)
                    n2=a[i];
                i++;
            }
            c++;
        }
        if(i==n && n2==-1)
            n2=b[j];
        if(j==n && n2==-1)
            n2=a[i];
        return (n1+n2)/2;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size");
        int m=in.nextInt();
        System.out.println("Enter numbers in array 1");
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter numbers in array 2");
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }
        System.out.println(getMedian(a, b, m));
        in.close();
    }
}
