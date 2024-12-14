public class QueueArray {
    Object[] arr;
    int count;

    QueueArray(int size) {
        arr = new Object[size];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == arr.length;
    }

    public boolean enqueue (Object value) {
        if (isFull())
            return false;

        arr[count++] = value;

        return true;
    }

    public boolean dequeue () {
        if (isEmpty())
            return false;

        for (int i = 0; i < count - 1; i++) {
                arr[i] = arr[i+1];
            }
        arr[--count] = null;

        return true;
    }

    public Object front() {
        if (isEmpty())
            return null;
        
        return arr[0];
    }

    public String toString () {
        StringBuilder output = new StringBuilder();

        if (isEmpty())
            return "Queue is empty..";
            
        for (int i = 0; i < count; i++) {
            output.append("[" + arr[i] + "]" + "\n");
        }
        
        return output.toString();
    }


}
