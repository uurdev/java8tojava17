package java9;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public interface Operation {
    default void addition() {
        System.out.println("default method addition");
    }

    default void multiply() {
        division();
        System.out.println("default method multiply");
    }

    private void division() {         // private method
        System.out.println("private method division");
    }
}
