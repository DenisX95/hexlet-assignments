package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
class App {

    public static void save(Path path, Car car) {

        String content = null;
        try {
            content = car.serialize();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.writeString(path, content,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car extract(Path path) {
        try {
            return Car.deserialize(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
// END
