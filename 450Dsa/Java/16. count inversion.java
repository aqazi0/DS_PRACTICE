import java.util.*;
class count_inversion {
    static int c=0;
    public static void merge(int[] a, int l, int m, int h){
        int n1=m-l+1;
        int n2=h-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        int i=0,j=0, k=l;
        for(i=0;i<n1;i++){
            L[i]=a[i+l];
        }
        for(i=0;i<n2;i++){
            R[i]=a[i+m+1];
        }
        i=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                c+=(n1-i);
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k++]=L[i++];
        }
        while(j<n2){
            a[k++]=R[j++];
        }
    }
    public static void merge_sort(int[] a, int l, int h){
        if(l<h){
            int m=(l+h)/2;
            merge_sort(a, l, m);
            merge_sort(a, m+1, h);
            merge(a, l, m, h);
        }
    }
    public static int count(int[] a){
        merge_sort(a, 0, a.length-1);
        return c;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(count(a));
        in.close();
    }
}
