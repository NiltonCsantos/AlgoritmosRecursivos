package org.example.src.br.ifs.edu.recursividade;

public class AlgorimoOrdenacao {

    public Integer[] executar(int op, Integer[] vetor, int auxiliar){

       switch (op){

           case  1 ->{

               return ordernar(new SelectionSort(), vetor, auxiliar);

           }

           case  2->{

               return ordernar(new BubbleSort(), vetor, auxiliar);

           }
           case  3->{

               return ordernar(new InsertionSort(), vetor, auxiliar);

           }

           case  4->{

               return ordernar(new QuickSort(), vetor, auxiliar);

           }


           default -> {

               return vetor;

           }


       }

    }

    private Integer[] ordernar(IOrdenacao<Integer> iOrdenacao, Integer[] vetor, int auxiliar){

        return  iOrdenacao.ordenar(vetor, auxiliar);

    }

}
