import java.util.*;
class Beyor_Moore_Majority_voting_algo{
    public static int findMajority(int[] a){
        int c=0, can=-1;
        for(int i=0;i<a.length;i++){
            if(c==0){
                can=a[i];
                c++;
            }
            else{
                if(a[i]==can)
                    c++;
                else
                    c--;
            }
        }
        c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==can){
                c++;
            }
        }
        if(c>(a.length/2.0))
            return can;
        return -1;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        System.out.print(findMajority(a));
        in.close();
    }
}