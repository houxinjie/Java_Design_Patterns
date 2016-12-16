package Dao;
import java.util.List;
/**
 * Created by houxinjie on 2016/12/16.
 */
public interface StudentDao {
    public List<Student>  getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
