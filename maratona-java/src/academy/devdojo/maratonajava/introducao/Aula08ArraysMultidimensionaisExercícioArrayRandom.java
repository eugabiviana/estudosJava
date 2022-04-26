package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class Aula08ArraysMultidimensionaisExercícioArrayRandom {
    /**
     * Crie um array de 50 posições ou preencha automaticamente com números de 1 a 50,
     * depois, imprima somente os números pares no console.     *
     */
    public static void main(String[] args) {

        Random gerador = new Random();
        int[][] array = new int[5][10];
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(" | ");
            for (int j = 0; j < array[i].length; j++) {
                num = gerador.nextInt(50)+1;
                array[i][j] = num;
                if (num % 2 == 0) {
                    System.out.print(array[i][j]);
                    System.out.print(" | ");
                }
            }
            
        }
        


    }
}
