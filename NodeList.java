public class NodeList {
   private Node first;
   private Node last;
   private int counter;
   
   NodeList () {
      first = null;
      last = null;
      counter = 0;
   }
   public boolean isEmpty() {
      return counter == 0;
   }
   public boolean add (Node item) {
      if (isEmpty()) {
         first = item;
         last = item;
      } else {
         last.tail = item;
         last = item;
      }
      counter++;
      return true;
   }
   public boolean delete (int location) {
      if (!isEmpty()) {
         if (location >= counter || location < 0)
            return false;
            
         if (location == 0) 
            first = first.tail;
          else if (location == counter - 1)  {
            Node tempNode = first;
            
            for (int i = 0; i < counter - 1; i++) {
               tempNode = tempNode.tail;
            }
            tempNode.tail = null;
            last = tempNode;
          }
          else {
            Node tempNode = first;
            
            for (int i = 0; i < location - 1; i++) {
               tempNode = tempNode.tail;
            }
            tempNode.tail = tempNode.tail.tail;
         }
         counter--;
         return true;
      }
      return false;
   }
   public void display() {
      if (!isEmpty()) {
         Node tempNode = first;
         
         for (int i = 0; i < counter; i++) {
            System.out.print(tempNode.value);
            
            if (i != counter - 1)
               System.out.print(" -> ");
               
            tempNode = tempNode.tail;
         }
         System.out.println();
      } else {
         System.out.println("List is Empty.");
      }
   }
}