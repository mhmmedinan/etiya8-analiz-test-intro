package OOP.interfaces.concretes.inmemory;

import OOP.inheritance.Student;
import OOP.interfaces.abstracts.StudentRepository;
import OOP.interfaces.genericrepositories.InMemoryBaseRepository;

public class ImStudentRepository extends InMemoryBaseRepository<Student> implements StudentRepository {
}
