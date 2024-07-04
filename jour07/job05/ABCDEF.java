class A {
    public A() {}
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B {
    public C() {
        super();
    }
}

class D extends A {
    protected int d = 1;
    
    public D(int x) {
        super();
        this.d = x;
    }

    public D() {}

    public int getIntD() {
        return this.d;
    }
}

class E extends D {
    public E() {
        super();
    }
}

class F extends D {
    public F() {
        super();
    }
}


public class ABCDEF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        /*
        On ne peut pas convertir un objet de classe parent en objet de classe
        enfant
        b = a;
        
        On ne peut pas convertir le type null
        null = a;

        On ne peut pas convertir D à B car ils sont sur différentes 'branches'
        de l'héritage
        b = d;
        */

        a = b;
        a = (A) b;
        a = null;
        a = d;
        a = e;
        d = e;

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        rechercher(as);
        additionner(as);
    }

    private static void rechercher(A[] as) {
        int totalB = 0;

        for (A obj : as) {
            if (obj instanceof B) totalB += 1;
        };

        System.out.printf("Il y a %d instances de la classe B %n", totalB);
    }

    private static void additionner(A[] as) {
        int sumD = 0;

        for (A obj : as) {
            if (obj instanceof D) sumD += ((D) obj).getIntD();
        }

        System.out.printf("Somme des variables d: %d %n", sumD);
    }
}