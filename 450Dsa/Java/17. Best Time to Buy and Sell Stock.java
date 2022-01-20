import java.util.*;
class Best_Time_to_Buy_and_Sell_Stock {
    public static int best_time(int[] a){
        int l=0, max=0, profit=0;
        for(int i=1;i<a.length;i++){
            System.out.println(a[i]+"   "+l+"  ");
            if(a[i]<a[l]){
                l=i;            
            }
            if(a[i]>a[l])
                profit=a[i]-a[l];
            if(profit>max)
                max=profit;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(best_time(a));        
        in.close();
    }    
}
