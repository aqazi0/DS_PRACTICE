import java.util.*;
class Sorted_Matrix{
    public static int[][] sort(int N, int Mat[][]) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                ans.add(Mat[i][j]);
            }
        }
        Collections.sort(ans);
        int k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                Mat[i][j]=ans.get(k++);
        }
        return Mat;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter dimension of matrix");
        System.out.print("n-");
        int n=in.nextInt();
            int[][] a = new int[n][n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        sort(a.length, a);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        in.close();
    }
}