public class llprac {
    public static void main(String[] args) {
list list=new list();
list.enterfirst(2);
list.enterfirst(4);
list.enterfirst(7);
list.enterfirst(9);
list.enterfirst(1);
list.insertlast(99);
list.insert(1,3);
list.display();
        System.out.println(list.deleteLast());
list.display();
        System.out.println(list.delete(3));
        list.display();
    }
}
