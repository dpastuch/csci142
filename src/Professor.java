/**
 * Class representing a professor.
 *
 * @author dmp6637 (David Pastuch)
 */
public class Professor extends User{

    public Professor(String username) {
        super(username, UserType.PROFESSOR, new CourseComparator());
    }
}
