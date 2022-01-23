//to be done using hashing
import java.util.*;
class Count_pairs_with_given_sum {
    public static int getPairsCount(int[] a, int k){
        int c=0; 
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if((a[i]+a[j])==k)
                    c++;
            }
        }
        return c;
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
        System.out.println("Enter k");
        int k=in.nextInt();
        System.out.println(getPairsCount(a, k));
        in.close();
    }
}

// import java.util.*;
// class Count_pairs_with_given_sum {
//     public static int getPairsCount(int[] a, int k){
//         int c=0, l=0, h=a.length-1;
//         Arrays.sort(a);
//         while(l<h){
//             if((a[l]+a[h])==k){
//                 System.out.println(a[l]+"     "+a[h]);
            
//                 if(a[l]==a[h])
//                 {
//                     c=c+((h-l)*((h-l)+1))/2;
//                     break;
//                 }
//                 c++;
//                 int t=h-1;
//                 while(a[h]==a[t]){
//                     c++;
//                     t--;
//                 }
//                 int p=l+1;
//                 while(a[l]==a[p+1]){
//                     c++;
//                     p++;
//                 }
//                 h=t+1;
//                 l=p-1;
//                 l++;
//             }
//             else if((a[l]+a[h])>k){
//                 h--;
//             }
//             else{
//                 l++;
//             }
//         }
//         return c;
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
//         System.out.println("Enter k");
//         int k=in.nextInt();
//         System.out.println(getPairsCount(a, k));
//         in.close();
//     }
// }