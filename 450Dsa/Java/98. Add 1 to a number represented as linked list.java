import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Add_1_to_number{
    public static node addOne(node head) 
    { 
        node c=head;
        node p=null;
        while(c!=null){
            node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        c=p;
        while(c!=null){
            if(c.data==9){
                c.data=0;
                if(c.next==null){
                    c.data=10;
                }
                c=c.next;
            }
            else{
                c.data=c.data+1;
                break;
            }
        }
        c=p;
        p=null;
        while(c!=null){
            node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return head;
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
        head=addOne(head);
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
        in.close();
    }
}