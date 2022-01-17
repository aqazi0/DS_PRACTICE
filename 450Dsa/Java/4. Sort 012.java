import java.util.*;
class Sort_012 {
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
        int l=0, m=0, h=9;
        while(m<=h){
            if(a[m]==0){
                swap(a, l, m);
                l++;
                m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                swap(a,m,h);
                h--;
            }
        }
        System.out.println("Sorted elements :");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
        in.close();
    }
}
