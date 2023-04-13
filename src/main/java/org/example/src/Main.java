package org.example.src;

import org.example.src.br.ifs.edu.recursividade.AlgorimoOrdenacao;

import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AlgorimoOrdenacao algorimoOrdenacao= new AlgorimoOrdenacao();

        Random aleatorio= new Random();

        int aux=0;
        int numero;
        Integer[] vetor= new Integer[10];


        System.out.println("Antes da ordenação:\n");

        for (int i = 0; i < vetor.length; i++) {

            numero= aleatorio.nextInt(36);

            vetor[i]= numero;

            System.out.print(vetor[i]+"\t");

        }

        algorimoOrdenacao.executar(3, vetor, aux);


        System.out.println("\n\nDepois da ordenação:\n");

        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i]+"\t");

        }




    }
}