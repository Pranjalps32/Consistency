public class QueueArray {
    static class Que{
         int size;
         int rear=-1;
         int arr[];

        Que(int n){
            arr =new int[n];
            size=n;
        }
    
     boolean isEmpty()
    {
        return rear==-1;
    }

     void add(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
        System.out.println(data + " is added");
    }

     int delete(){
        if(isEmpty()){
            
            System.out.println("Queue is empty");
            return 0;
        }
        int front =arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
     int peek(){
        if(isEmpty()){
            
            System.out.println("Queue is empty");
            return 0;
        }
        int front =arr[0];
        return front;
    }
  }
  public static void main(String[] args) {
    Que q=new Que(5);
    q.add(45);
    q.add(34);
    System.out.println(q.delete() + " is removed");
    System.out.println(q.peek() + "  is at front ");

  }
}
