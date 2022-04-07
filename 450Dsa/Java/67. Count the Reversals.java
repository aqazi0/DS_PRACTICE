import java.util.*;
class Count_the_Reversals {
    public static int countRev (String s)
    {
        // your code here     
    int n=s.length(), o=0, c=0;
    if(n%2!=0)
        return -1;
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='{'){
            o++;
        }
        if(ch=='}'){
            if(o>0)
                o--;
            else
                c++;
        }
    }
    int ans=o/2+c/2;
    if(o%2==0)
        return ans;
        return ans+2;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(countRev(s));
        in.close();
    }
}
