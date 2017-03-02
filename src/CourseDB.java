import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that acts as a database for college courses.
 *
 * @author dmp6637 (David Pastuch)
 */
public class CourseDB implements DB<Integer, Course> {

    private HashMap<Integer, Course> courses = new HashMap<>();

    /**
     * Check if the database contains this ID.
     * @return True if database contains ID, otherwise false
     */
    @Override
    public boolean hasKey(Integer id) {
        return courses.containsKey(id);
    }

    /**
     * Get all the courses in the database.
     * @return Collection of all courses
     */
    @Override
    public Collection<Course> getAllValues() {
        ArrayList<Course> courseList = new ArrayList<>();
        for(Map.Entry<Integer, Course> i: courses.entrySet()) {
            courseList.add(i.getValue());
        }
        return courseList;
    }

    /**
     * Add a value to the database.
     * @param course Course to add
     * @return The previous value associated with the key, otherwise null
     */
    @Override
    public Course addValue(Course course) {
        Course oldCourse = courses.get(course.getId());
        courses.put(course.getId(), course);
        return oldCourse;
    }

    /**
     * Get the value associated with this key.
     * @param id ID in database
     * @return Course associated with ID
     */
    @Override
    public Course getValue(Integer id) {
        return courses.get(id);
    }
}
