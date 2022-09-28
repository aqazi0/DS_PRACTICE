import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Find_first_node_of_loop {
    public static int findfirstnode(node head){
        HashSet<node> s=new HashSet<>();
        while(true){
            if(s.contains(head)){
                return head.data;
            }
            s.add(head);
            head=head.next;
        }
    }
    public static node push(node h, int val){
        node n=new node(val);
        h.next=n;
        h=n;
        return h;
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
        System.out.println("Pointer to node "+findfirstnode(head));
        in.close();
    }
}
