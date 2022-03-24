package Recursion;
import java.util.*;
class sort_using_recursion {
    public static void insert(ArrayList<Integer> a, int temp){
        if(a.size()==0||a.get(a.size()-1)<=temp){
            a.add(temp);
            return;
        }
        int index=a.size()-1;
        int val=a.get(index);
        a.remove(index);
        insert(a, temp);
        a.add(val);
    }
    public static void sort(ArrayList<Integer> a){
        if(a.size()==1){
            return;
        }
        int index=a.size()-1;
        int temp=a.get(index);
        a.remove(index);
        sort(a);
        insert(a, temp);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            int temp=in.nextInt();
            a.add(temp);
        }
        sort(a);
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
        in.close();
    }
}
