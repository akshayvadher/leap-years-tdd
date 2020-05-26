public class LeapYearCalculator {

    public boolean isLeapYear(int year) {
        boolean leapYear = false;

        if ((year % 400 == 0)
                ||
                (year % 100 != 0 && year % 4 == 0)) {
            leapYear = true;
        }
        return leapYear;
    }
}
