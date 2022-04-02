import java.util.*;
class Rabin_Karp_Algorithm{
    public static int hash(String p){
        int h=1, n=p.length();
        for(int i=1;i<=n;i++){
            h=h+(i*(int)Math.pow(10, n-i+1));
        }
        return h;
    } 
    public static boolean search(String s, String p){
        int h=hash(p);
        int n=s.length(), m=p.length();
        for(int i=0;i<n-m+1;i++){
            String s1=s.substring(i,i+p.length());
            if(hash(s1)==h){
                if(s1.equals(p)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String p=in.next();
        System.out.print(search(s, p));
        in.close();
    }
}
