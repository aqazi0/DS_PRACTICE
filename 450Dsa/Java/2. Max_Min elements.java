import java.util.*;
class Max_Min{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter 10 elements");
        for(int i=0;i<10;i++){
            a[i]=in.nextInt();
        }
        int Max= a[0];
        int Min= a[0];
        for(int i=1;i<10;i++){
            if(a[i]>Max)
                Max=a[i];
            if(a[i]<Min)
                Min=a[i];
        }
        System.out.println("Maximum : "+ Max);
        System.out.println("Minimum : "+ Min);
        in.close();
    }
}
