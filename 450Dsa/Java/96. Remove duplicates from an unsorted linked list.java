import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Remove_duplicates_from_an_unsorted_linked_list {
    public static node removeDuplicates(node head)
    {
	    HashSet<Integer> s=new HashSet<>();
         s.add(head.data);
         node c=head.next;
         node p=head;
         while(c!=null){
             if(s.contains(c.data)){
                p.next=c.next;
             }
             else{
                 s.add(c.data);
                 p=p.next;
             }
             c=c.next;
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
        head=removeDuplicates(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        in.close();
    }       
}
