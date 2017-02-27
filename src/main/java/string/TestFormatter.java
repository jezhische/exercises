package string;

import java.util.Formatter;

/**
 * Created by Ежище on 25.02.2017.
 */
public class TestFormatter {
    public static void main(String... args){
        Integer I1 = 0;
        Integer I2 = -1;
        Integer I3 = 1;
        Formatter f = new Formatter();
        f.format("%1$b ", I1.toString())
                .format("%1$b ", I2.toString())
                .format("%1$b ", I3.toString());
        System.out.println(f.toString());
    }
    /* метод format() работает с объектами, а не со значениями примитивных типов.
Последовательность %b анализируется так:
если передан объект типа Boolean, то результатом будет текстовое представление для этого объекта;
нулевая ссылка (null) соответствует false;
ненулевая ссылка соответствует true.

 Знак $ используется в форматной строке для указания индекса аргумента.
1$ - означает, что в этой позиции будет использоваться первый аргумент, 2$ - второй, и т.д.
Благодаря этому, например, в форматной строке один и тот же аргумент можно использовать несколько раз.
Подробнее см. в спецификации языка:
<a href='http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax'>http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax</a>**/
}
