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
public class Client {
    private int idclient; 
    private String nom,prenom,adresse,nationalite;
    private int tel;

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Client(int idclient, String nom, String prenom, String adresse, String nationalite, int tel) {
        this.idclient = idclient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nationalite = nationalite;
        this.tel = tel;
    }
    public String getIDnomclient(){
    return idclient+" "+nom+" "+prenom;
    
    }
    
    public Client(){
    
    }
}
