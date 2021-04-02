package xml.controle2;

import java.util.Date;

public class Musee {

    private String nom;
    private String sousTitre;
    private String resume;
    private Date dateInauguration;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getDateInauguration() {
        return dateInauguration;
    }

    public void setDateInauguration(Date dateInauguration) {
        this.dateInauguration = dateInauguration;
    }
}
