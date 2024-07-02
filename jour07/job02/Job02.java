/*
class Erreur {
    public static void main(String[] args) {
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a); // Correct, posssède attribut a
        System.out.println(y.c); // Incorrect, ne possède pas attribut c
        System.out.println(z.b); // Correct, hérite attribut b
        System.out.println(v.c); // Incorrect, ne possède pas attribut c
        System.out.println(w.a); // Correct, hérite attribut a
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1 {
    int b = 2;
}

class E3 extends E2 {
    int c = 3;
}

class E4 extends E1 {
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}
*/

class Erreur {
    public static void main(String[] args) {
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a);
        System.out.println(y.b);
        System.out.println(z.b);
        System.out.println(v.d);
        System.out.println(w.a);
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1 {
    int b = 2;
}

class E3 extends E2 {
    int c = 3;
}

class E4 extends E1 {
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}