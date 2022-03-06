package com.alexandrepossari.desafiodeprogramacao.questoes;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Component
public class Questao2 {
    public static int questao2(int x, String arrayRequest) {

        int tamanhoArray, contador;

        arrayRequest = arrayRequest.replaceAll(" ", "");
        arrayRequest = arrayRequest.replaceAll("\\]", "");
        arrayRequest = arrayRequest.replaceAll("\\[", "");
        String[] stringsArray = arrayRequest.split(",");

        int tamanho = stringsArray.length;
        int [] array = new int [tamanho];
        for(int i=0; i<tamanho; i++) {
            array[i] = Integer.parseInt(stringsArray[i]);
        }
        
        tamanhoArray = array.length;

        contador = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            for (int j = 0; j < tamanhoArray; j++) {
                if (array[i] - array[j] == x) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
