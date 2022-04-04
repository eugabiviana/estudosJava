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

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus = 1800; // valor na memória: 18000
        System.out.println("Valor inicial: "+bonus);
        bonus += 1000; // 2800 | Isso é o mesmo que: bonus = bonus + 1000
        System.out.println("Soma: "+bonus);
        bonus -= 1000; //1800
        System.out.println("Subtrai: "+bonus);
        bonus *= 2; //3600
        System.out.println("Multiplica: "+bonus);
        bonus /= 2;
        System.out.println("Divide: "+bonus);
        bonus %= 2;
        System.out.println("Resto zero: "+bonus);

        // ++ -- -> a ordem que é colocado faz diferença.
        int contador = 0;
        contador += 1; //contador = contador + 1; também pode ser escrito assim:
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);



    }
}
