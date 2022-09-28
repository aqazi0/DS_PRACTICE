import java.util.*;
class first_repeated_word_in_string {
    public static String firstword(String st){
        String word="";
        String[] words=st.split(" ");
        HashMap<String, Integer> count=new HashMap<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' '){
                if(count.containsKey(word)==false)
                    count.put(word, 1);
                else{
                    count.put(word, count.get(word)+1);
                }
                word="";
            }
            else
                word=word+st.charAt(i);
        }
        for(int i=0;i<words.length;i++){
            if(count.get(words[i])>1)
                return words[i];
        }
        return "No Repetition";
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        st+=" ";
        System.out.print(firstword(st));
        in.close();
    }
}
