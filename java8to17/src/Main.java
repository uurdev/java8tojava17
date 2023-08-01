import instanceofs.User;
import java9.OperationMethod;
import localvariable.Java10LocalVariable;
import localvariable.Java8LocalVariable;
import records.Java14Employee;
import records.Java8Employee;

public class Main {
    public static void main(String[] args) {
        topicJava9();
        //topicVariable();
        //topicRecords();
        //topicInstanceOf();
        topicUseFullNullPointerException();

    }

    private static void topicJava9() {
        OperationMethod operationMethod = new OperationMethod();
        operationMethod.doSomething();
    }

    private static void topicUseFullNullPointerException() {
        User user = new User();
        System.out.println(user.getUsername());
        user = null;
        System.out.println(user.getUsername());
    }

    private static void topicInstanceOf() {
        User user = new User();
        user.setUsername("uur");
        user.setPwd("dev");
        java8InstanceOfExample(user);
        java16InstanceOfExample(user);
    }

    private static void java16InstanceOfExample(Object obj) {
        if (obj instanceof User user) {
            System.out.println(user.getUsername());
        }
    }

    static void java8InstanceOfExample(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            System.out.println(user.getUsername());
        }
    }

    static void topicRecords() {
        var java8Employee = new Java8Employee("ugur", "ciftci");
        System.out.println(java8Employee.getLastName());

        var java14Employee = new Java14Employee("ugur", "ciftci");
        System.out.println(java14Employee.name());
    }

    static void topicVariable() {
        try {
            final var java8Local = new Java8LocalVariable();
            java8Local.connectGoogle();

            final var java10Local = new Java10LocalVariable();
            java10Local.connectGoogle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}