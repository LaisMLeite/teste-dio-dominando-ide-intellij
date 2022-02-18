package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int a, b;
        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scan.nextInt();

        int soma = soma(a, b); //ctrl alt v cria a variavel
        int subtracao = subtracao(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);
        System.out.println("Soma: " + soma); //ctrl d para duplicar a linha
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
        //ctrl shft f10 para rodar este programa main, quando já há outro
        //ctrl n para procurar classes


    }

    public static int soma (int a, int b){
        return a+b;
    }

    public static int subtracao (int a, int b){
        return a-b;
    }

    public static int multiplicar (int a, int b){
        return a*b;
    }

    public static int dividir (int a, int b){
        return a/b;
    }
}
