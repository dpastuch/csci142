/**
 * Class representing a student.
 *
 * @author dmp6637 (David Pastuch)
 */
public class Student extends User{

    public Student(String username) {
        super(username, UserType.STUDENT,
                (c1, c2) -> c1.getName().compareTo(c2.getName()));
    }
}
