public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;

        double tarifHT = prix * quantite;
        double tva = 20.0 / 100.0;

        double tarifTTC = tarifHT * (1.0 + tva);

        double montantTaxe = tarifTTC - tarifHT;

        System.out.printf("Le prix du produit est: %.2f%n", prix);
        System.out.printf("Le montant total hors-taxe est: %.2f%n", tarifHT);
        System.out.printf("Le montant total de la taxe est: %.2f%n", montantTaxe);
        System.out.printf("Le montant total TTC est: %.2f", tarifTTC);
    }
}