import java.util.Comparator;

/**
 * A class that overrides the natural order comparison of courses to order
 * them numerically by course number, then alphabetically by course name.
 *
 * @author dmp6637 (David Pastuch)
 */
public class CourseComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        int levelDiff = o2.getLevel() - o1.getLevel();
        if(levelDiff == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return levelDiff;
    }
}
