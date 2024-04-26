package OOP.inheritance;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        List<Student> responses = studentManager.getAll();


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
        }


    }
}

