import java.util.*;
class Spiral_traversing_array{
    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int c, int r)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i=0,j=0,k=0,v1=0,t1=c;
        while(k!=c && k!=r){
            if(k%2==0){
                v1=i;
                while(j<r-(k/2)){
                    ans.add(matrix[i][j]);
                    j++;
                }
                if(j==r-k/2){
                    j--;
                    i++;
                }
                while(i<c-(k/2) && i<t1){
                    ans.add(matrix[i][j]);
                    i++;
                }
                if(i==c-k/2){
                    j--;
                    i--;
                }
            }
            if(k%2==1){
                t1=i;
                while(j>=k/2){
                    ans.add(matrix[i][j]);
                    j--;
                }
                if(j==k/2-1){
                    j++;
                    i--;
                }
                while(i>k/2 && i>v1){
                    ans.add(matrix[i][j]);
                    i--;
                }
                if(i==k/2){
                    j++;
                    i++;
                }
            }
            k++;
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
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println(spirallyTraverse(a, a.length, a[0].length));
        in.close();
    }
}