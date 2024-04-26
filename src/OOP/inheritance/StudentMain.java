package OOP.inheritance;

import OOP.interfaces.concretes.Hibernate.HbStudentRepository;
import OOP.interfaces.concretes.inmemory.ImStudentRepository;
import OOP.interfaces.genericrepositories.InMemoryBaseRepository;
import OOP.polymorfizm.DatabaseLogger;
import OOP.polymorfizm.FileLogger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager(new DatabaseLogger(),new ImStudentRepository());
        List<Student> responses = studentManager.getAll();

        User user = new Student();


        Student student1 = new Student();
        student1.setId(2);
        student1.setFirstName("Kubilay");
        student1.setLastName("Özer");
        student1.setEmail("kubilay@hotmail.com");
        student1.setAbout("Qa Tester");


        studentManager.add(student1);

        for (Student student : responses) {
            System.out.println("Kayıt olan öğrencinin Adı ve Soyadı : " +
                    student.getFirstName() + " " + student.getLastName());
            System.out.println("Email bilgisi : " + student.getEmail());
            System.out.println("Hakkında : " + student.getAbout());
            System.out.println("Sisteme kayıt tarihi : " + student.getCreatedDate());
        }

        studentManager.add2(student1);


    }
}

