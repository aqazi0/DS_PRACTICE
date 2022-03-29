import java.util.*;
class permutation {
    public static String toString(char[] a)
    {
        String string = new String(a);
 
        return string;
    }
    static char[] sortString(String str, int i, int j) {
        char []arr = str.toCharArray();
        Arrays.sort(arr, i, j);
        return arr;
    }
    static char[] swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
    public static void permute(String s){
        int k=1;
        for(int i=1;i<=s.length();i++)
            k=k*i;
        System.out.println(s);
        for(int x=1;x<k;x++){
        for(int i=s.length()-1;i>=1;i--){
            if(s.charAt(i)>s.charAt(i-1)){
                char ch=s.charAt(i);
                int index=i;
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)>s.charAt(i-1) && s.charAt(j)<ch){
                        ch=s.charAt(j);
                        index=j;
                    }
                }
                s=toString(swap(s, i-1, index));
                s=toString(sortString(s, i, s.length()));
                break;
            }
        }
        System.out.println(s);
    }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.next();
        permute(st);
        in.close();
    }
}
