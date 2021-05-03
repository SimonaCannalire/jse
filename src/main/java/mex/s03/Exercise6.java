package mex.s03;

public class Exercise6 {
    /**
     * Leap year checker
     * 
     * @param year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
       if (year % 100 ==0) {
    	   if (year % 400 ==0) {
    		   return true;
    	   }
    	   return false;
       }
    	if (year % 4 == 0) { // per vedere se anno bisestile: 
        return true;   // divisibile per 4? divisibile per 400? tipo 1900
        } else {
        return false;
        }
    }
}
// if ((year%4==0) && (year%100==0 || year%400==0)) {
// return true;
// } else {
// return false;
