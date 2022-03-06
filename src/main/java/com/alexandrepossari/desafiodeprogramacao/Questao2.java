package com.alexandrepossari.desafiodeprogramacao;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        int tamanhoArray, x, contador;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        tamanhoArray = sc.nextInt();
        int[] array = new int[tamanhoArray];
        System.out.println("Escreva os elementos do vetor: ");
        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        contador = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            for (int j = 0; j < tamanhoArray; j++) {
                if (array[i] - array[j] == x) {
                    contador++;
                }
            }
        }

        System.out.println("Existem " + contador + " pares de inteiros no vetor com uma diferença de " + x);
    }
}
