import java.time.LocalDate;


public class Vehicule {
    protected String marque;
    protected LocalDate dateAchat;
    protected double prixAchat;
    protected double prixCourant;

    public Vehicule(String marque, LocalDate dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public double getPrixCourant() {
        return this.prixCourant;
    }

    public void affiche() {
        System.out.printf(
            """
            Marque: %s
            Date d'achat: %s
            Prix d'achat: %.2f EUR
            """,
            this.marque, this.dateAchat.toString(), this.prixAchat
        );
    }

    public void calculPrix(int anneeActuelle) {
        int anneesPassees = anneeActuelle - this.dateAchat.getYear();
        double prixCourant = this.prixAchat;

        for (int i = 0; i < anneesPassees; i++) {
            prixCourant -= this.prixAchat * (1 / 100);
        }

        if (prixCourant < 0) prixCourant *= -1;
        this.prixCourant = prixCourant;
    }
}

public class Voiture extends Vehicule {
    protected double cylindree;
    protected int nombreDePortes;
    protected int puissance;
    protected double kilometrage;

    public Voiture(
        String marque,
        LocalDate dateAchat,
        double prixAchat,
        double cylindree,
        int nombreDePortes,
        int puissance,
        double kilometrage
    ) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nombreDePortes = nombreDePortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void affiche() {
        System.out.printf(
            """
            Marque: %s
            Date d'achat: %s
            Prix d'achat: %.2f EUR
            Cylindree: %.2f cc
            Nombre de portes: %d
            Puissance: %d HP
            Kilometrage: %.2f km
            """,
            this.marque,
            this.dateAchat.toString(),
            this.prixAchat,
            this.cylindree,
            this.nombreDePortes,
            this.puissance,
            this.kilometrage
        );
    }

    @Override
    public void calculPrix(int anneeActuelle) {
        double prixCourant = this.prixAchat;

        int anneesPassees = anneeActuelle - this.dateAchat.getYear();
        for (int i = 0; i < anneesPassees; i++) {
            prixCourant -= this.prixAchat * (2 / 100);
        }

        int trancheKilometres = (int) this.kilometrage / 10000;
        for (int i = 0; i < trancheKilometres; i++) {
            prixCourant -= this.prixAchat * (5 / 100);
        }

        switch (this.marque) {
            case "Renault":
                prixCourant += this.prixAchat * (10 / 100);
                break;
            case "Fiat":
                prixCourant += this.prixAchat * (10 / 100);
                break;
            case "Ferrari":
                prixCourant += this.prixAchat * (20 / 100);
                break;
            case "Porsche":
                prixCourant += this.prixAchat * (20 / 100);
                break;
        }

        if (prixCourant < 0) prixCourant *= -1;
        this.prixCourant = prixCourant;
    }
}

public class Avion extends Vehicule {
    protected String typeDeMoteur;
    protected double heuresDeVol;

    public Avion(
        String marque,
        LocalDate dateAchat,
        double prixAchat,
        String typeDeMoteur,
        double heuresDeVol
    ) {
        super(marque, dateAchat, prixAchat);
        this.typeDeMoteur = typeDeMoteur;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public void affiche() {
        System.out.printf(
            """
            Marque: %s
            Date d'achat: %s
            Prix d'achat: %.2f EUR
            Type de moteur: %s
            Heures de vol: %.2f h
            """,
            this.marque,
            this.dateAchat.toString(),
            this.prixAchat,
            this.typeDeMoteur,
            this.heuresDeVol
        );
    }

    @Override
    public void calculPrix(int anneeActuelle) {
        double prixCourant = this.prixAchat;

        int trancheHeures;
        switch (this.typeDeMoteur) {
            case "HELICES":
                trancheHeures = (int) this.heuresDeVol / 100;
                for (int i = 0; i < trancheHeures; i++) {
                    prixCourant -= this.prixAchat * (10 / 100);
                };
                break;
            default:
                trancheHeures = (int) this.heuresDeVol / 1000;
                for (int i = 0; i < trancheHeures; i++) {
                    prixCourant -= this.prixAchat * (10 / 100);
                };
                break;
        }

        if (prixCourant < 0) prixCourant *= -1;
        this.prixCourant = prixCourant;
    }
}


public class GestionVehicules {
    public static void main(String[] args) {}
}