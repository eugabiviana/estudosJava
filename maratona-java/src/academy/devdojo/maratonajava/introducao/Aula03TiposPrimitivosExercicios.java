package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/*
Prática:
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Gabi";
        String endereco = "No reino de Far far away";
        String dataPagto = "31/03/2022";
        double salario = 2000.0;
//        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataPagto+".")
//        Duas formas de printar:
//        System.out.println(relatorio);
        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataPagto+".");


    }
}
