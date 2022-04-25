package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1}; //só é uma outra forma de escrever!

        System.out.println("Com for simples:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

//        Mesma coisa, mas escrito de outra forma:
        System.out.println("\nCom foreach:");
        for (int num: numeros3) {
            System.out.println(num);
        }

        /*
        O que está sendo feito:
        int num = numeros3[0];
        System.out.println(num)
        int num = numeros3[1];
        System.out.println(num)
        int num = numeros3[2];
        System.out.println(num)
         */
    }
}
