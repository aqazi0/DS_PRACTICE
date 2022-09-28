import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data =data;
        this.next=null;
    }
}
class reverse_linked_list{
    public static node new_node(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        node p=null;
        node head=null;
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            node c=new node(a);
            if(i==0){
                head=c;
                p=head;
            }
            else{
                p.next=c;
                p=p.next;
            }
            if(i==n-1){
                c.next=null;
            }
        }
        in.close();
        return head;
    }
    public static void print(node head){
        node a=head;
        while(a!=null){
            System.out.print(a.data+" ");
            a=a.next;
        }
        System.out.println();
    }
    public static node reverse(node head){
        node c=head;
        node p=null;
        while(c!=null){
            node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public static void reverse(node c, node p){
        if(c==null){
            print(p);
            return;
        }
        node n=c.next;
        c.next=p;
        reverse(n, c);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        node head=new_node();
        print(head);
        head=reverse(head);
        print(head);
        reverse(head, null);
        in.close();
    }
}