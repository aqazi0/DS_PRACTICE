// import java.util.*;
// class alternating_positive_and_negative {
//     public static void swap(int[] a, int i, int j){
//         int t=a[i];
//         a[i]=a[j];
//         a[j]=t;
//     }
//     public static void print(int[] a){
//         for(int i=0;i<a.length;i++)
//             System.out.print(a[i]+"  ");
//         System.out.println();
//     }
//     public static void rotate(int[] a, int i, int l){
//         int n=l-i, j;
//         int[] k=new int[n];
//         for(j=0;j<n;j++)
//             k[j]=a[i+j];
//         for(j=l;j<a.length;j++){
//             a[i++]=a[j];
//         }
//         for(j=i;j<a.length;j++){
//             a[j]=k[j-i];
//         }
//     }
//     public static void arrange(int[] a){
//         int i=0;
//         while(i<a.length){
            
//         }
//     }
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter no of elements");
//         int n=in.nextInt();
//         int[] a = new int[n];
//         System.out.println("Enter elements");
//         for(int i=0;i<n;i++){
//             a[i]=in.nextInt();
//         }
//         arrange(a);
//         in.close();
//     }
// }

import java.util.*;
class alternating_positive_and_negative {
    public static void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void print(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");
        System.out.println();
    }
    public static void arrange(int[] a){
        int i=0;
        while(i<a.length){
            
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        arrange(a);
        in.close();
    }
}
