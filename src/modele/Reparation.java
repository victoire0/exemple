/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.time.*;

/**
 *
 * @author HomePC
 */
public class Reparation {
    private String matricule,idmateriel,panne;
    private LocalDate date;
    private int cout;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getIdmateriel() {
        return idmateriel;
    }

    public void setIdmateriel(String idmateriel) {
        this.idmateriel = idmateriel;
    }

    public String getPanne() {
        return panne;
    }

    public void setPanne(String panne) {
        this.panne = panne;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public Reparation(String matricule, String idmateriel, String panne, LocalDate date, int cout) {
        this.matricule = matricule;
        this.idmateriel = idmateriel;
        this.panne = panne;
        this.date = date;
        this.cout = cout;
    }
    
   public Reparation(){
   
   } 
}
