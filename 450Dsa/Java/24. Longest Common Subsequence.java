//to be done using mapping
import java.util.*;
class Longest_Common_Subsequence {
    public static int LCS(int[] a){
        if(a.length==1)
            return 1;
        Arrays.sort(a);
        int n=0, max=0;
        for(int i=1;i<a.length;i++){
            if((a[i-1]+1)==a[i]){
                n++;
            }
            if(a[i-1]==a[i])
                continue;
            if(n>=max)
                max=n+1;
            if((a[i-1]+1)!=a[i]){
                n=0;
            }
        }
        return max;
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
        System.out.println(LCS(a));
        in.close();
    }
}
