public class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.printf("x: %.2f, y: %.2f%n", this.x, this.y);
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
}


public class Rectangle extends Figure {
    protected double largeur;
    protected double longueur;

    public Rectangle(double x, double y, double largeur, double longueur) {
        super(x, y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public void affiche() {
        System.out.printf(
            """
            x: %.2f
            y: %.2f
            longueur: %.2f
            largeur: %.2f
            surface: %.2f
            """,
            this.x, this.y, this.longueur, this.largeur, this.surface()
        );
    }

    public double getLargeur() {
        return this.largeur;
    }

    public double getLongueur() {
        return this.longueur;
    }

    public double surface() {
        return this.largeur * this.longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}

public class RectangleColore extends Rectangle {
    protected int couleur;

    public RectangleColore(
        double x, double y, double largeur, double longueur, int couleur
    ) {
        super(x, y, largeur, longueur);
        this.couleur = couleur;
    }

    @Override
    public void affiche() {
        System.out.printf(
            """
            x: %.2f
            y: %.2f
            longueur: %.2f
            largeur: %.2f
            surface: %.2f
            couleur: %d
            """,
            this.x, this.y, this.longueur, this.largeur, this.surface(), this.couleur
        );
    }
}


public class Cercle extends Figure {
    protected double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.printf(
            """
            x: %.2f
            y: %.2f
            rayon: %.2f
            surface: %.2f
            """,
            this.x, this.y, this.rayon, this.surface()
        );
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRayon() {
        return this.rayon;
    }

    public double surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public boolean estInterieur(double x, double y) {
        return (
            (Math.pow(x - this.x, 2)
            + Math.pow(y - this.y, 2))

            < Math.pow(this.rayon, 2)
        );
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}

public class FiguresGeometriques {
    public static void main(String[] args) {
        Figure a = new Figure(21.939, 14.01);
        System.out.printf("FIGURE:%n");
        a.affiche();
        a.setCentre(-92.493, 1.242);
        a.affiche();

        Rectangle b = new Rectangle(15.21, 76.92, 5.12, 9.34);
        System.out.printf("%nRECTANGLE:%n");
        b.affiche();
        b.setLargeur(2.03);
        b.setLongueur(11.92);
        b.affiche();

        RectangleColore c = new RectangleColore(9.392, 91.30, 76.21, 12.2431, 9);
        System.out.printf("%nRECTANGLE COLORE:%n");
        c.affiche();

        Cercle d = new Cercle(13.212, -92.31, 7.92);
        System.out.printf("%nCERCLE:%n");
        d.affiche();
        double eX = 11;
        double eY = -95;
        System.out.printf("%b%n", d.estInterieur(eX, eY));
        d.setRayon(2);
        System.out.printf("%b%n", d.estInterieur(eX, eY));
    }
}