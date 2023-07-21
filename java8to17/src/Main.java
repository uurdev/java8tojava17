import localvariable.Java10LocalVariable;
import localvariable.Java8LocalVariable;
import records.Java14Employee;
import records.Java8Employee;

public class Main {
    public static void main(String[] args) {
        topicVariable();
        topicRecords();
    }

    static void topicRecords(){
        var java8Employee = new Java8Employee("ugur","ciftci");
        System.out.println(java8Employee.getLastName());

        var java14Employee = new Java14Employee("ugur","ciftci");
        System.out.println(java14Employee.name());
    }
    static void topicVariable(){
        try {
            final var java8Local = new Java8LocalVariable();
            java8Local.connectGoogle();

            final var java10Local = new Java10LocalVariable();
            java10Local.connectGoogle();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}