package com.alexandrepossari.desafiodeprogramacao.questoes;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Scanner;

@Component
public class Questao1 {
    public static int questao1(String arrayRequest) {

        int indexMediana;

        arrayRequest = arrayRequest.replaceAll(" ", "");
        arrayRequest = arrayRequest.replaceAll("\\]", "");
        arrayRequest = arrayRequest.replaceAll("\\[", "");
        String[] stringsArray = arrayRequest.split(",");

        int tamanho = stringsArray.length;
        int [] array = new int [tamanho];
        for(int i=0; i<tamanho; i++) {
            array[i] = Integer.parseInt(stringsArray[i]);
        }

        Arrays.sort(array);
        indexMediana = tamanho / 2;

        return array[indexMediana];
    }
}
