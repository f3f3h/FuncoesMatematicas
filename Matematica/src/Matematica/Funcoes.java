package Matematica;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- FUNÇÕES MATEMÁTICAS ---");
            System.out.println("Escolha a operação:");
            System.out.println("1. Potenciação");
            System.out.println("2. Valor absoluto");
            System.out.println("3. Maior valor");
            System.out.println("4. Menor valor");
            System.out.println("5. Arredondamento");
            System.out.println("6. Número aleatório");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a base: ");
                    int base = scanner.nextInt();
                    System.out.print("Digite o expoente: ");
                    int expoente = scanner.nextInt();
                    System.out.println(base + " elevado à " + expoente + " é " + Math.pow(base, expoente));
                    break;
                case 2:
                    System.out.print("Digite um número negativo: ");
                    int negativo = scanner.nextInt();
                    System.out.println("O valor absoluto de " + negativo + " é " + Math.abs(negativo));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    int a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("O maior entre " + a + " e " + b + " é " + Math.max(a, b));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    int x = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int y = scanner.nextInt();
                    System.out.println("O menor entre " + x + " e " + y + " é " + Math.min(x, y));
                    break;
                case 5:
                    System.out.print("Digite um número decimal: ");
                    double valor = scanner.nextDouble();
                    System.out.println("Arredondando " + valor + ": " + Math.round(valor));
                    break;
                case 6:
                    double aleatorio = Math.random() * 100;
                    System.out.println("Número aleatório entre 0 e 100: " + String.format("%.3f", aleatorio));
                    break;
                case 0:
                    System.out.println("Encerrando a calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
