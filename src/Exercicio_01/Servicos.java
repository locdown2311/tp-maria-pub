package Exercicio_01;

import java.util.Scanner;

public class Servicos {
    public void start(){
        Scanner input = new Scanner(System.in);
        int manicure, servico;
        int servicos[][] = new int[5][3] ;
        int soma;
        final int X1 = 10; //ONDE ESTÃO OS VALORES DOS SERVICOS?
        final int X2 = 15;
        final int X3 = 20;

        do {
            System.out.println("Informe a manicure <1-5>:");
            manicure = input.nextInt();
            System.out.println("Informe o servico <1-pe 2-mao 3-podologia>:");
            servico = input.nextInt();
            if (manicure >= 1 && manicure <=5) {
                if (servico >= 1 && servico <= 3)
                    servicos[manicure-1][servico-1]++;
                else
                    System.out.println("Servico invalido!\n");
            }
            else
                System.out.println("Manicure invalida!\n");
        } while (manicure != 0);
        System.out.println("\nFaturamento das manicures.:\n");
        for (int i=0; i<5; i++) {
            soma = servicos[i][0] * X1;
            soma += servicos[i][1] * X2;
            soma += servicos[i][2] * X3;
            System.out.println("Manicure "+i+1+""+soma*0.5 );
        }
    }

}
