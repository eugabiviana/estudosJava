package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(count); // também poderia ser System.out.println(++count);, sem a condição abaixo!
            count = count + 1; // é o mesmo que: count += 1; e count++;
        }

        count = 0;
        do {
            System.out.println("dentro do do-while "+ ++count);
        }while (count < 10);

        for (int i = 0; i <10; i++){
            System.out.println("For "+i);
        }
    }
}
