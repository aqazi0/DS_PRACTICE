import java.util.*;
class Longest_Common_Prefix{
    public static String longestCommonPrefix(String[] strs) {
        String st="";
        char ch;
        int k=0, f=0, c=1;
        while(true){
            if(strs[0].length()==k){
                break;
            }
            ch=strs[0].charAt(k);
            c=1;
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()>k){
                    if(strs[i].charAt(k)==ch){
                        c++;
                    }
                    else{
                        f=1;
                        break;
                    }
                }
                else{
                    f=1;
                    break;
                }
            }
            if(c==strs.length)
                st+=ch;
            k++;
            if(f==1)
                break;
        }
        return st;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            st[i]=in.next();
        }
        System.out.print(longestCommonPrefix(st));
        in.close();
    }
}