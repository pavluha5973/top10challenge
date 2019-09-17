package by.sws.challenge.selector;

import by.sws.challenge.queue.BoundedPriorityQueue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopTenSelectorImpl implements TopTenSelector {

    @Override
    public List<Integer> topN(Stream<Integer> input) {
        int limit = 10;
        PriorityQueue<Integer> queue = new BoundedPriorityQueue(limit);
        input.forEach(queue::offer);
        return queue.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
