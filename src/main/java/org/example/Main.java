package org.example;

import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //this.titre = titre;
        //        this.auteur = auteur;
        //        this.nombrePages = nombrePages;
        //        Livre.estEmprunte = estEmprunte;
//        Livre l1 = new Livre("York", "Julien", 88);
//        Livre l2 = new Livre("York", "Toto", 108);
//        Bibliotheque b1 = new Bibliotheque();
//        b1.ajouterLivre(l1);
//        b1.ajouterLivre(l2);
//        b1.afficherLivre();
//        b1.emprunterLivre(l1);
//        b1.afficherLivre();
//        b1.retourneLivre(l2);
//        b1.afficherLivre();
        int number = -1;
        int action = -1;
        Bibliotheque b1 = new Bibliotheque();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Voulez-vous rentrer un livre ? : 1");
        System.out.println("Escape ! : 0");
        number = scanner.nextInt();
        do {
            if (number == 1) {
                System.out.println("Ajouter un livre : 2");
                System.out.println("Afficher un livre : 3");
                System.out.println("Emprunter un livre : 4");
                System.out.println("Retourner un livre : 5");
                System.out.println("Supprimer un livre : 6");
                System.out.println("Supprimer un livre avec son titre : 7");
                action = scanner.nextInt();
                scanner.nextLine();
                if (action > 1) {


                    if (action == 2) {
                        String titre;
                        String auteur;
                        int nombrePage;
                        System.out.println("Titre : ");
                        titre = scanner.nextLine();
                        System.out.println("Auteur : ");
                        auteur = scanner.nextLine();
                        System.out.println("Nombre de page : ");
                        nombrePage = scanner.nextInt();
                        Livre l1 = new Livre(titre, auteur, nombrePage);

                        b1.ajouterLivre(l1);

                    }
                    if (action == 3) {
                        b1.afficherLivre();
                    }
                    if (action == 4){

                        System.out.println("Livre n° : ");
                        int nbr = scanner.nextInt();
                        for( int i = 0; i < b1.getLivres().size(); i++){
                            b1.emprunterLivre(b1.getLivres().get(nbr));
                        }
                                            }
                    if (action == 5) {
                        System.out.println("Livre n° : ");
                        int nbr = scanner.nextInt();
                        for( int i = 0; i < b1.getLivres().size(); i++){
                            b1.retourneLivre(b1.getLivres().get(nbr));
                        }


                    }
                    if (action == 6) {
                        System.out.println("Livre n° : ");
                        int nbr = scanner.nextInt();

                            b1.supprimerLivre(nbr);
                        }
                    if (action == 7) {
                        System.out.println("Livre titre : ");
                        String str = scanner.nextLine();
                        for( int i = 0; i < b1.getLivres().size(); i++){
                            if (Objects.equals(b1.getLivres().get(i).getTitre(), str)){
                                System.out.println(b1.getLivres().get(i).getTitre());
                                b1.supprimerLivre(i);
                            }

                        }

                    }
                }
            }
        }while (number != 1 || action != 0);


    }
}