package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //Imprima os primeiros 25 números de um dado valor. Ex.: 50.
    public static void main(String[] args) {
         int valorMax = 50;
         for (int i = 0; i < valorMax; i++){
             if (i > 25){
                 break;
             }
             System.out.println(i);
         }
    }
}
    /**
     * Sem o break, o programa segue o laço de repetição se o sysout estiver fora do If.
     * Se for escrito assim:
     * int valorMax = 50;
     *          for (int i = 0; i < valorMax; i++){
     *              if (i <= 25){
     *                  System.out.println(i); <- nesse caso, ele para!
     *              }
     *              System.out.println(i); <- nesse caso ele segue imprimindo até 50.
     *          }
     *          Se escrever o System.out.println(i); aqui, ele não reconhece o i.
     *     }
     */

