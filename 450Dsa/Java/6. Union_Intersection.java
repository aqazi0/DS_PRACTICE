import java.util.*;
class Union_Intersection {
    public static void Union(int[] a, int[] b, int m, int n, int[] c){
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(a[i]==b[j]){
                c[k]=a[i];
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i<m){
            while(i<m){
                c[k++]=a[i++];
            }
        }
        if(j<n){
            while(i<m){
                c[k++]=b[j++];
            }
        }
        System.out.println("Element after Union : ");
        i=0;
        while(c[i]!=0){
            System.out.println(c[i]);
            i++;
        }
    }
    public static void Intersection(int[] a,int[] b,int m,int n ,int[] d){
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(a[i]==b[j]){
                d[k]=a[i];
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println("Element after Intersection : ");
        i=0;
        while(d[i]!=0){
            System.out.println(d[i]);
            i++;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int m,n;
        m=in.nextInt();
        n=in.nextInt();
        int[] a=new int[m];
        System.out.println("Enter elements in A");
        for(int i=0;i<m;i++)
            a[i]=in.nextInt();
        int[] b=new int[n];
        System.out.println("Enter elements in B");
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c=new int[m+n];
        int[] d=new int[m+n];
        Union(a, b, m , n, c);
        Intersection(a, b, m , n, d);
        in.close();
    }
}
