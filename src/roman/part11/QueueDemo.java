package roman.part11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);

        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        printQueue(queue);

        Queue<Character> queue1 = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            queue1.offer(c);
        }
        printQueue(queue1);

//        Queue<String> queue2 = new LinkedList<>();
//        System.out.println(queue2.peek());
//        System.out.println(queue2.remove());
//        System.out.println(queue2.poll());
//        System.out.println(queue2.element());

    }

    public static void printQueue(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
