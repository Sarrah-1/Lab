package lab;
public class TestVoiture {
    public static void main(String[] args) {
        System.out.println("CREATION DES OBJETS");
        Voiture voiture1 = new Voiture();
        voiture1.afficherInformations();

        Voiture voiture2 = new Voiture("Toyota", "Corolla", 0.0, 2023);
        voiture2.afficherInformations();

        Voiture voiture3 = new Voiture(voiture2);
        voiture3.afficherInformations();

        System.out.println("\nComparaison des objets");
        System.out.println("voiture1 == voiture2 ? " + (voiture1 == voiture2));
        System.out.println("voiture2 == voiture3 ? " + (voiture2 == voiture3));

        System.out.println("\nModification de voiture2");
        voiture2.accelerer(120);
        voiture2.freiner(30);
        voiture2.afficherInformations();

        System.out.println("\nModification de voiture3");
        voiture3.accelerer(80);
        voiture3.afficherInformations();

        System.out.println("\nTest des setters avec validation");
        voiture2.setVitesse(-50);
        voiture2.setAnnee(1800);
        voiture2.setMarque("");
        voiture2.afficherInformations();

        System.out.println("\nComparaison finale");
        voiture2.afficherInformations();
        voiture3.afficherInformations();

        System.out.println("\nTESTS DES VALIDATIONS");
        Voiture voiture = new Voiture("Renault", "Clio", 0.0, 2022);

        System.out.println("\nTest 1 : Vitesse négative");
        voiture.setVitesse(-10);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        System.out.println("\nTest 2 : Vitesse nulle");
        voiture.setVitesse(0);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        System.out.println("\nTest 3 : Année invalide (trop ancienne)");
        voiture.setAnnee(1800);
        System.out.println("Année actuelle : " + voiture.getAnnee());

        System.out.println("\nTest 4 : Année invalide (future)");
        voiture.setAnnee(2050);
        System.out.println("Année actuelle : " + voiture.getAnnee());

        System.out.println("\nTest 5 : Marque vide");
        voiture.setMarque("");
        System.out.println("Marque actuelle : " + voiture.getMarque());

        System.out.println("\nTest 6 : Marque null");
        voiture.setMarque(null);
        System.out.println("Marque actuelle : " + voiture.getMarque());

        System.out.println("\nTest 7 : Accélération négative");
        voiture.accelerer(-50);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        System.out.println("\nTest 8 : Freinage excessif");
        voiture.setVitesse(20);
        voiture.freiner(50);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        voiture.afficherInformations();
    }
}
