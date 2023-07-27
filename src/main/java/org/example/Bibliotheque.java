package org.example;

import java.util.ArrayList;

public class Bibliotheque {
    ArrayList<Livre> livres = new ArrayList<Livre>();

    //Ajouter un livre à la collection
    //
    //Supprimer un livre de la collection
    //
    //Afficher la liste de tous les livres
    //
    //Emprunter un livre (changer l'état d'emprunt à true)
    //
    //Retourner un livre (changer l'état d'emprunt à false)


    public void ajouterLivre(Livre livre){
        livres.add(livre);
    };
    public void supprimerLivre(int chiffre){
        livres.remove(chiffre);
    };

    public void afficherLivre(){
        for( Livre a : livres)
            System.out.println(a.infoLivre());
    };
    public void emprunterLivre(Livre livre){
    if ( livre.isEstEmprunte() == false){
      livre.setEstEmprunte(true);
    }
    }

    public void retourneLivre(Livre livre){
        if (livre.isEstEmprunte() != false) {
            livre.setEstEmprunte(false);
        }

    }
}
