package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static List<String> buildApartmentsList(List<Home> apartments, int itemsLimit) {
        return apartments.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .map(Home::toString)
                .limit(itemsLimit)
                .collect(Collectors.toList());
    }
}
// END
