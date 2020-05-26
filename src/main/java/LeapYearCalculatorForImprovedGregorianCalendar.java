public class LeapYearCalculatorForImprovedGregorianCalendar extends LeapYearCalculatorForGregorianCalendar {

    @Override
    public boolean isLeapYear(int year) {
        if (year % 4000 == 0) {
            return false;
        } else {
            return super.isLeapYear(year);
        }
    }
}
