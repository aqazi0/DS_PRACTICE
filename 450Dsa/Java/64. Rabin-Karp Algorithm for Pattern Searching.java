import java.util.*;
class Rabin_Karp_Algorithm{
    public static int hash(String p){
        int h=0, n=p.length();
        for(int i=0;i<n;i++){
            h=h+p.charAt(i);
        }
        return h;
    } 
    public static boolean search(String s, String p){
        long h=hash(p);
        int n=s.length(), m=p.length();
        long g;
        g=hash(s.substring(0, m));
        for(int i=0;i<n-m+1;i++){
            String s1=s.substring(i,i+m);
            if(g==h){
                if(s1.equals(p)){
                    return true;
                }
            }
            if(i!=n-m)
            g=g-s.charAt(i)+s.charAt(i+m);
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
