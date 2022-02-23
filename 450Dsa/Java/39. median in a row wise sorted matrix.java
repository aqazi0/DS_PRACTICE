// time- O(n2) space-O(n)
import java.util.*;
class median_in_row_wise_sorted_matrix {
    public static double median(int a[][], int r, int c) {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    ans.add(a[i][j]);
                }
            }
            Collections.sort(ans);
            int size=ans.size();
            if(size%2==0)
                return (ans.get(size/2)+ans.get((size/2)+1))/2.0;
            else
                return ans.get((size/2));
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter dimension of matrix");
        System.out.print("m-");
        int m=in.nextInt();
        System.out.print("n-");
        int n=in.nextInt();
            int[][] a = new int[m][n];
        System.out.println("Enter elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        System.out.println(median(a, a.length, a[0].length));
        in.close();
    }
}
