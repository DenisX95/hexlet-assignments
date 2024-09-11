package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var map = storage.toMap();

        map.forEach((k, v) -> {
            map.put(v, k);
        });

    }
}
// END
