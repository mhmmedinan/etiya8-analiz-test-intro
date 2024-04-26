package OOP.inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager(){
        students = new ArrayList<>();
       Student student = new Student();
       student.setId(1);
       student.setFirstName("Melodi");
       student.setLastName("Bayraktar");
       student.setEmail("melodi@hotmail.com");
       student.setAbout("Qa Tester");
       student.setCreatedDate(LocalDateTime.now());

       students.add(student);
    }

    public List<Student> getAll(){
        return students;
    }

    public void add(Student student){
        student.setCreatedDate(LocalDateTime.now());
        students.add(student);
    }



}
