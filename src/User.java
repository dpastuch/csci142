import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Class representation of a user in SIS (students and professors).
 *
 * @author dmp6637 (David Pastuch)
 */
public class User implements Comparable<User>{

    public enum UserType {
        PROFESSOR, STUDENT
    }

    private TreeSet<Course> courses;
    private User.UserType type;
    private String username;

    /**
     * Create a new user.
     * @param username Username
     * @param type Type of user
     * @param comp Comparator to use
     */
    public User(String username, User.UserType type, Comparator<Course> comp) {
        courses = new TreeSet<>(comp);
        this.type = type;
        this.username = username;
    }

    /**
     * Add a course to this user's list of courses.
     * @param course Course to add
     * @return True if course was successfully added, otherwise false.
     */
    public boolean addCourse(Course course) {
        return courses.add(course);
    }

    /**
     * See if this user's username is alphabetically greater than another's.
     * @param other Other user
     * @return Value < 0 if less than, value > 0 if greater than, and 0 if the
     *         usernames are alphabetically equal
     */
    public int compareTo(User other) {
        return this.username.compareTo(other.getUsername());
    }

    /**
     * See if this user's username equals another's.
     * @param other Other user
     * @return True if usernames are equal, otherwise false
     */
    public boolean equals(Object other) {
        if(other instanceof User) {
            User user2 = (User) other;
            return this.username.equals(user2.getUsername());
        }
        return false;
    }

    /**
     * Get the courses this user is enrolled in or teaching.
     * @return The courses
     */
    public Collection<Course> getCourses() {
        return this.courses;
    }

    /**
     * Get this user's type.
     * @return The type
     */
    public User.UserType getType() {
        return this.type;
    }

    /**
     * Get this user's username.
     * @return The username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Get a hash value for this user based on their username.
     * @return Hash code
     */
    public int hashCode() {
        return this.username.hashCode();
    }

    /**
     * Remove this user from a course.
     * @param course Course to be removed from
     * @return True if successfully removed, otherwise false
     */
    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }

    /**
     * Returns a string representation of the user in the format
     * User{username=USERNAME, type=TYPE, courses=COURSE_LIST}
     * @return The formatted string
     */
    public String toString() {
        return "User{username=" + this.username + ", type=" + this.type +
                ", courses=" + this.courses +"}";
    }
}
