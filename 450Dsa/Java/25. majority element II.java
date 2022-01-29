import java.util.*;
class majority_element_II {
    public static List<Integer> majorityElement(int[] a) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int n=a.length, c1=0, c2=0, n1=-1, n2=-1 ;
        for(int i=0;i<n;i++){
            if(a[i]==n1)
                c1++;
            else if(a[i]==n2)
                c2++;
            else if(c1==0){
                n1=a[i];
                c1=1;
            }
            else if(c2==0){
                n2=a[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(a[i]==n2)
                c2++;
            if(a[i]==n1 && n1!=n2)
                c1++;
        }
        if(c2>(n/3))
            ans.add(n2);
        if(c1>(n/3))
            ans.add(n1);
        return ans;
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
        System.out.println(majorityElement(a));
        in.close();
    }
}
