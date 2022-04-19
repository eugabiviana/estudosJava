package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Condição: valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;

        for (int numParcelas = (int)valorCarro; numParcelas >= 1; numParcelas--){
            double valorParcela = valorCarro / numParcelas;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+numParcelas+ " R$"+valorParcela);
        }
    }
}
