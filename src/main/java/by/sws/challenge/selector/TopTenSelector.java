package by.sws.challenge.selector;

import java.util.List;
import java.util.stream.Stream;

public interface TopTenSelector {

  List<Integer> topN(Stream<Integer> input);
}
