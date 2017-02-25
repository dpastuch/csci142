import java.util.Comparator;

/**
 * A class that overrides the natural order comparison of courses to order
 * them alphabetically by course name.
 *
 * @author dmp6637 (David Pastuch)
 */
public class CourseComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o2.getId() - o1.getId();
    }
}
