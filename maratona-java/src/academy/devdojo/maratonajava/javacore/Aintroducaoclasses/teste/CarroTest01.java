package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
/*
Crie uma classe Carro e depois imprima dois objetos diferentes.
 */
public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.nome = "Ford Ka";
        carro.modelo = 2006;
        carro.ano = 2007;

        carro2.nome = "Mobi";
        carro2.modelo = 2020;
        carro2.ano = 2021;

        System.out.println("Carro 1: " + carro.nome + "; Modelo: " + carro.modelo + "; Ano: " + carro.ano + ".");
        System.out.println("Carro 2: " + carro2.nome + "; Modelo: " + carro2.modelo + "; Ano: " + carro2.ano + ".");
    }
}
