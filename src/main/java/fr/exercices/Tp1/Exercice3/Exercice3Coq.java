package fr.exercices.Tp1.Exercice3;

import java.util.Scanner;

public class Exercice3Coq {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez un nombre supérieur à 0 et avec au moins 2 chiffres : ");
        int nombre = Integer.parseInt(scanner.nextLine());

        if (nombre <= 0 || (nombre < 10 && nombre > -10)) {
            throw new IllegalArgumentException("Veuillez saisir un nombre supérieur à 0 avec au moins 2 chiffres.");
        }

        boolean estPalindrome = Palindrome(nombre);

        System.out.println("Le nombre " + nombre + " est un palindrome : " + estPalindrome);
    }


/** Vérifier si le nombre est palindrome ou non */
    private static boolean Palindrome(int nombre) {
        int nombreCopie = nombre;
        int reverse = 0;

        while (nombreCopie != 0) {
            int reste = nombreCopie % 10;
            reverse = reverse * 10 + reste;
            nombreCopie /= 10;
        }

        return nombre == reverse;
    }
}
