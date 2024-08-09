/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author HomePC
 */
public class Materiel {
    private String idmateriel,nommateriel,marque,categorie,idclient;

    public String getIdmateriel() {
        return idmateriel;
    }

    public void setIdmateriel(String idmateriel) {
        this.idmateriel = idmateriel;
    }

    public String getNom() {
        return nommateriel;
    }

    public void setNom(String nom) {
        this.nommateriel = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getIdclient() {
        return idclient;
    }

    public void setIdclient(String idclient) {
        this.idclient = idclient;
    }
    public String getIDmaterielnom(){
    return idmateriel+" "+nommateriel;
    }

    public Materiel(String idmateriel, String nom, String marque, String categorie, String idclient) {
        this.idmateriel = idmateriel;
        this.nommateriel = nommateriel;
        this.marque = marque;
        this.categorie = categorie;
        this.idclient = idclient;
    }
    public Materiel(){
    
    }
}
