// time- O(n2) space-O(n)
// import java.util.*;
// class median_in_row_wise_sorted_matrix {
//     public static double median(int a[][], int r, int c) {
//             ArrayList<Integer> ans=new ArrayList<Integer>();
//             for(int i=0;i<a.length;i++){
//                 for(int j=0;j<a[0].length;j++){
//                     ans.add(a[i][j]);
//                 }
//             }
//             Collections.sort(ans);
//             int size=ans.size();
//             if(size%2==0)
//                 return (ans.get(size/2)+ans.get((size/2)+1))/2.0;
//             else
//                 return ans.get((size/2));
//     }
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter dimension of matrix");
//         System.out.print("m-");
//         int m=in.nextInt();
//         System.out.print("n-");
//         int n=in.nextInt();
//             int[][] a = new int[m][n];
//         System.out.println("Enter elements");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++)
//                 a[i][j]=in.nextInt();
//         }
//         System.out.println(median(a, a.length, a[0].length));
//         in.close();
//     }
// }



// time-O(32*r*log(c)) space-O(1)

import java.util.*;
class MedianInRowSorted
{
    static int binaryMedian(int m[][],int r, int c)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<r ; i++)
        {
            if(m[i][0] < min)
                min = m[i][0];
            if(m[i][c-1] > max)
                max = m[i][c-1];
        }
        int desired = (r * c + 1) / 2;
        while(min < max)
        {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;
            for(int i = 0; i < r; ++i)
            {
                get = Arrays.binarySearch(m[i],mid);
                if(get < 0)
                    get = Math.abs(get) - 1;
                else
                {
                    while(get < m[i].length && m[i][get] == mid)
                        get += 1;
                }
                place = place + get;
            }
            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }
    public static void main(String[] args)
    {
        int r = 3, c = 3;
        int m[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
        System.out.println("Median is " + binaryMedian(m, r, c));
    }
}