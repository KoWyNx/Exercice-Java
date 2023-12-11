package fr.exercices.Tp1.Exercice1;

import java.util.Scanner;

public class Tp1Coq {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] notes = new int[3];

        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Note " + (i + 1) + " saisie : ");
                int note = Integer.parseInt(scanner.nextLine());

                if (note < 0 || note > 20) {
                    throw new IllegalArgumentException("La note doit être comprise entre 0 et 20.");
                }

                notes[i] = note;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez saisir un nombre entier.");
                i--;
            }
        }

        System.out.println( "moyenne " + calculerMoyenne(notes));
    }

    private static int calculerMoyenne(int[] notes) {
        int somme = 0;

        for (int note : notes) {
            somme += note;
        }

        return somme / notes.length;
    }
}
