package mex.s03;

public class Exercise4 {
    /**
     * Check if the passed day requires an early wake up
     * 
     * @param day
     * @param vacation false when in a working period
     * @return false during weekend or holiday
     */
    public static boolean isAlarmSet(WeekDay day, boolean vacation) {
        if (vacation) {
        	return false;
        }
        if (day == WeekDay.SATURDAY || day == WeekDay.SUNDAY) {
        	return false;
        } else {
        	return true;
        }
    } // potrei farlo anche con switch perché day è enum.
}
