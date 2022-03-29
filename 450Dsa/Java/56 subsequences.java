import java.util.*;
class subsequence {
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