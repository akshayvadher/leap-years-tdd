public class LeapYearCalculator {

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
}
