import java.util.*;
class strings_rotations {
    public static boolean check(String st, String st1){
        if(st.length()!=st1.length())
            return false;
        int i=0,j=0;
        while(i<st.length()){
            if(st.charAt(i)==st1.charAt(j))
                j++;
            else
                j=0;
            i++;
        }
        if(st1.substring(j).equals(st.substring(0,st.length()-j))){
            if(st1.substring(0,j).equals(st.substring(st.length()-j)))
                return true;
        }
        else
            return false;
        return false;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        String st1=in.next();
        if(check(st, st1))
            System.out.println("Rotated");
        else
            System.out.println("Not");
        in.close();
    }
}
