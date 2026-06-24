public class SOLIDPrinciples {

    public static void main(String[] args) {

        System.out.println("===== SRP =====");
        SalaryService salaryService = new SalaryService();
        salaryService.calculateSalary();

        System.out.println("\n===== OCP =====");
        Notification notification = new EmailNotification();
        notification.send();

        System.out.println("\n===== LSP =====");
        Flyable bird = new Sparrow();
        bird.fly();

        System.out.println("\n===== ISP =====");
        Human human = new Human();
        human.work();
        human.eat();

        System.out.println("\n===== DIP =====");
        Database database = new MySQLDatabase();
        UserService userService = new UserService(database);
        userService.saveUser();
    }
}

/* =====================================================
   SRP - Single Responsibility Principle
   A class should have only one responsibility.
   ===================================================== */

class SalaryService {

    public void calculateSalary() {
        System.out.println("Calculating Salary");
    }
}

/* =====================================================
   OCP - Open Closed Principle
   Open for extension, closed for modification.
   ===================================================== */

interface Notification {
    void send();
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

/* =====================================================
   LSP - Liskov Substitution Principle
   Child classes should replace parent classes
   without breaking functionality.
   ===================================================== */

interface Flyable {
    void fly();
}

class Sparrow implements Flyable {

    @Override
    public void fly() {
        System.out.println("Sparrow is Flying");
    }
}

/* =====================================================
   ISP - Interface Segregation Principle
   Do not force a class to implement methods
   it does not need.
   ===================================================== */

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Human Working");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating");
    }
}

/* =====================================================
   DIP - Dependency Inversion Principle
   Depend on abstractions, not concrete classes.
   ===================================================== */

interface Database {
    void save();
}

class MySQLDatabase implements Database {

    @Override
    public void save() {
        System.out.println("Saving Data in MySQL");
    }
}

class UserService {

    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser() {
        database.save();
    }
}
