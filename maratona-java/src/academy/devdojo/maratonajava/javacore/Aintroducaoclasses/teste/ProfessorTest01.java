package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Tony Boy";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println(professor.nome + ", " + professor.idade + " anos, " + professor.sexo + ".");
    }
}
