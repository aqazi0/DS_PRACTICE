// import java.util.*;
// class Minimum_no_of_Jumps {
//     public static int jumps(int[] a){
//         if(a.length==0)
//             return 0;
//         int i=0, max=0, n=1, k=i+a[i];
//         while(k<a.length-1){
//             if(k==i)
//                 return -1;
//             max=i+1;
//             for(int j=i+1;j<=k;j++){
//                 if(j+a[j]>=max+a[max])
//                         max=j;
//                 }
//             i=max;
//             k=i+a[i];
//             n++;
//         }
//         return n;
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
//         System.out.println(jumps(a));
//         in.close();
//     }    
// }


// Optimized Approach O(n)


import java.util.*;
class Minimum_no_of_Jumps {
    public static int jumps(int[] a){
        if(a.length==0)
            return 0;
        int i=0, max=0, n=1, k=i+a[i];
        while(k<a.length-1){
            if(k==i)
                return -1;
            max=i+1;
            for(int j=i+1;j<=k;j++){
                if(j+a[j]>=max+a[max])
                        max=j;
                }
            i=max;
            k=i+a[i];
            n++;
        }
        return n;
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
        System.out.println(jumps(a));
        in.close();
    }    
}
