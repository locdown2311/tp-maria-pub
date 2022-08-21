package Exercicio_02;

import java.util.Scanner;

public class MainFloricultura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TAMANHO;
        int opcao = 1, qnt;

        System.out.println("Quantas plantas deseja cadastrar: ");
        TAMANHO = input.nextInt();

        int[] estoque = new int[TAMANHO], quantIdeal = new int[TAMANHO];
        String[] nome = new String[TAMANHO];


        /**/

        for(int i = 0; i < TAMANHO; i++)
        {

            System.out.println("Entre com o nome da "+  i+1 + " Planta:\n");
            nome[i] = input.next();
            System.out.println( "\nDigite a quantidade de Plantas: ");
            estoque[i] = input.nextInt();
            System.out.println("\nDigite a quantidade Ideal: ");
            quantIdeal[i] = input.nextInt();
        }
        
        while(opcao != 3)
        {
            System.out.println("\t\tMenu");
            System.out.println("\n\n1. Vender Planta\n2. Verificar Estoque\n3. Finalizar\n\nOpcao: ");


            switch (opcao) {
                case 1 -> {
                    System.out.println("Catalogo de Vendas\n\n");
                    for (int i = 0; i < TAMANHO; i++) {
                        if (estoque[i] > 0) {
                            System.out.println(i + 1 + ". " + nome[i]);
                            System.out.println("\t\tQuantidade em Estoque: " + estoque[i] + "\n");
                        }

                    }
                    System.out.println("\nQual planta deseja comprar: ");
                    opcao = input.nextInt();
                    opcao--;
                    System.out.println("Digite a quantidade de plantas desejadas: ");
                    qnt = input.nextInt();
                    if (qnt <= estoque[opcao]) {
                        estoque[opcao] -= qnt;
                    } else {
                        System.out.println("\nQuantidade superior a do estoque, venda nao efetuada!\n\n");
                    }
                }
                case 2 -> {
                    System.out.println("Estoque\n\n");
                    for (int i = 0; i < TAMANHO; i++) {
                        System.out.println(" " + i + 1 + ". " + nome[i]);
                        if (estoque[i] < quantIdeal[i]) {
                            System.out.println("\nRepor Estoque, quantidade atual: " + estoque[i]);
                            System.out.println("\nQuantidade ideal: " + quantIdeal[i]);
                            System.out.println("\nComprar mais: " + (quantIdeal[i] - estoque[i]) + "\n");
                        } else {
                            System.out.println("\nQuantidade em Estoque: " + estoque[i] + "\n");
                        }
                        System.out.println("----\n\n");
                    }
                }
                case 3 -> System.out.println("Finalizando Programa...\n");
                default -> System.out.println("Opcao Invalida.\n");
            }
        }
    }
}
