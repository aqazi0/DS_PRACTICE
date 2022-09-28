import java.util.*;
class Detect_loop{
    
static class node{
    int data;
    int flag;
    node next;
    node(int data){
        this.data=data;
        this.flag=0;
        this.next=null;
    }
}
    public static node push(node h, int val){
        node n=new node(val);
        h.next=n;
        h=n;
        return h;
    }
    public static boolean detectloop(node head){
        while(head!=null){
            if(head.flag==1){
                return true;
            }
            head.flag=1;
            head=head.next;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d;
        node head=null;
        if(n>0){
            d=in.nextInt();
            head=new node(d);
        }
        node c=head;
        node t=head;
        for(int i=1;i<n;i++){
            d=in.nextInt();
            t=push(t, d);
        }
        int x= in.nextInt();
        for(int i=1;i<x;i++){
            c=c.next;
        }
        t.next=c;
        if(detectloop(head))
            System.out.print("Loop Detected");
        else
            System.out.print("No Loop");
        in.close();
    }
}