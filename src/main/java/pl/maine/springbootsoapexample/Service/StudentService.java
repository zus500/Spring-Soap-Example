package pl.maine.springbootsoapexample.Service;


import org.springframework.stereotype.Service;
import pl.maine.springbootsoapexample.student.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentList = new ArrayList<>();

    public StudentService() {

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Paweł");
        student1.setSurname("JakiśTam");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Kinga");
        student2.setSurname("Żadna");

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Oliwer");
        student3.setSurname("Słaby");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }


    public Student getStudentList(long id) {
        return studentList.stream().filter(student -> student.getId()  == id).findFirst().get();
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
