import java.util.*;
class count_And_Say {
    public static String fun(String S){
        int c=1;
        String S1="";
        if(S.length()==1)
            return "1"+S;
        for(int i=1;i<S.length();i++){
            char ch=S.charAt(i-1);            
            char ch1=S.charAt(i);
            if(ch==ch1)
                c++;
            else{
                S1=S1+Integer.toString(c)+ch;
                c=1;
            }
            if(i==S.length()-1){
                S1=S1+Integer.toString(c)+ch1;
            }
        }
        return S1;
    }
    public static String countAndSay(int n){
        if(n==1)
            return "1";
        return fun(countAndSay(n-1));
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(countAndSay(n));
        in.close();
    }
}