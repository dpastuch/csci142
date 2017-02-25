/**
 * Created by d1pas on 2/22/2017.
 */
public class Backend {

    private CourseDB courseDB;
    private UserDB userDB;

    public Backend(String courseFile, String professorFile,
                   String studentFile) {
        courseDB = new CourseDB();
    }
}
