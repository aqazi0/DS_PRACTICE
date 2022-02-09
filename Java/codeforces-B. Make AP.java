import java.util.*;
class Make_AP {
    public static String CanBeAP(int[] a){
        for(int i=0;i<3;i++){
            int diff;
            double arg1,arg2;
            if(i==0){
                diff=Math.abs(a[2]-a[1]);
                arg1=(Math.max(a[1],a[2])+diff)/(a[i]*1.0);
                arg2=(Math.max(a[1],a[2])+Math.min(a[1],a[2]))/(2.0*a[i]);
                if(arg1-(int)arg1==0 || arg2-(int)arg2==0)
                    return "YES";
            }
            if(i==1){
                diff=Math.abs(a[2]-a[0]);
                arg1=(Math.max(a[0],a[2])+diff)/(a[i]*1.0);
                arg2=(Math.max(a[0],a[2])+Math.min(a[0],a[2]))/(2.0*a[i]);
                if(arg1-(int)arg1==0 || arg2-(int)arg2==0)
                    return "YES";
            }
            if(i==2){
                diff=Math.abs(a[0]-a[1]);
                arg1=(Math.max(a[1],a[0])+diff)/(a[i]*1.0);
                arg2=(Math.max(a[1],a[0])+Math.min(a[1],a[0]))/(2.0*a[i]);
                if(arg1-(int)arg1==0 || arg2-(int)arg2==0)
                    return "YES";
            }
        }
        return "NO";
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int[] a=new int[3];
            for(int i=0; i<3; i++){
                a[i]=in.nextInt();
            }
            System.out.println(CanBeAP(a));
        }
        in.close();
    }
}
