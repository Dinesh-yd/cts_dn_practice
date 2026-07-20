package singletonpatternexample;
/**
  * Singleton Design Pattern
 * Purpose:
  Ensure that only one Logger object exists
  throughout the application lifecycle.
 */
public class Logger {
    /*
     * Static variable that stores the single instance of the Logger class.
     */
    private static Logger loggerInstance;

    /*
      Private constructor prevents object creation using the 'new' keyword from outside the class.Makes class Singleton
     */
    private Logger() {
        System.out.println("Logger instance created.");
    }

    /*
     Public method to provide global access to the single Logger object.
     */
    public static Logger getInstance() {

        // Create object only if it does not exist..Also called Lazy Initialization
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }

        return loggerInstance;
    }


}