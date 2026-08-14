public class SearchList {
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
          Node currNode=head;
          while(currNode!=null){
            if(currNode.next==null)
                {
                currNode.next = newNode ;
                return;
                }
            currNode=currNode.next;

          }
    }
    public int Search(int key){
        Node CurrNode=head;
        int i=0;
        while(CurrNode!=null){
            if(CurrNode.data==key){
                return i;
            }
            CurrNode=CurrNode.next;
            i=i+1;
        }

        return -1;
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
        SearchList list =new SearchList();
        list.addNew(6);
        list.addNew(5);
        list.addNew(8);
        list.addNew(7);
        list.printList();
        int i= list.Search(7);
        if(i>=0){
            System.out.println("\nKey found at index "+i);
        }
        else{
            System.out.println("Key not found");
        }

    }
    
    
}

