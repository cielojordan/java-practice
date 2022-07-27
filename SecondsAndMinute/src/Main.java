public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        // Call both methods to print values to the console
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-42));

    }
    // ===== CHALLENGE ===== //
    /* Create a method called getDurationString with two params: minutes and seconds
    * minutes >= 0
    * seconds >=0 and seconds <=59
    * If either are not true, return "Invalid value"
    * If valid, calculate how many hours, minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represents the number of hours, YY the minutes and ZZ the seconds
    */

    public static String getDurationString( long minutes, long seconds) {
        return (minutes >=0 && (seconds >=0 && seconds <=59)) ? minutes/60 + "h " + minutes % 60 + "m " + seconds +"s" : INVALID_VALUE_MESSAGE;
    }

    /* Create a 2nd method of the same name with only seconds as the one param
    * seconds >=0; return "Invalid value" if not true
    * Calculate correct number of minutes into seconds and pass to the other overloaded method to calculate correct number of hours as well*/

    public static String getDurationString(long seconds) {
        return (seconds >=0) ? getDurationString(seconds / 60, seconds % 60): INVALID_VALUE_MESSAGE;
    }
}