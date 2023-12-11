package fr.exercices.Tp1.Exercice2;

import java.util.Scanner;

public class Exercice2Coq {

    /** Permet de calculer le prixTTC d'un montant indiqué par l'utilisateur  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez le prix HT :");
        float prixHT = Float.parseFloat(scanner.nextLine());

        if (prixHT <= 0) {
            throw new IllegalArgumentException("Veuillez saisir un prix HT positif");
        }

        float prixTTC = calculerPrixTTC(prixHT);

        System.out.println("Prix TTC : " + prixTTC);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Explication: " + prixHT + " * 1.2 = " + prixTTC);
    }

    /** Calcule le prix TTC à l'aide du prix HT */
    private static float calculerPrixTTC(float prixHT) {
        return prixHT * 1.2f;
    }
}
