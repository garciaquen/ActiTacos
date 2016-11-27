package model;

/**
 * Created by eisti on 27/11/16.
 */
public class Mode_reglement {

    private int id_Mode_reglement;
    private String nom;
    private int delai;


    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId_Mode_reglement() {
        return id_Mode_reglement;
    }

    public void setId_Mode_reglement(int id_Mode_reglement) {
        this.id_Mode_reglement = id_Mode_reglement;
    }
}
