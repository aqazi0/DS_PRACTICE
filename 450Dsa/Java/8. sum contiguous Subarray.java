import java.util.*;
class sum_contiguous_Subarray {
    public static void sum_Subarray(int[] a){

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
        sum_Subarray(a);
        in.close();
    }
}
