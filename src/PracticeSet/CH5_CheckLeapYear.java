package PracticeSet;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Year;

public class CH5_CheckLeapYear {
    public static void main(String[] args) {

        int year = 2028;

        boolean check = Year.isLeap(year);
        System.out.println(check);
    }
}
