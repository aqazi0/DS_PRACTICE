import java.util.*;
class Reverse_array{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] a= new int[10];
        System.out.println("Enter 10 Elements");
        for(int i=0;i<10;i++){
            a[i]=in.nextInt();
        }
        int l=0, u=9,p;
        while(l<u){
            p=a[l];
            a[l++]=a[u];
            a[u--]=p;
        }
        System.out.println("Reversed elements are :");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
        in.close();
    }
}