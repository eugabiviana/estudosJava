package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        } else if(num1 > num2) {
            return num1 / num2;
        } else{
            return num2 / num1;
        }
    }
}
//Posso colocar dois tipos de números diferentes no parâmetro, desde que isso esteja especificado na criação do método.