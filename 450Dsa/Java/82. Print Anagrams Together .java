import java.util.*;
class Print_Anagrams_Together  {
    public static String toString(char[] a)
    {
        String string = new String(a);
        return string;
    }
    static char[] sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return arr;
    }
    public static List<List<String>> Anagrams(String[] string_list) {
        int n=string_list.length;
        ArrayList<String> a=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(toString(sortString(string_list[i])));
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(a.get(i)=="")
                continue;
            ans.add(new ArrayList<String>());
            ans.get(k).add(string_list[i]);
            for(int j=i+1;j<n;j++){
                if(a.get(i).equals(a.get(j))){
                    ans.get(k).add(string_list[j]);
                    a.set(j, "");
                }
            }
            a.set(i, "");
            k++;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=in.next();
        }
        System.out.print(Anagrams(a));
        in.close();
    }
}
