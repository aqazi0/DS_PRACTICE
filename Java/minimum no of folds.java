import java.util.*;
class abc {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int w1=in.nextInt();
        int h1=in.nextInt();
        int w2=in.nextInt();
        int h2=in.nextInt();
        double x1=Math.ceil(Math.log((w1/(w2*1.0)))/Math.log(2));
        double x2=Math.ceil(Math.log((h1/(h2*1.0)))/Math.log(2));
        System.out.print(x1+x2);
        in.close();
    }    
}
