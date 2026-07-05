import java.util.*;
public class Merge_Klist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node sortMerge(Node a,Node b){
        if(a==null)
            return b;
        if(b==null)
            return a;
        Node result;
        if (a.data<=b.data) {
            result=a;
            result.next=sortMerge(a.next,b);
        }else{
            result=b;
            result.next=sortMerge(a,b.next);
        }
        return result;
    }
    public static Node mergeKlist(Node arr[],int last){
        while(last!=0){
            int i=0,j=last;
            while(i<j){
                arr[i]=sortMerge(arr[i],arr[j]);
                i++; j--;
                if(i>=j)
                    last=j;
            }
        }
        return arr[0];
    }
    public static void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Merge_Klist ll=new Merge_Klist();
        int k=3;
        Node arr[]=new Node[k];
        arr[0]=new Node(1);
        arr[0].next=new Node(3);
        arr[0].next.next=new Node(5);

        arr[1]=new Node(2);
        arr[1].next=new Node(4);
        arr[1].next.next=new Node(6);

        arr[2]=new Node(0);
        arr[2].next=new Node(9);
        arr[2].next.next=new Node(10);
        head=mergeKlist(arr, k-1);
        ll.print();
    }
}
