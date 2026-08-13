public class IntList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addNew(int data){
           Node newNode = new Node(data);
           if(head==null){
            head=newNode;
            return;
           }
            //add first
            if(data<head.data){
                newNode.next=head;
                head=newNode;
                return;
            }
            //in between Nodes
            Node prevNode=head;
            Node currNode=head.next;

            while(currNode != null && currNode.data<data){
                  prevNode=currNode;
                  currNode=currNode.next;
            }
            newNode.next=currNode;
            prevNode.next=newNode;
    }
    public void printList(){
       
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while (currNode!= null) {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("null");

        
    }
    public static void main(String [] args){
        IntList list =new IntList();
        list.addNew(6);
        list.addNew(5);
        list.addNew(8);
        list.addNew(7);
    
        list.printList();
    }
    
    
}
