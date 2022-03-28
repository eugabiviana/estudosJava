package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
//    atalho para escrever a linha abaixo: psvm + tab
    public static void main(String[] args) {
//        São oito tipos: int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = (int) 1000000000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; //65 é o código que representa a letra A.
        String nome = "Naruto";
        System.out.println("A idade é "+idade+" anos.");
        System.out.println(falso);
        System.out.println("char " +caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi! Meu nome é "+nome+".");

    }
}
/**
 * Casting - é forçar a entrada de um valor maior que a capacidade da variável:
 * long numeroGrande = (int) 1000000000000L; é essa escrita com () e letra no final do número.
 *
 * Aqui  tem que colocar o f ou F para que ele reconheça o valor como float:
 * floatsalarioFloat = 2500.0F;
 *
 * No caso de forçar com o casting, fica:
 * floatsalarioFloat = (float) 2500.0D;
 *
 * Casting não é uma boa prática! É melhor mudar o tipo da variável.
 *
 * String - não é um tipo primitivo, é um tipo de referência (reference style). É uma classe e, por isso, começa com letra
 * maiúscula.
 */