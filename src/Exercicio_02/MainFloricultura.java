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

            System.out.println("Entre com o nome da "+  i+1 + " Planta:");
            nome[i] = input.next();
            System.out.println( "Digite a quantidade de Plantas: ");
            estoque[i] = input.nextInt();
            System.out.println("Digite a quantidade Ideal: ");
            quantIdeal[i] = input.nextInt();
        }
        
        while(opcao != 3)
        {
            System.out.println("\t\tMenu");
            System.out.println("1. Vender Planta2. Verificar Estoque3. FinalizarOpcao: ");


            switch (opcao) {
                case 1 -> {
                    System.out.println("Catalogo de Vendas");
                    for (int i = 0; i < TAMANHO; i++) {
                        if (estoque[i] > 0) {
                            System.out.println(i + 1 + ". " + nome[i]);
                            System.out.println("\t\tQuantidade em Estoque: " + estoque[i] + "");
                        }

                    }
                    System.out.println("Qual planta deseja comprar: ");
                    opcao = input.nextInt();
                    opcao--;
                    System.out.println("Digite a quantidade de plantas desejadas: ");
                    qnt = input.nextInt();
                    if (qnt <= estoque[opcao]) {
                        estoque[opcao] -= qnt;
                    } else {
                        System.out.println("Quantidade superior a do estoque, venda nao efetuada!");
                    }
                }
                case 2 -> {
                    System.out.println("Estoque");
                    for (int i = 0; i < TAMANHO; i++) {
                        System.out.println(" " + i + 1 + ". " + nome[i]);
                        if (estoque[i] < quantIdeal[i]) {
                            System.out.println("Repor Estoque, quantidade atual: " + estoque[i]);
                            System.out.println("Quantidade ideal: " + quantIdeal[i]);
                            System.out.println("Comprar mais: " + (quantIdeal[i] - estoque[i]) + "");
                        } else {
                            System.out.println("Quantidade em Estoque: " + estoque[i] + "");
                        }
                        System.out.println("----");
                    }
                }
                case 3 -> System.out.println("Finalizando Programa...");
                default -> System.out.println("Opcao Invalida.");
            }
        }
    }
}
