package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by Ежище on 04.03.2017.
 */
public class SimpleDate {
    /* todo: см. http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html **/
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("date: %s\n", date);

        System.out.println();
        DateFormat df = new SimpleDateFormat("EEEE y MMMM dd hh:mm:ss:S z",  Locale.ENGLISH);
        System.out.println(df.format(new Date()));
        df = DateFormat.getDateInstance();
        System.out.println(df.format(new Date()));
        df = DateFormat.getDateTimeInstance();
        System.out.println(df.format(new Date()));
        df = DateFormat.getDateTimeInstance();
        System.out.println(df.format(new Date()));
        System.out.println();


        GregorianCalendar calendar = new GregorianCalendar(1970,
                Calendar.FEBRUARY, 2);
//        calendar.add(Calendar.MONTH, 2);
        System.out.println(calendar.get(Calendar.MONTH)); // отсчет месяцев начинается с нуля
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DATE));
    }
}
