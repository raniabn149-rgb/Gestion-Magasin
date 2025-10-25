import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021,"lait","delice");
        Produit p3 = new Produit(2510,"yaourt","vitalait");
        Produit p4 = new Produit(3250,"tomate","sicam",1200);

        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();

        p2.setPrix(0.700);
        p2.afficher();
        p3.setPrix(0.550);

        p1 = new Produit(1000, "frommage", "Précident", 8.600);

        p1.setDateExpiration(new Date(125, 11, 31)); // 31/12/2025
        p2.setDateExpiration(new Date(125, 6, 30));  // 30/07/2025
        p3.setDateExpiration(new Date(126, 0, 15));  // 15/01/2026
        p4.setDateExpiration(new Date(125, 8, 20));  // 20/09/2025

        System.out.println("Les produits après modification sont :");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
