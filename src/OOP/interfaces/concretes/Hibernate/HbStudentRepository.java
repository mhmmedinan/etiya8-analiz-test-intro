package OOP.interfaces.concretes.Hibernate;

import OOP.inheritance.Student;
import OOP.interfaces.abstracts.StudentRepository;
import OOP.interfaces.genericrepositories.HbBaseRepository;

public class HbStudentRepository extends HbBaseRepository<Student> implements StudentRepository {

}
