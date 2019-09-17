import by.sws.challenge.selector.TopTenSelector;
import by.sws.challenge.selector.TopTenSelectorImpl;
import java.util.List;
import java.util.stream.Stream;
import org.junit.Test;

public class TopTenSelectorTest {

  private TopTenSelector topTenSelector = new TopTenSelectorImpl();

  @Test
  public void test() {
    int limit = 100000000;
    Stream<Integer> stream = Stream.iterate(0, i -> i + 1).limit(limit);
    List<Integer> list = topTenSelector.topN(stream);
    list.forEach(System.out::println);
  }

}