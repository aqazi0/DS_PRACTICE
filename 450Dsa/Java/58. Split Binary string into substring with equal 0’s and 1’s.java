import java.util.*;
class Split_Binary_string {
    static int maxSubStr(String s)
    {
        int ans=0;
        char ch=s.charAt(0);
        int k=0, c1=0, c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                k=1;
                ch=s.charAt(i);
            }
            if(k==0)
                c1++;
            if(k==1)
                c2++;
            if(c1==c2 || k==1 && s.charAt(i)!=ch){
                if(i!=s.length()-1)
                    ch=s.charAt(i+1);
                if(c1>=c2)
                    ans++;
                c1=0;
                c2=0;
                k=0;
            }
        }
        if(ans==0)
            return -1;
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        System.out.println(maxSubStr(st));
        in.close();
    }
}
