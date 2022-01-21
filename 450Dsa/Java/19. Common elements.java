import java.util.*;
class Common_elements {
    public static ArrayList<Integer> findCommon(int[] a, int[] b, int[] c, int l, int m, int n){
        int i=0,j=0,k=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(i<l && j<m && k<n){
            if(a[i]==b[j] && a[i]==c[k]){
                if(ans.size()==0)
                    ans.add(a[i]);
                if(ans.size()>0 && a[i]!=ans.get(ans.size()-1))
                    ans.add(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]<=b[j] && a[i]<=c[k]){
                i++;
            }
            else if(b[j]<=a[i] && b[j]<=c[k]){
                j++;
            }
            else if(c[k]<=b[j] && c[k]<=a[i]){
                k++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int l=in.nextInt();
        int[] a = new int[l];
        System.out.println("Enter elements of A");
        for(int i=0;i<l;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter no of elements");
        int m=in.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of B");
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }
        System.out.println("Enter no of elements");
        int n=in.nextInt();
        int[] c = new int[n];
        System.out.println("Enter elements of C");
        for(int i=0;i<n;i++){
            c[i]=in.nextInt();
        }
        ArrayList<Integer> answer=findCommon(a, b, c, l, m, n);
        for(int i=0;i<answer.size();i++)
            System.out.println(answer.get(i));
        in.close();
    }
}
