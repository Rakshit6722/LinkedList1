package LinkedList1;

import problems.leaderArray;
import problems.stockBuySell;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();  
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertLast(10);
        list.insertAt(23, 1);
        list.display(); 
        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
       
        list.display();
         
    }
}
