public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size = 0){
            Return true;
        }
        else{
            return false;
        }

    }
    public boolean addLast(Object obj){
        ListNode newItem = new ListNode(obj);
        ListNode current = head;
        if(head == null){
            head = newNode;
            return true;
        }
        
        else{
            while(getNext(); != null){
                current = current.getNext();
            }

        }
        current.getNext(); = newItem;
        size++;
        return true;
          
        
    }
    public boolean add(Object obj){
        addLast(Object obj);
    }
    


}
