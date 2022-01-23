//to be done using hashing
import java.util.*;
class Subarray_with_0_sum {
    public static boolean IsSumZero(int[] a){
        int i, j, s=0;
        for(i=0;i<a.length;i++){
            for(j=i;j<a.length;j++){
                s=s+a[j];
                if(s==0)
                    return true;
            }
            s=0;
        }
        return false;
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
        System.out.println(IsSumZero(a));
        in.close();
    }    
}


