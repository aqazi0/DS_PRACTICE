package Recursion;

import java.util.*;
class print {
    public static void print_forward(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print_forward(n-1);
        System.out.print(n+" ");
    }
    public static void print_backward(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print_backward(n-1);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        print_forward(n);
        System.out.println();
        print_backward(n);
        in.close();
    }
}
