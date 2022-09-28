import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Remove_duplicate_element_from_sorted_Linked_List {
    public static node removeDuplicates(node head)
    {
	    node p=head;
	    node c=head.next;
	    while(c!=null){
	        if(c.data==p.data)
	            p.next=c.next;
	        else
	            p=p.next;
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
