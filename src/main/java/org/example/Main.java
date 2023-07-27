package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //this.titre = titre;
        //        this.auteur = auteur;
        //        this.nombrePages = nombrePages;
        //        Livre.estEmprunte = estEmprunte;
        Livre l1 = new Livre("York", "Julien", 88);
        Livre l2 = new Livre("York", "Toto", 108);
        Bibliotheque b1 = new Bibliotheque();
        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.afficherLivre();
        b1.emprunterLivre(l1);
        b1.afficherLivre();
        b1.retourneLivre(l2);
        b1.afficherLivre();


    }
}