import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
	 public static void main(String[] args){
	 LinkedList <Integer> a1 = new LinkedList <Integer>();
	 a1.add(56);
	 a1.add(30);
	 a1.add(73);
	 Iterator<Integer> itr = a1.iterator();  
	 System.out.println("Itreator "+  a1.iterator());  
	 while(itr.hasNext())
	 {  
	   System.out.println("Print Linked list: "+ itr.next());  
	  }
	}
	 
}