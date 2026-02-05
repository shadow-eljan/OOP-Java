package Lab3;

import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {

        // create GregorianCalendar object with current date
        GregorianCalendar calendar = new GregorianCalendar();

        // get year, month, and day
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // months start from 0
        int day = calendar.get(GregorianCalendar.DATE);

        // display result
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
