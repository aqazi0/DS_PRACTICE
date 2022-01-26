//to be done using hashing
import java.util.*;
class Array_Subset_of_another_array  {
    public static boolean Issubset(int[] a, int[] b){
        int i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<a.length && j<b.length){
            if(a[i]==b[j])
            {
                j++;
                if(j==b.length)
                    return true;
            }
            i++;
        }
        return false;
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
        System.out.println("Enter n");
        int n=in.nextInt();
        System.out.println("Enter numbers in array");
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        System.out.println(Issubset(a, b));
        in.close();
    }
}
