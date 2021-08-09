import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgramUC2 {
	 public static void main(String[] args){
	 LinkedList <Integer> linkedLst = new LinkedList <Integer>();
	 linkedLst.add(70);
	 linkedLst.add(30);
	 linkedLst.add(56);
	  System.out.print("Elements before reversing: " + linkedLst);
        linkedLst = reverseLinkedList(linkedLst);
        System.out.print("\nElements after reversing: " + linkedLst);
	}
	
	 public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) {
  
            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
	 
}