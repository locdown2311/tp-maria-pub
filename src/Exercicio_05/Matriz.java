package Exercicio_05;

import java.util.Scanner;

public class Matriz {
    public void transposta() {
        Scanner input = new Scanner(System.in);

        int original[][] = new int[3][3];
        int transposta[][] = new int[3][3];
        System.out.println("Digite a matriz numero a numero:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                original[i][j] = input.nextInt();
            }
        }
        input.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[i][j] = original[j][i];
            }
        }

        System.out.println("Matriz sem transposta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
