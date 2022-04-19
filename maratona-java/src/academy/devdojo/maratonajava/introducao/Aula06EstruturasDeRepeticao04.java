package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Condição: valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;

//        for (int numParcelas = 1; numParcelas <= valorCarro; numParcelas++){
//           double valorParcela = valorCarro / numParcelas;
//            if (valorParcela >= 1000){
//                System.out.println("Parcela "+numParcelas+ " R$"+valorParcela);
//            }else {
//                break;
//            }
//            System.out.println("Fora do if, mas dentro do for. Parcela: "+numParcelas);
//        }
//        Também posso escrever assim:

        for (int numParcelas = 1; numParcelas <= valorCarro; numParcelas++){
            double valorParcela = valorCarro / numParcelas;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+numParcelas+ " R$"+valorParcela);
        }
    }
}
