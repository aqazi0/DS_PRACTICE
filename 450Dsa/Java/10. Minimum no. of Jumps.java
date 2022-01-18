import java.util.*;
class Minimum_no_of_Jumps {
    public static int jumps(int[] a){
        int i=0, max=0, n=0;
        while(i<a.length-1){
            int k=i+a[i];
            max=i+1;
            if(k>a.length-1){
                n++;
                break;
            }
            for(int j=i+1;j<k;j++){
                if(a[max]>a[j])
                max=j;
            }
            System.out.println(max);
            i=i+max;
            n++;
        }
        return n;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter no of elements");
        int n=in.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(jumps(a));
        in.close();
    }    
}
