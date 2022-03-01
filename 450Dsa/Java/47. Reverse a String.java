import java.util.*;
class Reverse_a_String {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        char[] s=new char[st.length()];
        int i;
        for(i=0;i<st.length();i++)
            s[i]=st.charAt(i);
            i=0;
            int j=s.length-1;
            while(i<j){
                char ch=s[i];
                s[i++]=s[j];
                s[j--]=ch;
            }
        for(i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
        in.close();
    }    
}
