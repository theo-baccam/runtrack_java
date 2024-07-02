public class Person {
    // Les attributs publics peuvent être accédés par n'importe quelle classe
    public firstName;
    public lastName;
    
    // Les attributs protégés peuvent êtres accédés que par les classes filles
    protected birthDate;
    protected birthPlace;

    // Les attributs privés ne sont qu'accessibles à la classe dont elles font
    private address;
    private phoneNumber;

    // Pour les classes qui n'ont rien à voir avec celle-ci, il faudrait des
    // getters et setters pour les attributs protégés et privés.
    // Pour les classes enfants, il faudrait des getters et setters pour les
    // attributs privés.
}