package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var keys = storage.toMap().keySet();

        for (var key : keys) {
            var value = storage.get(key, "default");
            storage.unset(key);
            storage.set(value, key);
        }
    }
}
// END
