package fr.exercices.Tp1.Exercice4;
import java.util.Arrays;
import java.util.HashMap;

public class Exercice4Coq {

    public static void main(String[] args) {

        int[] monTableau1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] monTableau2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        System.out.println(Arrays.toString(monTableau1) + " Possède t-il un doublon = " + contientDoublon(monTableau1));
        System.out.println(Arrays.toString(monTableau2) + " Possède t-il un doulon = " + contientDoublon(monTableau2));
    }

    /** On utilise HashMap pour voir si le tableau contient un doublon */
    public static boolean contientDoublon(int[] tableau) {
        HashMap<Integer, Boolean> elements = new HashMap<>();

        for (int element : tableau) {
            if (elements.containsKey(element)) {
                return true;
            } else {
                elements.put(element, true);
            }
        }
        return false;
    }
}
