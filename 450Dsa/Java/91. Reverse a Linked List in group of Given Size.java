import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Reverse_Linked_List_in_group_of_Given_Size {
    public static void print(node head){
        node a=head;
        while(a!=null){
            System.out.print(a.data+" ");
            a=a.next;
        }
        System.out.println()    ;
    }
    public static node reverse(node c,int i, int k,node f, node start){
        node p=null;
        node head=c;
        int t=i;
        while(i<t+k && c!=null){
            node n=c.next;
            c.next=p;
            p=c;
            c=n;
            i++;
        }
        if(f!=null)
            f.next=p;
        else
            start=p;
        if(c==null)
            return start;
        reverse(c, i, k, head, start);
        return start;
    }
    public static void main(String args[]){
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
        int k=in.nextInt();
        node h=reverse(head,0, k,null, null);
        print(h);
        in.close();
    }
}
