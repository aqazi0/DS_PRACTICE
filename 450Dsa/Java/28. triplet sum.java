import java.util.*;
class triplet_sum {
    public static boolean find3Numbers(int a[], int n, int X) { 
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            int l=i+1, u=n-1;
            while(l<u){
                if(a[i]+a[l]+a[u]==X){
                    return true;
                }
                else if(a[i]+a[l]+a[u]>X){
                    u--;
                }
                else{
                    l++;
                }
            }
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
        System.out.println(find3Numbers(a, a.length, n));
        in.close();        
    }
    
}
