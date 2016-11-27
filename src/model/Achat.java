package model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "ACHAT")
public class Achat {

    @Id
    @Column(name = "id_achat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_achat;

    private int num_piece;
    @Column(nullable=false)
    private Date date_facture;
    private Date date_compta;
    private Date date_payement;
    @Column(nullable=false)
    private String libelle;
    private String num_facture;
    private boolean immo = false;
    private float px_u_prevu_ht;
    private float px_reel_ttc;
    private int num_compte;
    private int num_groupe;
    private float montant_ht;
    private float pu_ht;
    private float remise;
    private float pu_ht_remise;
    private int quantite;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_TVA")
    private TVA tva;


    private Mode_reglement mode_reglement;
    private String type_achat;
    private int montant_ttc;


    public int getMontant_ttc() {
        return montant_ttc;
    }

    public void setMontant_ttc(int montant_ttc) {
        this.montant_ttc = montant_ttc;
    }

    public int getId_achat() {
        return id_achat;
    }

    public void setId_achat(int id_achat) {
        this.id_achat = id_achat;
    }

    public int getNum_piece() {
        return num_piece;
    }

    public void setNum_piece(int num_piece) {
        this.num_piece = num_piece;
    }

    public Date getDate_facture() {
        return date_facture;
    }

    public void setDate_facture(Date date_facture) {
        this.date_facture = date_facture;
    }

    public Date getDate_compta() {
        return date_compta;
    }

    public void setDate_compta(Date date_compta) {
        this.date_compta = date_compta;
    }

    public Date getDate_payement() {
        return date_payement;
    }

    public void setDate_payement(Date date_payement) {
        this.date_payement = date_payement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getNum_facture() {
        return num_facture;
    }

    public void setNum_facture(String num_facture) {
        this.num_facture = num_facture;
    }

    public boolean isImmo() {
        return immo;
    }

    public void setImmo(boolean immo) {
        this.immo = immo;
    }





    public int getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(int num_compte) {
        this.num_compte = num_compte;
    }

    public int getNum_groupe() {
        return num_groupe;
    }

    public void setNum_groupe(int num_groupe) {
        this.num_groupe = num_groupe;
    }









    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public TVA getTva() {
        return tva;
    }

    public void setTva(TVA tva) {
        this.tva = tva;
    }

    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Mode_reglement")
    public Mode_reglement getMode_reglement() {
        return mode_reglement;
    }

    public void setMode_reglement(Mode_reglement mode_reglement) {
        this.mode_reglement = mode_reglement;
    }

    public String getType_achat() {
        return type_achat;
    }

    public void setType_achat(String type_achat) {
        this.type_achat = type_achat;
    }


    public float getPx_u_prevu_ht() {
        return px_u_prevu_ht;
    }

    public void setPx_u_prevu_ht(float px_u_prevu_ht) {
        this.px_u_prevu_ht = px_u_prevu_ht;
    }

    public float getPx_reel_ttc() {
        return px_reel_ttc;
    }

    public void setPx_reel_ttc(float px_reel_ttc) {
        this.px_reel_ttc = px_reel_ttc;
    }

    public float getMontant_ht() {
        return montant_ht;
    }

    public void setMontant_ht(float montant_ht) {
        this.montant_ht = montant_ht;
    }

    public float getPu_ht() {
        return pu_ht;
    }

    public void setPu_ht(float pu_ht) {
        this.pu_ht = pu_ht;
    }

    public float getRemise() {
        return remise;
    }

    public void setRemise(float remise) {
        this.remise = remise;
    }

    public float getPu_ht_remise() {
        return pu_ht_remise;
    }

    public void setPu_ht_remise(float pu_ht_remise) {
        this.pu_ht_remise = pu_ht_remise;
    }
}
