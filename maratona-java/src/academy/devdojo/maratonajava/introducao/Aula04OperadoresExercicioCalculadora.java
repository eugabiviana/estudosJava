package academy.devdojo.maratonajava.introducao;

/**
 * Exercício: crie uma calculadora, com dados estáticos, que realize as 4 operações básicas da matemática: subtração, adição, divisão e multiplicação e imprima os resultados no console da IDE
 */
public class Aula04OperadoresExercicioCalculadora {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 35;
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Operações matemáticas estáticas com os números 20 e 35:");
        System.out.println("Soma: 20 + 35 = "+soma);
        System.out.println("Subtração: 20 - 35 = "+subtracao);
        System.out.println("Multiplicação: 20 x 35 = "+multiplicacao);
        System.out.println("Divisão: 20 / 35 = "+divisao);

    }
}
