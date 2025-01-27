package exercise.dto.users;

import exercise.model.User;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@Getter
public class UsersPage {
    private List<User> users;

    public UsersPage(List<User> users) {
        this.users = users;
    }
}
// END
