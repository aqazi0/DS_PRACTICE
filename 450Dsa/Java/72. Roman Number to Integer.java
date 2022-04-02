import java.util.*;
class Roman_Number_to_Integer {
    public static int romanToDecimal(String str) {
        int ans=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch=='I'){
                if(i==str.length()-1)
                    ans=ans+1;
                else if(str.charAt(i+1)!='I')
                    ans=ans-1;
                else
                    ans=ans+1;
            }
            if(ch=='V'){
                if(i==str.length()-1)
                    ans=ans+5;
                else if(str.charAt(i+1)=='X'||str.charAt(i+1)=='L'||str.charAt(i+1)=='C'||str.charAt(i+1)=='D'||str.charAt(i+1)=='M')
                    ans=ans-5;
                else
                    ans=ans+5;
            }
            if(ch=='X'){
                if(i==str.length()-1)
                    ans=ans+10;
                else if(str.charAt(i+1)=='L'||str.charAt(i+1)=='C'||str.charAt(i+1)=='D'||str.charAt(i+1)=='M')
                    ans=ans-10;
                else
                    ans=ans+10;
            }
            if(ch=='L'){
                if(i==str.length()-1)
                    ans=ans+50;
                else if(str.charAt(i+1)=='C'||str.charAt(i+1)=='D'||str.charAt(i+1)=='M')
                    ans=ans-50;
                else
                    ans=ans+50;
            }
            if(ch=='C'){
                if(i==str.length()-1)
                    ans=ans+100;
                else if(str.charAt(i+1)=='D'||str.charAt(i+1)=='M')
                    ans=ans-100;
                else
                    ans=ans+100;
            }
            if(ch=='D'){
                if(i==str.length()-1)
                    ans=ans+500;
                else if(str.charAt(i+1)=='M')
                    ans=ans-500;
                else
                    ans=ans+500;
            }
            if(ch=='M')
                ans=ans+1000;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(romanToDecimal(s));
        in.close();
    }
}
