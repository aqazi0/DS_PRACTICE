import java.util.*;
class node {
	int data;
	node next;
	node(int key)
	{
		this.data = key;
		next = null;
	}
}
class Merge_Sort_Linked_List {
    static node nhead=null;
    public static node merge(node head1, node head2){
        if(head1.data<head2.data){
            nhead=head1;
            head1=head1.next;
        }
        else{
            nhead=head2;
            head2=head2.next;
        }
        node temp=nhead;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return nhead;
    }
    static node mid(node head){
        node s=head;
        node f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    static node mergeSort(node head)
    {
        if(head.next==null)
            return head;
        node mid=mid(head);
        node head2=mid.next;
        mid.next=null;
        node nhead1=mergeSort(head);
        node nhead2=mergeSort(head2);
        node fhead=merge(nhead1, nhead2);
        return fhead;
    }
	static void print(node head)
	{
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
    public static node push(node h, int val){
        node n=new node(val);
        h.next=n;
        h=n;
        return h;
    }
	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
        int d;
        node head=null;
        if(n>0){
            d=in.nextInt();
            head=new node(d);
        }
		node temp = head;
        for(int i=0;i<n-1;i++){
            d=in.nextInt();
            temp=push(temp, d);
        }
		head = mergeSort(head);
		print(head);
        in.close();
	}
}