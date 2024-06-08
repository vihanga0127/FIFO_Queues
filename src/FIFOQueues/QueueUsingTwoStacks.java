package FIFOQueues;

import java.util.Stack;

class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(54);
        queue.enqueue(61);
        System.out.println("Dequeued item: " + queue.dequeue()); 
        System.out.println("Queue size: " + queue.size());       
        queue.enqueue(99);
        System.out.println("Dequeued item: " + queue.dequeue()); 
        System.out.println("Queue size: " + queue.size());       
    }
}
