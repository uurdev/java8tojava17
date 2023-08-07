import java10.Java10LocalVariable;
import java10.Java8LocalVariable;
import java14.Java14RecordEmployee;
import java14.Java8Employee;
import java16.User;
import java17.Child1;

public class Main {
    public static void main(String[] args) {
        //topicVariable();
        //topicRecords();
        //topicInstanceOf();
        //topicUseFullNullPointerException();
        sealedExample();

    }

    private static void sealedExample() {
        Child1 child1 = new Child1("test");
        child1.callMethod();
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

        var java14Employee = new Java14RecordEmployee("ugur", "ciftci");
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