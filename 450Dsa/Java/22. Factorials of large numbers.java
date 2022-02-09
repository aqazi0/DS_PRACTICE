import java.util.*;;
class Factorials_of_large_numbers {
    public static void multiply(ArrayList<Integer> ans, int n){
        int j=0, c=0, m;
        while(j<ans.size()){
            m=c+(ans.get(j)*n);
            c=m%10;
            ans.set(j, c);
            c=m/10;
            j++;
        }
        while(c!=0){
            ans.add(c%10);
            c=c/10;
        }
    }
    public static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int n1=N;
        while(n1!=0){
            ans.add(n1%10);
            n1=n1/10;
        }
        int j=0,c=0;
        for(int i=N-1;i>0;i--){
            multiply(ans, i);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        System.out.println(factorial(n));
        in.close();
    }
}
