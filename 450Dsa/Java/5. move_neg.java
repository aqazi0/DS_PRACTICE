import java.util.*;
class move_neg {
    static public void swap(int[] a, int i, int j){
        int p=a[i];
        a[i]=a[j];
        a[j]=p;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter 10 elements");
        for(int i=0;i<10;i++)
            a[i]=in.nextInt();
        int l=0, h=9;
        while(l<=h){
            if(a[l]<0){
                l++;
            }
            else{
                swap(a, l, h);
                h--;
            }
        }
        System.out.println("Result :");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
        in.close();
    }
}
