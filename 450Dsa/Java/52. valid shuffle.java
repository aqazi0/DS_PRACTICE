import java.util.*;
class valid_shuffle {
    public static boolean check(String s, String s1, String s2){
        s1=s1+s2;
        if(s1.length()!=s.length())
            return false;
        HashMap<Character, Integer> a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(a.containsKey(s.charAt(i))==false)
                a.put(s.charAt(i), 1);
            else
                a.put(s.charAt(i), a.get(s.charAt(i))+1);
        }
        for(int i=0;i<s1.length();i++){
            if(a.containsKey(s1.charAt(i))==false)
                return false;
            else if(a.get(s1.charAt(i))==0)
                return false;
            else
                a.put(s1.charAt(i), a.get(s1.charAt(i))-1);
        }
        return true;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s1=in.next();
        String s2=in.next();
        if(check(s,s1,s2))
            System.out.println("Valid Shuffle");
        else
            System.out.println("Not a valid shuffle");
        in.close();
    }
}
