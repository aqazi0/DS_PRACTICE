import java.util.*;
class reverse_algorithm {
    public static void print(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");
        System.out.println();
    }
    public static void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void reverse(int[] a, int l, int h){
        h--;
        while(l<=h){
            swap(a, l++, h--);
        }
    }
    public static void left_rotate(int[] a, int d){
        if (d!=0);
            reverse(a, 0, d);
            reverse(a, d, a.length);
            reverse(a, 0, a.length);
    }
    public static void main(String args[]){
        int a[]={1, 4, 6, 1, 9, 8, 3, 2, 6};
        int d=3;
        left_rotate(a,d);
        print(a);
    }
}
