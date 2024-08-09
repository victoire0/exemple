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
public class Technicien {
    private String matricule,nom,prenom,genre,nationalite;
    private LocalDate dateembauche;
    private int salaire;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public LocalDate getDate() {
        return dateembauche;
    }

    public void setDate(LocalDate date) {
        this.dateembauche = dateembauche;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
//   ici nous allons recuperer les info sur le technicien pour que lorsque nous serrons dans reparation nous puissions le recuperer
    public String getMatriculenom(){   
    return matricule+" "+nom;
    }

    public Technicien(String matricule, String nom, String prenom, String genre, String nationalite, LocalDate date, int salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.nationalite = nationalite;
        this.dateembauche = date;
        this.salaire = salaire;
    }
    public Technicien(){
    
    }
}
