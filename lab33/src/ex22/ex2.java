package ex22;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la hauteur : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Boucle pour afficher les espaces


            // Boucle pour afficher les étoiles


            System.out.println();
        }

        sc.close();
    }
}