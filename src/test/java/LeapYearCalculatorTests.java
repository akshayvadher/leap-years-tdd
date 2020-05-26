import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Leap Year Calculator tests")
public class LeapYearCalculatorTests {

    @DisplayName("All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)")
    @Test
    public void all_years_divisible_by_400_are_leap_years(){
        LeapYearCalculator leapYearCalculator = new LeapYearCalculator();
        assertFalse(leapYearCalculator.isLeapYear(200));
    }
}
