import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Leap Year Calculator tests")
public class LeapYearCalculatorTests {

    private LeapYearCalculator leapYearCalculator;

    @BeforeEach
    private void init() {
        leapYearCalculator = new LeapYearCalculator();
    }

    @DisplayName("All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)")
    @Test
    public void all_years_divisible_by_400_are_leap_years() {
        assertTrue(leapYearCalculator.isLeapYear(2000));
    }

    @DisplayName("All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year)")
    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900, 2100})
    public void test_that_years_divisible_by_100_but_not_400_are_not_leap_years(int year) {
        assertFalse(leapYearCalculator.isLeapYear(year));
    }
}
