package FIFOQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    private Queue<Integer> queue;

    public QueueUsingLinkedList() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        this.queue.add(item);
    }

    public int dequeue() {
        if (this.queue.isEmpty())
            throw new RuntimeException("Queue is empty");
        return this.queue.poll();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public int size() {
        return this.queue.size();
    }

    public static void main(String[] args) {
    	QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(66);
        queue.enqueue(44);
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}
