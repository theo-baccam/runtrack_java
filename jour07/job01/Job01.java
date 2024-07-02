/*
class Toto {
    int toto = 0;

    Toto() {
        toto = toto + 1;
    }

    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : " + toto);
    }
}

On ne peut pas accéder à un attribut de la classe dans une méthode statique.

Ci-dessous il y a le code corrigé.
*/

class Toto {
    int toto = 0;

    Toto() {
        toto = toto + 1;
    }

    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : " + t1.toto);
    }
}