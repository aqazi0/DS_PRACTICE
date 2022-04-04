import java.util.*;
class Longest_Prefix_Suffix {
    public static int lps(String s){
        int t=0, max=0, i=1, f=i;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(t)){
                if(max==0)
                    f=i;
                max++;
                t++;
                i++;
            }
            else{
                if(t!=0){
                    t=0;
                    i=f+1;
                }
                else
                    i++;
                max=0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(lps(s));
        in.close();
    }
}
