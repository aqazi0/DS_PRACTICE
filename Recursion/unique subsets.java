package Recursion;

import java.util.*;
class unique_subsets {
    static ArrayList<String> arr=new ArrayList<>();
    public static void print_subsets(String st, String st1){
        if(st==""){
            if(arr.contains(st1)){
            }
            else{
                arr.add(st1);
                System.out.println(st1);
            }
            return;
        }
        String k="";
        if(st.length()==1){
            k="";
        }
        else{
            k=st.substring(1);
        }
        print_subsets(k, st1);
        print_subsets(k, st1+st.charAt(0));
        st=k;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        print_subsets(st, "");
        in.close();
    }
}
