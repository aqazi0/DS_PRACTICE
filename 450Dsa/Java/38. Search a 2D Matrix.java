import java.util.*;
class Search_2D_Matrix {
    public static boolean searchMatrix(int[][] a, int x) {
        int i=-1, l=0, u=a.length-1;
        while(l<=u){
            int m=(l+u)/2;
            if(a[m][0]==x)
                return true;
            else if(a[m][0]<x){
                if(m==a.length-1 || a[m+1][0]>x){
                    i=m;
                    break;
                }
                l=m+1;
            }
            else{
                if(m==0)
                    return false;
                if(a[m-1][0]<x){
                    i=m-1;
                    break;
                }
                u=m-1;
            }
        }
        l=0;
        u=a[0].length-1;
        while(l<=u){
            int m=(l+u)/2;
            if(a[i][m]==x)
                return true;
            else if(a[i][m]<x){
                l=m+1;
            }
            else{
                u=m-1;
            }
        }
        return false;
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
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter element to search - ");
        int ns=in.nextInt();
        System.out.println(searchMatrix(a, ns));
        in.close();
    }
}