package OOP.polymorfizm;

public class DatabaseLogger extends Logger{
    @Override
    public void log(Object object) {
        //konfigurasyon kodları
        System.out.println("Veritabanına loglandı" + object);
    }
}
