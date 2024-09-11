package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        System.out.println(1);
        var map = storage.toMap();
        System.out.println(2);
        map.forEach((k, v) -> {
            map.put(v, k);
        });

    }
}
// END
