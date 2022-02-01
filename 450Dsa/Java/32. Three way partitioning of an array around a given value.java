import java.util.*;
class Three_way_partitioning_of_an_array_around_a_given_value {
    public static void print(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");
    }
    public static void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void threeWayPartition(int arr[], int n, int a, int b)
    {
        int l=0, m=0, h=n-1;
        while(m<=h){
            if(arr[m]<a){
                swap(arr, l ,m);
                l++;
                m++;
            }
            else if(arr[m]>b){
                swap(arr, m, h);
                h--;
            }
            else{
                m++;
            }
        }
        print(arr);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m");
        int m=in.nextInt();
        System.out.println("Enter numbers in array");
        int[] arr=new int[m];
        for(int i=0;i<m;i++)
            arr[i]=in.nextInt();
        System.out.println("Enter a");
        int a=in.nextInt();
        System.out.println("Enter b");
        int b=in.nextInt();
        threeWayPartition(arr, m, a, b);
        in.close();
    }
}
