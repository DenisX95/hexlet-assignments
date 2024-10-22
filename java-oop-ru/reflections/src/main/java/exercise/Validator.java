package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {

    public static List<String> validate(Object address) {

        Field[] fields = address.getClass().getDeclaredFields();
        var result = new ArrayList<String>();

        for (Field field : fields) {

            field.setAccessible(true);
            try {
                if (field.isAnnotationPresent(NotNull.class) && field.get(address) == null) {
                    result.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }
}

// END
