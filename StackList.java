public class StackList{
    private ListNode top;
    private ListNode tail;
    private int size;
    
    public StackList(){
       top = null;
       size = 0;
    }
    
    public boolean isEmpty(){
       return top == null;
    }
    
    public boolean push(Object data){
          ListNode node = new ListNode(data);
          node.tail = top;
          top = node;
          size++;
          return true;
    }
    
    public Object pop(){
       if(!isEmpty()){
          Object temp = top.data;
          top = top.tail;
          size--;
          return temp;
       }
       else{
          return null;
       }
     }
       
     public Object peek(){
        if(!isEmpty())
          return top.data;
        else
          return null;
     }
     
     public int size(){
       return size;
     }
     
     public void display(){
       if(!isEmpty()){
          ListNode temp = top;
          while(temp != null){
             System.out.println(temp.data);
             temp = temp.tail;
          }
       }else{
          System.out.println("Stack Empty");
       }
     }
     
     public int getSize(){
       if(!isEmpty()){
          ListNode temp = top;
          int counter = 0;
          while(temp != null){
             counter++;
             temp = temp.tail;
          }
          
          return counter;
       }else{
          return 0;
       }
     }  
 }