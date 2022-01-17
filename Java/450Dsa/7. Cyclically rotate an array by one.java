import java.util.*;
class Cyclically_rotate_array_by_one {
    public static void rotate(int[] a){
        int k=a[9], i=9;
        while(i>=1){
            a[i]=a[i-1];
            i--;
        }
        a[0]=k;
        for(i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=in.nextInt();
        rotate(a);
        in.close();
    }
}
