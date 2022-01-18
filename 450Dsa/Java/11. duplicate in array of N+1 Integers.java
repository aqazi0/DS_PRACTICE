import java.util.*;
class DuplicateI {
    public static int findduplicate(int[] a){
        int l=1, h=a.length-1;
        while(l<h){
            int mid=(l+h)/2;
            int c=0;
            for(int i=0;i<a.length;i++)
                if(a[i]<=mid)
                    c++;
            System.out.println(l +"   "+h);
            if(c>mid)
                h=mid;
            else
                l=mid+1;
        }
        return l;
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
        System.out.println(findduplicate(a));
        in.close();
    }    
}
