import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Leap Year Calculator For Improved Gregorian Calendar tests")
public class LeapYearCalculatorForImprovedGregorianCalendarTests {


    private LeapYearCalculatorForImprovedGregorianCalendar leapYearCalculatorForImprovedGregorianCalendar;

    @BeforeEach
    public void init() {
        leapYearCalculatorForImprovedGregorianCalendar = new LeapYearCalculatorForImprovedGregorianCalendar();
    }

    @DisplayName("Divisible by 4000 is not a leap year")
    @ParameterizedTest
    @ValueSource(ints = {4000, 8000, 12000})
    public void test_that_years_divisible_by_4_are_not_leap_years(int year) {
        assertFalse(leapYearCalculatorForImprovedGregorianCalendar.isLeapYear(year));
    }
}
