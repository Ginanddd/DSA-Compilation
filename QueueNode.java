public class QueueNode {
    QNode first;
    QNode last;
    int count;

    QueueNode() {
        first = null;
        last = null;
        count = 0;
    }
    
    public boolean isEmpty() {
        return first == null && last == null;
    }

    public boolean enqueue (Object value) {
        QNode newQNode = new QNode(value);

        if (isEmpty()) {
            first = newQNode;
            last = newQNode;
        } else {
            last.next = newQNode;
            last = newQNode;
        }

        count++;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty())
            return false;
        
        if (first == last) {
            first = null;
            last = null;
        } else 
            first = first.next;

        count--;
        return true;
        
    }

    public String toString() {
        String result = "";

        if (isEmpty()) 
            result += "Queue is Empty...";
        else {
            QNode tempQNode = first;
            
            result += "first = [" + first.value + "]\n";
            result += "last  = [" + last.value + "]\n";
       
            while (tempQNode != null) {
                result += "[" + tempQNode.value + "] ->";

                tempQNode = tempQNode.next;
            }
        }

        return result;
    }

    public Object getFirst () {
        if (isEmpty()) 
            return null;
        
        return first.value;
    }

    public Object getLast () {
        if (isEmpty())
            return null;
        
        return last.value;
    }
}
