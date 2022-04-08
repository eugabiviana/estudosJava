package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
//        String mensagemDoar = "Doarei 500 reais para o DevDojo.";
//        String mensagemNaoDoar = "Não doarei nada, sem conditions!";
//        String resultado;
//        if (salario > 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemNaoDoar;
//        }
//        System.out.println(resultado);

//        Escrevendo com valor ternário:
        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Doarei 500 reais para o DevDojo." : "Não doarei nada, sem conditions!";
        System.out.println(resultado);

    }
}
