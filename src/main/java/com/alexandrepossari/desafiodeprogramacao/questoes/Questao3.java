package com.alexandrepossari.desafiodeprogramacao.questoes;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Questao3 {
    public static String questao3(String frase) {

        double raizTamanho;
        int raizFloor, raizCeil, nLinhas = 0, nColunas = 0, j = 0, k = 0;
        boolean menorGrid, medioGrid, maiorGrid;
        String fraseFinal = "";

        frase = frase.replaceAll(" ", "");

        raizTamanho = Math.sqrt(frase.length());
        raizFloor = (int) Math.floor(raizTamanho);
        raizCeil = (int) Math.ceil(raizTamanho);

        menorGrid = raizFloor * raizFloor >= frase.length();
        medioGrid = raizCeil * raizFloor >= frase.length();
        maiorGrid = raizCeil * raizCeil >= frase.length();

        if (menorGrid) {
            nLinhas = raizFloor;
            nColunas = raizFloor;
        } else if (medioGrid) {
            nLinhas = raizFloor;
            nColunas = raizCeil;
        } else if (maiorGrid) {
            nLinhas = raizCeil;
            nColunas = raizCeil;
        }

        char[][] aux = new char[nLinhas][nColunas];

        for (int i = 0; i < nLinhas; i++) {
            for (j = 0; j < nColunas; j++) {
                aux[i][j] = '\u0000';
            }
        }
        j = 0;
        k = 0;

        for (int i = 0; i < nLinhas; i++) {
            for (; k < nColunas; j++) {
                if (j > frase.length() - 1) {
                    break;
                }
                aux[i][k] = frase.charAt(j);
                k++;
            }
            k = 0;
            if (j > frase.length() - 1) {
                break;
            }
        }

        for (int i = 0; i < nLinhas; i++) {
            fraseFinal += " ";
            for (j = 0; j < nColunas; j++) {
                if (aux[j][i] == '\u0000') {
                    break;
                }
                fraseFinal += aux[j][i];
            }
        }

        return fraseFinal;
    }
}
