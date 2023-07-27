package org.example;

public class Livre {

        private String titre;
        private String auteur;
        private int nombrePages;
        private boolean estEmprunte = false;

    public Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;

    }
    //Créer une méthode pour afficher les informations sur le livre et une autre pour changer l'état d'emprunt

    public String infoLivre() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur'" + auteur + '\'' +
                ", nombrePages='" + nombrePages + '\'' +
                ", Emprunté=" + estEmprunte +
                '}';
    };

    public void  modifEmprunt(){
      this.estEmprunte = !estEmprunte;
    };

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public boolean isEstEmprunte() {
        return estEmprunte;
    }

    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }
}
