import java.util.*;

class Merge_Interval {
    public static void Merge(int[][] a){
        Arrays.sort(a, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int i=1;
        int[][] b=new int[a.length][2];
        int f=a[0][0],l=a[0][1],y=0,k=0;
        while(i<a.length){
            if(a[y][1]>=a[i][0]){
                if(a[y][1]<=a[i][1])
                {
                    y=i;
                    l=a[i][1];
                }
            }
            else{
                b[k][0]=f;
                b[k][1]=l;
                k++;
                f=a[i][0];
                l=a[i][1];
                y=i;
            }
            i++;
        }
        b[k][0]=f;
        b[k][1]=l;
        for(i=0;i<b.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            System.out.println();
            }
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of intervals");
        int m=in.nextInt();
        int[][] a = new int[m][2];
        System.out.println("Enter values in matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                a[i][j]=in.nextInt();
            }
        }
        Merge(a);
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.print(a[i][j]+" ");
        //     System.out.println();
        //     }
        // }
        in.close();
    }
}
