import java.util.*;
class Kadane {
    public static int kadane(int[] a){
        int max_sum=a[0];
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(sum>max_sum)
                max_sum=sum;
            if(sum<=0)
                sum=0;
        }
        return max_sum;
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
        System.out.println(kadane(a));
        in.close();
    }
}
