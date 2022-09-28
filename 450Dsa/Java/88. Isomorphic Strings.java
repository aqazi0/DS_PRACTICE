import java.util.*;
class Isomorphic_Strings {
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        HashMap<Character ,Character> a=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(a.containsKey(str1.charAt(i))==false){
                a.put(str1.charAt(i), str2.charAt(i));
            }
            else{
                if(a.get(str1.charAt(i))!=str2.charAt(i))
                    return false;
            }
        }
        HashMap<Character ,Character> b=new HashMap<>();
        for(int i=0;i<str2.length();i++){
            if(b.containsKey(str2.charAt(i))==false){
                b.put(str2.charAt(i), str1.charAt(i));
            }
            else{
                if(b.get(str2.charAt(i))!=str1.charAt(i))
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        System.out.print(areIsomorphic(s1, s2));
        in.close(); 
    }
}
