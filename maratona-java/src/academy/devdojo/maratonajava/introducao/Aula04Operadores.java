package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /**
         * operações de: + - * /
         * Se iniciar a variável com int, a divisão num01 / num02 dará zero e não 0,5, pois tem que ser um númerol inteiro;
         * Poderia ser feito um casting, mas preferi trocar por double!
         */

        //+ - * /
        double num01 = 10;
        double num02 = 20;
        double resultado = num01 / num02;
        System.out.println("O resultado de 10/20 é: "+resultado);

        // %
        int resto = 21 % 7;
        System.out.println("O resto de 21/7 é: "+resto);

        // < > <= >= == != (esse último significa diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);

        // && (and) || (or) ! (denial)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3318;
        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);


    }
}
