import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that represents a database of users.
 *
 * @author dmp6637 (David Pastuch)
 */
public class UserDB implements DB<String, User> {

    private HashMap<String, User> users;

    /**
     * Create a new user.
     */
    public UserDB() {
        users = new HashMap<>();
    }

    /**
     * Add a user to the database.
     * @param user User to add
     * @return The old user with this username
     */
    @Override
    public User addValue(User user) {
        User oldUser = users.get(user);
        users.put(user.toString(), user);
        return oldUser;
    }

    /**
     * Get all the users in this database.
     * @return All users
     */
    @Override
    public Collection<User> getAllValues() {
        ArrayList<User> userList = new ArrayList<>();
        for(Map.Entry<String, User> i : users.entrySet()) {
            userList.add(i.getValue());
        }
        return userList;
    }

    /**
     * Get the user with this username.
     * @param username The username
     * @return The user
     */
    @Override
    public User getValue(String username) {
        return users.get(username);
    }

    /**
     * Check if the database contains this user.
     * @param username The username
     * @return True if user is in database, otherwise false
     */
    @Override
    public boolean hasKey(String username) {
        return users.containsKey(username);
    }
}
