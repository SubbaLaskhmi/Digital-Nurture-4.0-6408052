package SingletonPattern;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting Application");
        Logger logger2 = Logger.getInstance();
        logger2.log("Processing Data");
        Logger logger3 = Logger.getInstance();
        logger3.log("Shutting Down");

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("All logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different instances found (Singleton failed).");
        }
    }
}
