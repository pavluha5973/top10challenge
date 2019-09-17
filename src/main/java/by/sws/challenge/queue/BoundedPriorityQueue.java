package by.sws.challenge.queue;

import java.util.PriorityQueue;

/**
 * This is extension of {@code PriorityQueue} which has number of integers not greater than bound
 * specified by user in {@link #BoundedPriorityQueue(int)}. The {@link
 * #BoundedPriorityQueue#offer(Integer)} is overriden: it adds integer to the priority queue and
 * then if the size of it is greater than bound then method polls the least integer.
 */
public class BoundedPriorityQueue extends PriorityQueue<Integer> {

    private int bound;

    public BoundedPriorityQueue(int bound) {
        super(bound + 1); // the maximum possible size of this queue is bound + 1
        this.bound = bound;
    }

    @Override
    public boolean offer(Integer integer) {
        boolean offer = super.offer(integer);
        if (size() > bound) {
            poll();
        }
        return offer;
    }
}
