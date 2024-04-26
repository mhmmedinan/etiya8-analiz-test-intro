package OOP.polymorfizm;

public class Main {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        Logger databaseLogger = new DatabaseLogger();

        Logger[] loggers = {fileLogger,databaseLogger};
        /*for (Logger logger:loggers){
            logger.log();
        }*/
    }
}
