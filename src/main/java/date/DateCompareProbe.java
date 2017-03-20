package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ежище on 18.03.2017.
 */
public class DateCompareProbe {
    public static int timePointer(DateFormat dateFormat) {
        try {
            return Integer.valueOf(dateFormat.format(new Date()));
        } catch (NumberFormatException e) {
            System.out.println("Wrong date format");
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(new Date().getTime());
        DateFormat dateFormat = new SimpleDateFormat("H");
        System.out.println(dateFormat.format(new Date()));

        System.out.println(timePointer(dateFormat));
    }
}
