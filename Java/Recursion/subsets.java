package Recursion;
import java.util.*;
class subsets {
    static ArrayList<String> ans=new ArrayList<>();
    public static void print_subsets(String s, String s1){
        if(s==""){
            ans.add(s1);
            return;
        }
        String st="";
        if(s.length()==1){
            st="";
        }
        else{
            st=s.substring(1);
        }
        print_subsets(st,s1);
        print_subsets(st, s1+s.charAt(0));
        s=st;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st=in.next();
        print_subsets(st, "");
        System.out.println(ans);
        in.close();
    }
}



class integer_subsets {
    public static void get(List<List<Integer>> ans, ArrayList<Integer> arr, ArrayList<Integer> a, int n){
        if(n==arr.size()){
            ans.add(a);
            return;
        }
        get(ans, arr,new ArrayList<>(a), n+1);
        a.add(arr.get(n));
        get(ans, arr, new ArrayList<>(a), n+1);
    }
    public static List<List<Integer>> get_subsets(ArrayList<Integer> arr, int t){
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        get(ans, arr, a, 0);
        return ans;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int t=in.nextInt();
            a.add(t);
        }
        System.out.println(get_subsets(a, n));
        in.close();
    }
}
