package singletonpatternexample;

/**
 * Test class to verify Singleton behavior.
 */
public class SingletonTest {

    public static void main(String[] args) {


        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify both references point to same object
        if (logger1 == logger2) {
            System.out.println("Singleton Pattern Verified!");
            System.out.println("Both references point to the same Logger object.");
        } else {
            System.out.println("Singleton Pattern Failed!");
        }

        // Display hash codes
        System.out.println("Logger1 HashCode : " + logger1.hashCode());
        System.out.println("Logger2 HashCode : " + logger2.hashCode());
        /* OUTPUT:-
        Logger instance created.
        Singleton Pattern Verified!
        Both references point to the same Logger object.
        Logger1 HashCode : 1595428806
        Logger2 HashCode : 1595428806
        As the Logger instance created. is printed once..Therefore Singleton Design Pattern is achieved in it
        And The HashCodes are also same because only one instance of that class is created!!
         */
    }
}