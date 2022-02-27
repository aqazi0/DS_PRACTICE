import java.util.*;
class Rotate_matrix_by_90_degrees {
    public static void swapcol(int[][] a,int i,int j){
        for(int k=0;k<a.length;k++){
            int t=a[k][i];
            a[k][i]=a[k][j];
            a[k][j]=t;
        }
    }
    public static void swap(int[][] a, int i, int j){
        int t=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=t;
    }
    public static void rotate(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[0].length;j++){
                swap(a, i, j);
            }
        }
        int j=a.length-1;
        for(int i=0;i<a[0].length/2;i++)
            swapcol(a, i, j--);
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
        rotate(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        in.close();
    }
}
