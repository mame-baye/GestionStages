package sn.edu.groupeisi.modeles;

import jakarta.persistence.*;


@Entity
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raison_Sociale;
    private String secteur_Activite;
    private String adresse;
    private String email;
    private String telephone;

    public String getRaison_Sociale() {
        return raison_Sociale;
    }

    public void setRaison_Sociale(String raison_Sociale) {
        this.raison_Sociale = raison_Sociale;
    }

    public String getSecteur_Activite() {
        return secteur_Activite;
    }

    public void setSecteur_Activite(String secteur_Activite) {
        this.secteur_Activite = secteur_Activite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}