package arrays;

/**
 * Created by Ежище on 25.02.2017.
 */
public class ArrayHomogeneity {
    /* Являются ли массивы в Java однородными? - Да. За исключением случаев, разрешённых полиморфизмом. **/
    B[] b = {new B(), new B(), new C(), new D() /*new A(), new E() - вот это не лезет, ни родитель, ни посторонний */};

    //    B[] ba = new A[5]; // - так тоже не получается
    B[] ba = new C[5];
    {
        ba[0] = new B();
        ba[1] = new C();
        ba[2] = new D();
//        ba[3] = new E();
//        ba[4] = new A();
    }
}

class A {}

class B extends A {}

class C extends B {}

class D extends C {}

class E {}
