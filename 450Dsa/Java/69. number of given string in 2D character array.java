import java.util.*;
class number_of_given_string_in_2D_character_array {
    public static int c=0;
    public static void searchstr(String s, int i, int j, String[] str, int k){
        if(k==s.length()){
            c++;
            return;
        }
        if(i<0 || j<0 || i>=str.length || j>=str[i].length()){
            return;
        }
        if(s.charAt(k)==str[i].charAt(j)){
            searchstr(s, i+1, j, str, k+1);
            searchstr(s, i-1, j, str, k+1);
            searchstr(s, i, j+1, str, k+1);
            searchstr(s, i, j-1, str, k+1);
            return;
        }
        else{
            return;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        int n=in.nextInt();
        String str[] = new String[n];
        int i;
        for(i = 0; i < n; ++i)
        {
            str[i] = in.next();
        }
        for(i=0;i<str.length;i++){
            for(int j=0;j<str[0].length();j++){
                if(str[i].charAt(j)==s.charAt(0)){
                    searchstr(s, i, j, str, 0);
                }
            }
        }
        System.out.println(c/4);
        in.close();
    }
}
