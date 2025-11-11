//Jonathan Conte, adams, pd 4, 

public class MyLLTester
{
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

    System.out.println("list size:" + list.size());//prints size
    System.out.println("list empty?" + list.isEmpty());//prints true or false if list is empty
    System.out.println("item at index 5: " + list.get(5));//prints index at 5
    System.out.println("replacing index 3 with X");

    list.set(3, "X");//replaces index 3 with X
    System.out.println(list);//prints current list
    System.out.println("Removing first:" + list.removeFirst());//removes first
    System.out.println(list);
    System.out.println("Removing last:" + list.removeLast());//removes last
    System.out.println(list);
    System.out.println("Removing index 2:" + list.remove(2));//removes at index 2
    System.out.println(list);

    System.out.println("final list size:" + list.size());//prints final list size
    System.out.println("is list empty:" + list.isEmpty());//prints true or false if list is empty
    System.out.println(list);//prints final list
  } //end main
  
} //end class