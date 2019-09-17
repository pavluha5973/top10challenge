package by.sws.challenge.queue;

import java.util.PriorityQueue;

public class BoundedPriorityQueue extends PriorityQueue<Integer> {

  private int bound;

  public BoundedPriorityQueue(int bound) {
    super(bound + 1);
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
