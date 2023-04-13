package org.example.src.br.ifs.edu.recursividade;

public class QuickSort implements IOrdenacao<Integer>{

    @Override
    public Integer[] ordenar(Integer[] dados, int auxiliar) {


        auxiliar=dados.length-1;

        quicksort(dados, 0, auxiliar);


        return dados;
    }


    private void quicksort(Integer[] vetor, int esquerda, int direita) {

        if (esquerda < direita) {
            int p = separar(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }

    }

    private int separar(Integer[] dados, int esquerda, int direita) {

        int pivor=dados[(int)(esquerda+direita)/2];
        int i=esquerda-1;
        int j= direita+1;

        while (true){
            do{
                i++;
            }while (dados[i]<pivor);

            do{
                j--;
            }while (dados[j]>pivor);
            if(i>=j){
                return j;
            }

            int aux=dados[i];
            dados[i]=dados[j];
            dados[j]=aux;
        }
    }
}
