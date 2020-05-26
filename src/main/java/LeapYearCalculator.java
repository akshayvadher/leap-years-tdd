public class LeapYearCalculator {

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }
}
