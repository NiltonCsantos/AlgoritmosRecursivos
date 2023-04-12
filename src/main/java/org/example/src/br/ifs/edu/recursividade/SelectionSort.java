package org.example.src.br.ifs.edu.recursividade;


public class SelectionSort implements IOrdenacao<Integer> {

    @Override
    public Integer[] ordenar(Integer[] dados, int auxiliar) {

        int menorPosicao;

        for (int i = 0; i <dados.length ; i++) {

            menorPosicao=i;

            for (int j = i+1; j <dados.length ; j++) {

                if ((dados[j]<dados[menorPosicao])){

                    menorPosicao=j;

                }

            }

            auxiliar=dados[menorPosicao];
            dados[menorPosicao]=dados[i];
            dados[i]=auxiliar;

        }

        return dados;

    }
}
