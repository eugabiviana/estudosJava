package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como Domingo.
        byte dia = 5;
        //no switch, pode usar: char, int, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        char sexo = 'M'; //posso usar com String também, mas as aspas têm que ser duplas! String sexo = "M";
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case  'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
/**
 * O break é usado para que pare de executar o código quando o caso for identificado,
 * sem ele, o programa imprimirá os casos seguintes ao número definido.
 * O default pode ser colocado no início ou no fim do Case. É usado para quando digitam uma opção inválida
 * de casos definidos.
 */