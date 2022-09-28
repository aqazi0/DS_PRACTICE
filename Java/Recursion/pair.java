package Recursion;

import java.util.*;

public class pair {
    static int count_pairs(int[] C)
    {
        int result=0;
        int len=C.length;
        if(len>1)
        {
            int lo_index;
            int hi_index=len-1;
            for(lo_index=0;lo_index<len;lo_index++){
                if(C[lo_index]>1)
                break;
            }
            while(hi_index>lo_index){
                double v=C[hi_index]/(C[hi_index]-1);
                while(lo_index<hi_index&&C[lo_index]<v){
                    lo_index++;
                }
                if(lo_index==hi_index)
                    break;
                result+=(hi_index-lo_index);
                hi_index--;
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println(count_pairs(a));
        in.close();
    }
}
