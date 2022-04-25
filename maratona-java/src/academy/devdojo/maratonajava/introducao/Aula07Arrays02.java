package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
//        valores padrões de tipos primitivos quando não inicializados: byte, short, int, long, flot e double = 0
//        char '\n0000' ' '
//        boolean = false
//        String = null

        int[] idades = new int[3];

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String[] nomes = new String[4];
        nomes[0] = "Naruto";
        nomes[1] = "Sasuke";
        nomes[2] = "Jiraya";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
//        nomes = new String[5];

    }
}

//.length "atualiza o tamanho do array no código" quando alterado na inicialização;
//também posso alterar o tamanho após o print. A partir desse ponto, o programa utilizará o novo dado.
