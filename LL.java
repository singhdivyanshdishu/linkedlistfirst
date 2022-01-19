import javax.swing.event.SwingPropertyChangeSupport;

public class LL {
    Node head;
    private int size;
    LL()
    {
        size=0;
    }
    public class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addfirst(String data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addlast(String data)
    {
        Node newNode=new Node(data);
         if(head==null)
         {
             head = newNode;
             return;
         }
         Node lastNode=head;
         while(lastNode.next!=null)
         {
             lastNode =lastNode.next;
         }
         lastNode.next=newNode;
    }
    public void printList() 
    {
        Node currNode = head;
  
        while(currNode != null) 
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removefirst()
    {
            if(head==null)
            {
                System.out.println("Empty List");
                return;
            }
            head=this.head.next;
            size--;
    }
    public void removeLast() 
    {
        if(head == null) 
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
            if(head.next == null)
            {
                 head = null;
                 return;
            }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) 
        {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public int getSize() {
        return size;
    }
public static void main(String[] args) 
{
    LL list = new LL();
    list.addfirst("this");
    list.addlast("is");
    list.addlast("first");
    list.addlast("list");
    list.addlast("by");
    list.addlast("Dishu");
    list.addlast(".");
    list.printList();
    
    list.printList();
    System.out.println(list.getSize());
} 
}
