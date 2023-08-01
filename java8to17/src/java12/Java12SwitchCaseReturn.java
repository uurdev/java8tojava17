package java12;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public class Java12SwitchCaseReturn {
    public static void main(String[] args) {
        Month currentMonth = LocalDate.now().getMonth();
        String quarterMonth = switch (currentMonth) {
            case JANUARY, FEBRUARY, MARCH -> "First Quarter";  // break gerek yok
            case APRIL, MAY, JUNE -> "Second Quarter";
            case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
            case OCTOBER, NOVEMBER, DECEMBER -> "Fourth Quarter";
            default -> "Unknown First Quarter";
        };
        System.out.println(quarterMonth);
    }
}
