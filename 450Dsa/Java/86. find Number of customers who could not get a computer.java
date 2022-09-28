import java.util.*;
class find_customers_who_dont_get_computer {
    public static int runCustomerSimulation(int n, String st){
        int[] ch=new int[256];
        int ans=0;
        for(int i=0; i<st.length(); i++){
            int c=(int)st.charAt(i);
            if(ch[c]==0 || ch[c]==-1){
                if(ch[c]==-1){}
                else if(n==0){
                    ans++;
                    ch[c]=-1;
                }
                else{
                    n--;
                    ch[c]=1;
                }
            }
            else{
                ch[c]=0;
                n++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String st=in.next();
        st=st.toUpperCase();
        System.out.print(runCustomerSimulation(n, st));
        in.close();
    }
}
