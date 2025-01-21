import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {


    public static void menuPrincipal() {
        System.out.println("|-=-=-=-=-=-=CALCULADORA=-=-=-=-=-=-|");
        System.out.println("|\tOperações disponíveis:\t\t\t|");
        System.out.println("|\t+ : Soma\t\t\t\t\t\t|");
        System.out.println("|\t- : Subtração\t\t\t\t\t|");
        System.out.println("|\t* : Multiplicação\t\t\t\t|");
        System.out.println("|\t/ : Divisão\t\t\t\t\t\t|");
        /*System.out.println("\t^ : Potência");
        System.out.println("\tr : Raiz Quadrada");*/
        System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-|");
    }

    public static void calcularResultado(String operacao, double a, double b) {
        switch (operacao) {
            case "+":
            case "soma":
                System.out.println(Calculadora.soma(a, b));
                break;
            case "-":
            case "subtração":
                System.out.println(Calculadora.subtracao(a, b));
                break;
            case "*":
            case "multiplicação":
                System.out.println(Calculadora.multiplicacao(a, b));
                break;
            case "/":
            case "divisão":
                System.out.println(Calculadora.divisao(a, b));
                break;

            default:
                throw new IllegalArgumentException("Operação Inválida.");
        }
    }

    public static boolean permanecerNaCalculadora(Scanner scanner) {

        while (true) {
            System.out.print("Quer permanecer no sistema? (sim/nao): ");
            String resultado = scanner.next().trim().toLowerCase();

            if (resultado.startsWith("s")) {
                return true;
            } else if (resultado.startsWith("n")) {
                System.out.println("Encerrando o programa...");
                return false;
            }

        }

    }

    public static void sistema(Scanner scanner) {
        boolean flag = true;

        while (flag) {

            try {
                menuPrincipal();

                System.out.print("Primeiro número: ");
                double a = scanner.nextDouble();
                System.out.print("Operação: ");
                scanner.nextLine();
                String operacao = scanner.nextLine();
                System.out.print("Segundo número: ");
                double b = scanner.nextDouble();

                System.out.print("Resultado: ");
                calcularResultado(operacao, a, b);
            } catch (ArithmeticException | IllegalArgumentException | InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            flag = permanecerNaCalculadora(scanner);
        }

    }

}
