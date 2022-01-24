import java.util.*;
class maximum_product_subarray {
    public static long maxProduct(int[] a){
        int l=1, r=1, max=a[0];
        for(int i=0;i<a.length;i++){
            l=l*a[i];
            r=r*a[a.length-i-1];
            max=Math.max(max, Math.max(l,r));
            if(l==0)
                l=1;
            if(r==0)
                r=1;
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
        System.out.println(maxProduct(a));
        in.close();
    }
}
