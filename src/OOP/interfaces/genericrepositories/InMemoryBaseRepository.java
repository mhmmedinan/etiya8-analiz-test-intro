package OOP.interfaces.genericrepositories;

public class InMemoryBaseRepository<TEntity> implements Repository<TEntity> {
    @Override
    public void add(TEntity entity) {
        System.out.println("InMemory kodlarına göre eklendi" + entity.toString());
    }

    @Override
    public void update(TEntity entity) {
        System.out.println("InMemory kodlarına göre güncellendi" + entity.toString());
    }
}
