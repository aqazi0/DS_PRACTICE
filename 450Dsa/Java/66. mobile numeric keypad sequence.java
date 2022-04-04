import java.util.*;
class mobile_numeric_keypad_sequence {
    public static void printSequence(String[] a, String s){
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
                s1=s1+"0";
            else
                s1=s1+a[(int)(ch-65)];
        }
        System.out.print(s1);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.toUpperCase();
        String[] a={"2", "22", "222",
            "3", "33", "333",
            "4", "44", "444",
            "5", "55", "555",
            "6", "66", "666",
            "7", "77", "777", "7777",
            "8", "88", "888",
            "9", "99", "999", "9999"};
        printSequence(a, s);
        in.close();
    }
}
