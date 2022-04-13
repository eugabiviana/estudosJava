package academy.devdojo.maratonajava.introducao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicioCalculadora2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double resultado = 0;
//        A título de conhecimento (é mais avançado):
//        List<Double> listNum = new ArrayList<>();
//        System.out.println(listNum.stream().reduce(0.0,(numA, numB)->numA - numB));
//        listNum.add(0.0);

        System.out.println("Digite um número: ");
        double num = kb.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = kb.nextDouble();
        System.out.println("O que deseja fazer?");
        System.out.println("1) Soma;");
        System.out.println("2) Subtração;");
        System.out.println("3) Multiplicação;");
        System.out.println("4) Divisão.");
        int op = kb.nextInt();
        switch (op){
            case 1:
                resultado = (num + num2);
                System.out.println(" ");
                System.out.println("=======================================");
                System.out.println("O resultado da soma é: "+resultado+".");
                break;

            case 2:
                resultado = (num - num2);
                System.out.println(" ");
                System.out.println("=======================================");
                System.out.println("O resultado da subtração é: "+resultado+".");
                break;

            case 3:
                resultado = (num * num2);
                System.out.println(" ");
                System.out.println("=======================================");
                System.out.println("O resultado da multiplicação é: "+resultado+".");
                break;

            case 4:
                resultado = (num / num2);
                System.out.println(" ");
                System.out.println("=======================================");
                System.out.println("O resultado da divisão é: "+resultado+".");
                break;

            default:
                System.out.println(" ");
                System.out.println("Opção inválida!");
                break;

        }

    }
}
