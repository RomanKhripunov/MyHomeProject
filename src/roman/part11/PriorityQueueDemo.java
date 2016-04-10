package roman.part11;

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQueue(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 20, 22, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQueue(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQueue(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        QueueDemo.printQueue(stringsPQ);

        stringsPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueueDemo.printQueue(stringsPQ);

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> charPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQueue(charPQ);

        charPQ = new PriorityQueue<>(charSet.size(), Collections.reverseOrder());
        charPQ.addAll(charSet);
        QueueDemo.printQueue(charPQ);
    }
}
