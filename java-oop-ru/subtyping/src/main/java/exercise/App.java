package exercise;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Set<String> keys = new HashSet<>(storage.toMap().keySet());

        for (var key : keys) {
            var value = storage.get(key, "defautl");
            storage.unset(key);
            storage.set(value, key);
        }
    }
}
// END
