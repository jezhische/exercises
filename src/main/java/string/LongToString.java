package string;

/**
 * Created by Ежище on 25.02.2017.
 */
public class LongToString {
    static public  void main(String args[]) {
        long l = 0;
        String s = new String();
        s = "" + l;
        System.out.println(s);
//        s = l.toString(); // нет toString у примитивов
//        s = Long.parse(l); // нет такого, есть l = Long.parseLong(s);
        s = Long.toString(l);
        System.out.println(s);
    }
}
