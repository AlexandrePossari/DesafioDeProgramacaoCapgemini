package com.alexandrepossari.desafiodeprogramacao;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        int tamanhoArray, indexMediana;
        boolean checkImpar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o tamanho do array(Deve ser ímpar): ");
            tamanhoArray = sc.nextInt();

            if (tamanhoArray % 2 == 1) {
                checkImpar = false;
            } else {
                System.out.println("O array deve ter tamanho ímpar");
                checkImpar = true;
            }
        } while (checkImpar);

        int[] array = new int[tamanhoArray];

        System.out.println("Escreva os elementos do array: ");
        for (int i = 0; i < tamanhoArray; i++) {
            array[i] = sc.nextInt();
        }

        indexMediana = tamanhoArray / 2;
        System.out.println("Mediana: " + array[indexMediana]);
    }
}
