package OOP.interfaces.genericrepositories;

import OOP.inheritance.Student;

import java.util.ArrayList;
import java.util.List;

public class HbBaseRepository<TEntity> implements Repository<TEntity> {


    @Override
    public void add(TEntity entity) {
        System.out.println("Hibernate kodlarına göre eklendi" + entity.toString());
    }

    @Override
    public void update(TEntity entity) {
        System.out.println("Hibernate kodlarına göre güncellendi" + entity.toString());
    }
}
