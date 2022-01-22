import java.util.*;
class Subarray_with_0_sum {
    public static boolean IsSumZero(int[] a){
        int i=0, s=0;
        while(i<a.length){
            s=s+a[i];
            if(s==0)
                return true;
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


