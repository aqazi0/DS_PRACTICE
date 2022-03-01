//brute force O(26*n)
// import java.util.*;
// class Duplicate_characters_in_string{
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         String st=in.next();
//         st=st.toLowerCase();
//         for(int i=97;i<123;i++){
//             int c=0;
//             for(int j=0;j<st.length();j++){
//                 char ch=st.charAt(j);
//                 if((int)ch==i)
//                     c++;
//             }
//             if(c>0)
//                 System.out.println((char)i+"-"+c);
//         }
//         in.close();
//     }
// }

//using map O(n)
import java.util.*;
class Duplicate_characters_in_string{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        HashMap<Character, Integer> c=new HashMap<>();
        for(int i=0;i<st.length();i++){
            if(c.containsKey(st.charAt(i))==false)
                c.put(st.charAt(i), 1);
            else
                c.put(st.charAt(i), c.get(st.charAt(i))+1);
        }
        for(Map.Entry el: c.entrySet()){
            char key=(char)el.getKey();
            int count=(int)el.getValue();
            System.out.println(key+"-"+count);
        }
        in.close();
    }
}
