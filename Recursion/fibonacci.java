package Recursion;
import java.util.*;
class fibonacci_series {
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fibonacci(n));
        in.close();
    }
}
