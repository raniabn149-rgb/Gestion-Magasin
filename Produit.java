import java.util.Date;

public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit() {}

    public Produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        if (prix > 0) {
            this.prix = prix;
        } else {
            this.prix = 0;
        }
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void afficher() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Libellé : " + libelle);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
        if (dateExpiration != null) {
            System.out.println("Date d'expiration : " + dateExpiration);
        }
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return this.prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
