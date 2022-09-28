import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Move_last_element_to_front {
    public static node move_element(node head){
        node c=head.next;
        node p=head;
        while(c.next!=null){
            c=c.next;
            p=p.next;
        }
        c.next=head;
        p.next=null;;
        return c;
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
        node t=head;
        for(int i=1;i<n;i++){
            d=in.nextInt();
            t=push(t, d);
        }
        head=move_element(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        in.close();
    }
}
