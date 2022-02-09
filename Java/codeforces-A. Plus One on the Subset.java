import java.util.*;
class Plus_One_on_Subset {
    public static int MinOp(int[] a, int n){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        return max-min;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0; i<n; i++){
                a[i]=in.nextInt();
            }
            System.out.println(MinOp(a, n));
        }
        in.close();
    }
}
