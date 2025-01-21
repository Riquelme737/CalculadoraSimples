import java.util.Scanner;

public class Menu {

    public static void menuPrincipal(Scanner scanner) {

        boolean flag = true;

        while (flag) {

            System.out.print("Escolha o primeiro número: ");
            int a = scanner.nextInt();
            System.out.print("Qual será a operação aritmética? (Soma (+), Subtração (-), Multiplicação (*) e Divisão (/): ");
            scanner.nextLine();
            String operacao = scanner.nextLine().toLowerCase();
            System.out.print("Escolha o segundo número: ");
            int b = scanner.nextInt();
            System.out.print("Resultado: ");

            switch (operacao) {
                case "soma":
                case "+":
                    int soma = Calculadora.soma(a, b);
                    System.out.println(soma);
                    break;
                case "subtração":
                case "-":
                    int subtracao = Calculadora.subtracao(a, b);
                    System.out.println(subtracao);
                    break;
                case "multiplicação":
                case "*":
                    int multiplicacao = Calculadora.multiplicacao(a, b);
                    System.out.println(multiplicacao);
                    break;
                case "divisão":
                case "/":
                    int divisao = Calculadora.divisao(a, b);
                    int restoDisivao = Calculadora.restoDisivao(a, b);
                    System.out.println(divisao + " com resto " + restoDisivao);
                    break;
                default:
                    System.out.println("Operação desconhecida.");
            }

            System.out.print("Deseja continuar? (sim/nao): ");
            char resposta = scanner.next().charAt(0);
            if (resposta == 'n') {
                System.out.println("Programa encerrando...");
                flag = false;
            }
        }

    }
}
