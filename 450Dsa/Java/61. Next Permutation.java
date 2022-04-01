import java.util.*;
class Next_Permutation {
    public static void swap(int[] a, int i, int j){
        int p=a[i];
        a[i]=a[j];
        a[j]=p;
    }
    static List<Integer> nextPermutation(int N, int a[]){
        int i=N-1;
        while(i>0){
            if(a[i]<=a[i-1]){
                i--;
                if(i==0)
                    Arrays.sort(a);
            }
            else{
                int min=i;
                for(int j=i;j<a.length;j++){
                    if(a[j]<a[min] && a[j]>a[i-1])
                        min=j;
                }
                swap(a, i-1, min);
                Arrays.sort(a, i, a.length);
                break;
            }
        }
        List<Integer> al=new ArrayList<>();
        for(i=0;i<a.length;i++)
            al.add(a[i]);
        return al;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }     
        System.out.println(nextPermutation(n, arr));
        in.close();
    }    
}
