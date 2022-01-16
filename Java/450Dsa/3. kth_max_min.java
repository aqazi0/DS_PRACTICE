import java.util.*;
class kth_max_min {
    static int kth_min(int[] a,int l, int u, int k){
        return 0;
    }
    static int kth_max(int[] a,int l, int u, int k){
        return 0;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter 10 elements");
        for(int i=0;i<10;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter k");
        int k=in.nextInt();
        System.out.println(kth_min(a, 0, 9, k));
        System.out.println(kth_max(a, 0, 9, k));
        in.close();
    }
}
