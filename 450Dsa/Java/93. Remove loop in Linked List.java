import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this .data=data;
        this.next=null;
    }
}
class Remove_loop_in_Linked_List {    
    public static node push(node h, int val){
        node n=new node(val);
        h.next=n;
        h=n;
        return h;
    }
    public static void removeLoop(node head){
        node p=head;
        HashSet<node> s=new HashSet<>();
        s.add(head);
        head=head.next;
        while(head!=null){
            if(s.contains(head)){
                p.next=null;
                break;
            }
            s.add(head);
            head=head.next;
            p=p.next;
        }
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
        removeLoop(head);
        while(head!=null){
            head=head.next;
        }
        System.out.print(1);
        in.close();
    }
}
