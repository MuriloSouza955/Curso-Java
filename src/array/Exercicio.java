package array;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        //todo array é homogenio, ou seja, são do mesmo tipo (double).
        //todo array é estatico, ou seja, tem um tamanho fixo.
        //todo array, também é uma classe, pois tem metodos e atributos.
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]); // pegar a primeira nota no aluno.
        System.out.println(notasAlunoA[notasAlunoA.length-1]); // pegar a ultima nota do aluno.
        //System.out.println(notasAlunoA[10]); ERRO, elemento fora dos limites do array
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println("Média: " + totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunoB = 0;
        for(int i=0; i< notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println("Média: " + totalAlunoB / notasAlunoB.length);
    }
}
