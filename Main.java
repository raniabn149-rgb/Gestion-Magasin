package tn.tuniprod.gestionmagasin;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit(1, "Yaourt", 0.550);
        Produit p2 = new Produit(2, "Lait", 1.350);
        Produit p3 = new Produit(3, "Jus", 1.200);

        Magasin m1 = new Magasin(303, "Nabeul");
        Magasin m2 = new Magasin(101, "Hammamet");

        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m2.ajouterProduit(p3);

        m1.afficher();
        m2.afficher();

        System.out.println("\nNombre total de produits : " + Magasin.getTotalProduits());
    }
}

class Produit {
    private int id;
    private String nom;
    private double prix;

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        setPrix(prix);
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            this.prix = 0;
            System.out.println("Le prix ne peut pas être négatif, il a été mis à 0.");
        }
    }
}

class Magasin {
    private int id;
    private String adresse;
    private Produit[] produits = new Produit[50];
    private int nbreProduits = 0;
    private static int totalProduits = 0;

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public void ajouterProduit(Produit p) {
        if (nbreProduits < 50) {
            produits[nbreProduits] = p;
            nbreProduits++;
            totalProduits++;
        } else {
            System.out.println("Le magasin est plein.");
        }
    }

    public void afficher() {
        System.out.println("\nMagasin " + id + " situé à " + adresse);
        System.out.println("Produits :");
        for (int i = 0; i < nbreProduits; i++) {
            System.out.println("- " + produits[i].getNom() + " : " + produits[i].getPrix() + " DT");
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}
