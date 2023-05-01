package Main;

import Services.Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            try {
                //lê os números
                System.out.println("Insira o número 1:");
                int n1 = sc.nextInt();
                System.out.println("Insira o número 2:");
                int n2 = sc.nextInt();

                //le a operação
                System.out.println("INSIRA A OPERAÇÃO:");
                System.out.println("1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Sair");
                op = sc.nextInt();


                //efetua a operação
                switch (op) {
                    case 1 -> System.out.println(Operation.soma(n1, n2));
                    case 2 -> System.out.println(Operation.sub(n1, n2));
                    case 3 -> System.out.println(Operation.mult(n1, n2));
                    case 4 -> System.out.println(Operation.div(n1, n2));
                    case 5 -> System.out.println("Finalizando......");
                    default -> System.out.println("Inválido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Apenas números são válidos.");
                sc.next();
            }
        } while (op != 5);
    }
}