package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /**
         * idade < 15 categoria infantil
         * idade >= 15 && < 18 categoria juvenil
         * idade >= 18 idade < 15 categoria adulto
         */
        int idade = 17;
        String categoria;
        
//        if (idade < 15){
//            System.out.println("Categoria: Infantil");
//        } else if (idade >= 15 && idade < 18){
//            System.out.println("Categoria: Juvenil");
//        } else {
//            System.out.println("Categoria: Adulto!");
//        }
//        Outra forma de escrever (mais limpa):
//        if (idade < 15){
//            categoria = "Categoria: Infantil";
//        } else if (idade >= 15 && idade < 18){
//            categoria = "Categoria: Juvenil";
//        } else {
//            categoria = "Categoria: Adulto!";
//        }
//            System.out.println(categoria);

        //Escrevendo com ternário (não indicado!):
        categoria = idade < 15 ? "Categoria: Infantil" : idade >= 15 && idade < 18 ? "Categoria: Juvenil" : "Categoria: Adulto!";
        System.out.println(categoria);
    }
}
