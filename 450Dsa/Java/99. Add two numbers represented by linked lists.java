import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Add_two_numbers {
    public static node reverse(node head){
        node p=null;
        while(head!=null){
            node n=head.next;
            head.next=p;
            p=head;
            head=n;
        }
        return p;
    }
    public static node addTwoLists(node first, node second){
        first=reverse(first);
        second=reverse(second);
        node head=null;
        int c=0;
        if(first.data+second.data<10)
            head=new node(first.data+second.data);
        else{
            head=new node((first.data+second.data)%10);
            c=1;
        }
        first=first.next;
        second=second.next;
        node h=head;
        while(first!=null && second!=null){
            int r=first.data+second.data+c;
            if(r<10){
                h=push(h, r);
                c=0;
            }
            else{
                h=push(h, r%10);
                c=1;
            }
            first=first.next;
            second=second.next;
        }
        while(first!=null){
            int r=first.data+c;
            if(r<10){
                h=push(h, r);
                c=0;
            }
            else{
                h=push(h, r%10);
                c=1;
            }
            first=first.next;
        }
        while(second!=null){
            int r=second.data+c;
            if(r<10){
                h=push(h, r);
                c=0;
            }
            else{
                h=push(h, r%10);
                c=1;
            }
            second=second.next;
        }
        if(c==1)
            h=push(h, c);
        head=reverse(head);
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
        node first=null;
        if(n>0){
            d=in.nextInt();
            first=new node(d);
        }
        node t=first;
        for(int i=1;i<n;i++){
            d=in.nextInt();
            t=push(t, d);
        }
        int m=in.nextInt();
        node second=null;
        if(m>0){
            d=in.nextInt();
            second=new node(d);
        }
        t=second;
        for(int i=1;i<m;i++){
            d=in.nextInt();
            t=push(t, d);
        }
        node head=addTwoLists(first, second);
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
        in.close();
    }
}