import java.util.*;
class Row_with_max_1s{
    public static int rowWithMax1s(int arr[][], int n, int m) {
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i][m-1]==1){
                ans=i;
                break;
            }
        }
        if(ans==-1)
            return ans;
        int i=ans,j=m-1;
        while(i<n){
            while(arr[i][j]!=0){
                ans=i;
                if(j==0)
                    return ans;
                j--;
            }
            i++;
        }
        return ans;
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
        System.out.println(rowWithMax1s(a, a.length, a[0].length));
        in.close();
    }
}