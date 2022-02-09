// import java.util.*;
// class hello  {
//     public static int minSwap(String[] a, int n) {
//         int i=0, j, c=0, b=0;
//             for(i=0;i<n;i++){
//                 if(a[i].charAt(0)<='A')
//                     c++;
//             }
//             for(i=0;i<c;i++){
//                 if(a[i].charAt(0)>'A')
//                     b++;
//             }
//             i=0;
//             j=c;
//             int ans=b;
//             while(j<n){
//                 System.out.print(c+"  ");
//                 if(a[i].charAt(0)>'A')c--;
//                 if(a[j].charAt(0)>'A')c++;
//                 ans=Math.min(ans, c);
//                 i++;j++;
//             }
//             if(ans!=0)
//                 return ans;
//             return -1;
//     }
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         String[] arr = in.nextLine().split(",");
//         int m=arr.length;
//         System.out.println(minSwap(arr, m));
//         in.close();
//     }
// }


import java.util.*;

class progamTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        String temp = sc.nextLine();
        String[] inarr = temp.split(",");

        int[] alph = new int[26];
        int n = instr.length();
        for(int i=0; i<26; i++){
            alph[i] = 0;
        }
        HashMap<Integer,String> mp = new HashMap<>();
        HashMap<String,Integer> mp2 = new HashMap<>();

        for(int i=0;i<n; i++){
            int ch =(int)(instr.charAt(i) - 'a');
            if(!mp.containsKey(ch)){
                mp.put(ch,inarr[i]);
                alph[ch] = 1;
            }
            else{
                if(!inarr[i].equals(mp.get(ch))){
                    alph[ch] = 0;  // System.out.println(ch + " "+i);
                }
            }
        }

        for(int i=0; i<n-1; i++){
            char ch = instr.charAt(i);
            temp = inarr[i];
            for(int j=i+1; j<n; j++){
                if(ch != instr.charAt(j) && temp.equals(inarr[j])){
                    alph[(int)(ch - 'a')] = 0;
                    alph[(int)(instr.charAt(j) - 'a')] = 0;
                }
            }
        }

        int[] visited = new int[26];
        for(int i=0; i<26; i++){
            visited[i] = 0;
        }

        String outstr = "";                 

        for(int i=0; i<n; i++){
            int ch =(int)(instr.charAt(i) - 'a');
            if(alph[ch] == 1 && visited[ch]==0){
                    outstr += instr.charAt(i);
                    visited[ch] = 1;
            }
        }
        if(outstr.length()==0){
            outstr = "NA";
        }
        System.out.println(outstr);
    }
}
