package FIFOQueues;

class QueueUsingArray {
    private int[] queue;
    private int front, rear, size, capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        this.rear = (this.rear + 1) % this.capacity;
        this.queue[this.rear] = item;
        this.size++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        int item = this.queue[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return item;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public int size() {
        return this.size;
    }



    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(77);
        queue.enqueue(29);
    
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}
