public class MyLLTester
{
  public static void printList(MyLinkedList list)
  {
    System.out.println("Current List:");
    for (int i = 0; i < list.size(); i++)
    {
        System.out.println(i + ": " + list.get(i));
    }
    System.out.println();
  }
  
  public static void main(String [] args)
  {
    MyLinkedList list = new MyLinkedList();

    System.out.println("initial list empty:" + list.isEmpty());
    System.out.println("initial size:" + list.size());
    System.out.println("adding 10 items:");

    list.addFirst("A");   
    list.addLast("B");    
    list.add("C");        
    list.addFirst("D");   
    list.addLast("E");    
    list.add("F");        
    list.addLast("G");    
    list.addFirst("H");   
    list.add("I");        
    list.addLast("J");    

    System.out.println("list size:" + list.size());
    System.out.println("list empty?" + list.isEmpty());
    System.out.println("item at index 5: " + list.get(5));
    System.out.println("replacing index 3 with X");
    printList(list);
    list.set(3, "X");
    printList(list);
    System.out.println("Removing first:" + list.removeFirst());
    printList(list);
    System.out.println("Removing last:" + list.removeLast());
    printList(list);
    System.out.println("Removing index 2:" + list.remove(2));
    printList(list);

    System.out.println("final list size:" + list.size());
    System.out.println("is list empty:" + list.isEmpty());
  } // end main
  
} // end class