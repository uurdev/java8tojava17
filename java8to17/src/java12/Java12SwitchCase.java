package java12;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public class Java12SwitchCase {
    public static void main(String[] args) {
        Month currentMonth = LocalDate.now().getMonth();
        switch (currentMonth) {
            case JANUARY, FEBRUARY, MARCH -> System.out.println("First Quarter");  // break gerek yok
            case APRIL, MAY, JUNE -> System.out.println("Second Quarter");
            case JULY, AUGUST, SEPTEMBER -> System.out.println("Third Quarter");
            case OCTOBER, NOVEMBER, DECEMBER -> System.out.println("Fourth Quarter");
            default -> System.out.println("Unknown Quarter");
        }
    }
}
