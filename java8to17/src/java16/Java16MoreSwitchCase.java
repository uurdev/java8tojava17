package java16;

/**
 * @author ugur.ciftci
 * @since 7.08.2023
 */
public class Java16MoreSwitchCase {
    public static void main(String[] args) {
        String operation = "";
        System.out.println(switch (operation) {
            case "add" -> "Adding";
            case "sub" -> "Subtracting";
            case "mul" -> "Multiplying";
            case "div" -> "Dividing";
            default -> {
                if (operation.isEmpty()) {
                    yield "No operation";
                }
                yield "Unknown operation";
            }
        });
    }
}
