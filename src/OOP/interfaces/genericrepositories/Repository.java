package OOP.interfaces.genericrepositories;

public interface Repository<TEntity>{
    void add(TEntity entity);
    void update(TEntity entity);
}
