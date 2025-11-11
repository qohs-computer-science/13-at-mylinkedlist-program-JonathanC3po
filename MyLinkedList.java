//Jonathan Conte, adams, pd 4, 

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
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addLast(Object obj)
    {
        ListNode newItem = new ListNode(obj, null);
        ListNode current = head;
        if(head == null){
            head = newItem;
            size++;
            return true;
        }
        else{
            while(current.getNext() != null){
                current = current.getNext();
            }
        }
        current.setNext(newItem);

        size++;

        return true;
    }//add last

    public boolean add(Object obj){
        return addLast(obj);
    }

    public boolean addFirst(Object obj){
        ListNode newItem = new ListNode(obj, null);
        newItem.setNext(head);
        head = newItem;
        size++;
        return true;
    }

    public Object get(int i){
        if(i < 0 || i >= size){
            return null;
        }
        ListNode current = head;
        int index = 0;
        while(index < i){
            current = current.getNext();
            index += 1;
        }
        return current.getValue();
    }//add

    public Object set(int i, Object newValue){
        if(i < 0 || i >= size){
            return null;
        }
        ListNode current = head;
        int index = 0;
        while(index < i){
            current = current.getNext();
            index += 1;
        }
        Object oldValue = current.getValue();
        current.setValue(newValue);
        return oldValue;
    }//set

    public Object removeFirst(){
        if(head == null){
            return null;
        }
        Object value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }//remove first

    public Object removeLast(){
        if(head == null){
            return null;
        }
        if(head.getNext() == null){
            Object value = head.getValue();
            head = null;
            size--;
            return value;
        }
        ListNode current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        Object value = current.getNext().getValue();
        current.setNext(null);
        size--;
        return value;
    }// remove last

    public Object remove(int index){
        if(head == null){
            return null;
        }
        if(index < 0 || index >= size){
            return null;


        }
        if (index == 0){
            return removeFirst();

        }
        ListNode current = head;
        for (int i = 0; i < index - 1; i++){
            current = current.getNext();
        }


        ListNode removedNode = current.getNext();
        Object value = removedNode.getValue();
        current.setNext(removedNode.getNext());
        size--;
        return value;

        
    }//remove

    public String toString(){

        String result = "";
        ListNode current = head;
        int index = 0;

        while (current != null){
            result += index + ": " + current.getValue() + "\n";
            current = current.getNext();
            index++;
        }
        return result;

    }//to string
}//end

