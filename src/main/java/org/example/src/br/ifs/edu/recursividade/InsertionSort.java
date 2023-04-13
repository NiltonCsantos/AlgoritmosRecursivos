package org.example.src.br.ifs.edu.recursividade;

public class InsertionSort implements IOrdenacao<Integer>{

    @Override
    public Integer[] ordenar(Integer[] dados, int auxiliar) {

        int j;

        for (int i = 1; i < dados.length; i++) {

            auxiliar=dados[i];
            j=i-1;
            while (j>=0 && dados[j]>auxiliar ){
                dados[j+1]=dados[j];
                j--;
            }

            dados[j+1]=auxiliar;

        }

        return dados;
    }
}
