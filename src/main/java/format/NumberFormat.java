package format;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.MAY;

/**
 * Created by Ежище on 05.03.2017.
 * http://darkraha.com/rus/java/lang/string/formatable_string.php
 */
public class NumberFormat {
    public static void main(String[] args) {
            /*
    Formatter - класс для форматирования строки;
    Formattable - интерфейс форматирования для объектов;
    System.out.printf(...) - форматированный вывод в системную консоль;
    String.format(...) - создание отформатированной строки;

структура шаблона

%[argument_index$][flags][width][.precision]conversion

    argument_index - опциональный параметр указывающий номер аргумента, первый аргумент - "1$", второй - "2$", и т.д.;
    flags - опциональный параметр, набор символов модифицирующих формат вывода. Набор флагов зависит от conversionх;
    width - ширина, опциональный параметр задающий минимальное число символов, которое должно быть записано;
    precision - точность, опциональный параметр обычно ограничивающий число выводимых символов, более спец. значения зависит от conversion;
    conversion - преобразование, обязательный параметр символ задающий как аргумент должен быть отформатирован. Множество допустимых значений для конкретного аргумента зависит от типа аргумента;

преобразования

    'b', 'B' - в логический тип, если аргумент null, выводится строка "false". Если аргумент типа boolean или Boolean, вызывается String.valueOf(). В остальных случаях результат "true";
    'h', 'H' - в шестнадатиричное целое число. Если аргумент null, выводится "null". В остальных случаях вызывается Integer.toHexString(arg.hashCode());
    'sv, 'S' - в строку. Если аргумент null, выводится "null". Если аргумент с интерфейсом Formattable, то вызывается его метод formatTo. В остальных случаях вызывается метод аргумента arg.toString();
    'c', 'C' - в юникод символ;
    'd' - в целое десятиченое число;
    'o' - в целое восмиричное числов;
    'x', 'X' - в целое шестнадцатириченое число;
    'e', 'E' - вещественное число в научной нотации;
    'f' - десятичное вещественое число;
    'g', 'G' - вещественное число в научной нотации или в десятичном формате в зависимости от точности (параметр precision), значение округляется;
    'a', 'A' - шестнадцатиричное вещественное число с точкое и экспонентой ;
    't', 'T' - префикс для преобразования временных значений, далее идут уточнияющие символы преобразования;
    '%' - вывод сивола '%' ('\u0025');
    'n' - вывод разделителя строк используемого на текущей платформе;
     *  **/
// примеры из офф. док.
        Calendar c = new GregorianCalendar(1995, MAY, 23);
        String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
        // -> s == "Duke's Birthday: May 23, 1995"

        StringBuilder sb = new StringBuilder();
        // отсылаем весь вывод в Appendable объект sb
        Formatter formatter = new Formatter(sb, Locale.US);

        // вывод строк в обратном порядке
        String s2 = formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d").toString();
        System.out.println(s2);
        // результат -> " d  c  b  a"

        // выводим вещественное число так как принято это во франции
        formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E);
        // результат -> "e =    +2,7183"

// вывод в консоль (системный поток вывода)
        System.out.format("Local time: %tT", Calendar.getInstance());
// результат -> "Local time: 13:34:18"
    }

    /* TODO: и так далее - см. на сайте **/
}
