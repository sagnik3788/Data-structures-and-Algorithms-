import java.util.Scanner;
public class list {
    private list.Node head;
    private list.Node tail;
    private int size;
    public list() {
        this.size = 0;
     }
    //insert numbers
    public void enterfirst(int value){
   Node node=new Node(value);
   node.next=head;
   head=node;
   if (tail==null){
       tail=head;
   }
   size++;
    }
    //delete element first
    public void deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return ;
    }
    //insert value b/w linked list
    public void insert(int value,int index) {
        if (index == 0) {
            enterfirst(value);
            return;
        }
        if (index == size) {
            insertlast(value);
        }
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
temp.next=node;
size++;
    }
    //print linked list
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    //add numbers in tail
    public void insertlast(int value){
        if(tail==null){
            enterfirst(value);
            return;
        }
        Node node =new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    public int deleteLast(){
        if(size<=1){
       //   return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val =tail.value;
        tail=secondLast;
        tail.next=null;
return val;}
public int delete(int index){
    if (index==0){
       // return deleteFirst();
    }
    if(index==size-1) {
return deleteLast();
    }
    Node prev=get(index-1);
    int value=prev.next.value;
    prev.next=prev.next.next;
    return value;
        }



    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
//node define
        private   class Node{
            private int value;
            private Node next;

            public Node (int value){
                this.value=value;
            }
            public Node(int value,Node next){
                this.value=value;
                this.next=next;
            }
        }

}
