package service.copy;

import com.example.demo.entity.Student;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(long id);

    void deleteStudentById(long id);
}