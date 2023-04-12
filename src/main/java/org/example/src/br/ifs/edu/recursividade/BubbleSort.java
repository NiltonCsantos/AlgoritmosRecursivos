package org.example.src.br.ifs.edu.recursividade;

public class BubbleSort implements IOrdenacao<Integer> {

    @Override
    public Integer[] ordenar(Integer[] dados, int auxiliar) {

        for (int i = 0; i < dados.length; i++) {

            for (int j = i+1; j < dados.length ; j++) {

                if (dados[i]>dados[j]){
                    auxiliar=dados[i];
                    dados[i]=dados[j];
                    dados[j]=auxiliar;
                }

            }

        }

        return dados;

    }
}
