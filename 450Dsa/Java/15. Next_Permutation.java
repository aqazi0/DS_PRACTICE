import java.util.*;
class Next_Permutation {
    public static void swap(int[] a, int i, int j){
        int p=a[i];
        a[i]=a[j];
        a[j]=p;
    }
    public static void next(int[] a){
        int i=a.length-1;
        while(i>0){
            if(a[i]<=a[i-1]){
                i--;
                if(i==0)
                    Arrays.sort(a);
            }
            else{
                int min=i;
                for(int j=i;j<a.length;j++){
                    if(a[j]<a[min] && a[j]> a[i-1])
                        min=j;
                }
                swap(a, i-1, min);
                Arrays.sort(a, i, a.length);
                break;
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m");
        int m=in.nextInt();
        System.out.println("Enter numbers in array");
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=in.nextInt();
        }
        next(a);
        in.close();
    }
}
