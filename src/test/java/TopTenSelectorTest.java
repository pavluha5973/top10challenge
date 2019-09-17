import by.sws.challenge.selector.TopTenSelector;
import by.sws.challenge.selector.TopTenSelectorImpl;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class TopTenSelectorTest {

    private TopTenSelector topTenSelector = new TopTenSelectorImpl();

    /**
     * Test of the {@link TopTenSelector#topN(Stream)} method with a stream of 100000000 integers
     */
    @Test
    public void testTopN() {
        int limit = 100000000;
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1).limit(limit);
        List<Integer> list = topTenSelector.topN(stream);
        list.forEach(System.out::println);
    }

}