package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica!");
        }else {
            System.out.println("MENOR DE IDADE! Não autorizado a comprar bebida alcoólica.");
        }

        /**
         * ! -> operador de negação
         * Nesse caso, eu também poderia escrever o if usando boolean:
         * if (isAutorizadoComprarBebida == false){}
         * Esse if aqui de baixo é independente do de cima!
         */
        if (!isAutorizadoComprarBebida){
            System.out.println("MENOR DE IDADE! Não autorizado a comprar bebida alcoólica.");
        }
        //só para saber que existe, mas não é usado!
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }


    }
}
