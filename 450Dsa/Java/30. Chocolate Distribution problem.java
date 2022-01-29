import java.util.*;
class Chocolate_Distribution_problem {
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        if(n==1 || m==1){
            return 0;
        }
        Collections.sort(a);
        long min=a.get((int)n-1);
        for(int i=0;i<n-m+1;i++){
            long diff= a.get((int)m+i-1)-a.get(i);
            if(diff<min)
                min=diff;
        }
        return min;
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m");
        Long m=in.nextLong();
        System.out.println("Enter numbers in ArrayList");
        ArrayList<Long> a=new ArrayList<Long>();
        for(int i=0;i<m;i++){
            Long x=in.nextLong();
            a.add(x);
        }
        System.out.println("Enter n");
        Long n=in.nextLong();
        System.out.println(findMinDiff(a, m, n));
        in.close();        
    }
    
}
