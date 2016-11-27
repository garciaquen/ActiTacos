package model;

import javax.persistence.*;


@Entity
@Table(name = "TVA")
public class TVA {

    @Id
    @Column(name = "id_TVA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_TVA;
    private String nom;
    private String compte_Achat;
    private String compte_Immo;
    private float taux;


    public int getId_TVA() {
        return id_TVA;
    }

    public void setId_TVA(int id) {
        this.id_TVA = id;
    }


    public String getCompte_Immo() {
        return compte_Immo;
    }

    public void setCompte_Immo(String compte_Immo) {
        this.compte_Immo = compte_Immo;
    }

    public String getCompte_Achat() {
        return compte_Achat;
    }

    public void setCompte_Achat(String compte_Achat) {
        this.compte_Achat = compte_Achat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}
