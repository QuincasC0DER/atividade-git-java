package com.calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        double resultado;
        switch (op) {
            case '+': resultado = a + b; break;
            case '-': resultado = a - b; break;
            case '*': resultado = a * b; break;
            case '/': 
                if (b == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = a / b; 
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
