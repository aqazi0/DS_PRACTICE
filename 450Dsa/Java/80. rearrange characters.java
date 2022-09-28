import java.util.*;
class rearrange_characters {
    public static int solve(String s){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))==false){
                map.put(s.charAt(i), 1);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            if(map.get(s.charAt(i))>s.length()/2){
                return 0;
            }
        }
        return 1;
    }
	public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String st=in.next();
            System.out.println(solve(st));
        }
        in.close();
	}
}