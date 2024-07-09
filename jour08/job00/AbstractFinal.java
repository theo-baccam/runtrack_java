abstract class A {
    int a;
}

class B extends A {
    int b;
}

class C extends A {
    final double c = 1;
}

abstract class D extends A {
    double d;
    int operation(int a) {
        return (a * 2);
    }
    // abstract int calcul(int b) {
    // }
    // Une methode abstraite ne peut pas avoir de corps (pas de brackets)
    abstract int calcul(int b);
    abstract int machin();
}


class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        // tab[0] = new A();
        // Puisque A est une classe abstraite, elle ne peut pas avoir d'instance

        tab[1] = new B();
        tab[2] = new C();

        // tab[1].b = 2;
        // Puisque c'est une array d'instances de classe A, qui ne possede
        // pas d'attribut b, il faut convertir tab[1] en B
        ((B)tab[1]).b = 2;

        // ((C)tab[2]).c = 3;
        // On ne peut pas changer la valeur d'une variable final
    }
}