import java.util.*;
class Min_Number_of_Flips {
    public static int minFlips(String S) {
        int c1=0, c2=0;
        for(int i=0;i<S.length();i++){
            if(i%2==0 && S.charAt(i)=='0'){
                c1++;
            }
            else if(i%2==1 && S.charAt(i)=='1'){
                c1++;
            }
        }
        for(int i=0;i<S.length();i++){
            if(i%2==0 && S.charAt(i)=='1'){
                c2++;    
            }
            else if(i%2==1 && S.charAt(i)=='0'){
                c2++;
            }
        }
        return Math.min(c1,c2);
        }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(minFlips(s));
        in.close();
    } 
}
