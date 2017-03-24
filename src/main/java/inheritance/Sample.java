package inheritance;

/**
 * Created by Ежище on 23.03.2017.
 */
public class Sample {
    public static void main(String[] args) throws Exception {
        A ab = new B();
//    B ba = new A();
        B.notOverrided();
        B.callStatic();
    }
}
class A {
    Number printMsg() throws Exception {
        System.out.println("msg A");
        return 5;
    }

    static void notOverrided() {
        System.out.println("This static method from A will not overrided");
    }

    static void callStatic() {
        System.out.println("Though, B can call static method from parent class A if it haven't method with the same name");
    }

}

class B extends A {
    @Override
    protected Integer printMsg() throws RuntimeException {
        try {
            super.printMsg();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("msg B");
        return 10;
    }

    void yet() {System.out.println("yet in B");}

    static void notOverrided() {
        System.out.println("This static method was not overrided from A and now is executing method from B");
    }
//    void callStatic() {} - а вот это компилятор воспринимает как попытку переопределения статического метода из
    // класса-родителя, и не позволяет это сделать
}
