package poo;

public class Main {

    public static void main(String[] args) {
        //nome= "José";

        //Aluno alunoSenai = new Aluno ();
        //alunoSenai.nome = "Maria";
        //alunoSenai.idade = 19;

        //Aluno alunoSenai = new Aluno ();
        //alunoSenai.setNome("Maria");
        //alunoSenai.setMatricula("55A116238O");
        //alunoSenai.setIdade(19);

        Aluno alunoSenai = new Aluno("55A116238O", "Maria", 19);


        System.out.println("A matricula do aluno é: " + alunoSenai.getMatricula());
        System.out.println("O nome do aluno é: " + alunoSenai.getNome());
        System.out.println("A idade do aluno é: " + alunoSenai.getIdade());


        //

        //Professor professorSenai = new Professor();
        //professorSenai.setMatricula("82O325874E");
        //professorSenai.setNome("Tido");
        //professorSenai.setIdade(40);

        Professor professorSenai = new Professor ("82O325874E", "Tido", 40);

        System.out.println("\n A matricula do aluno é: " + professorSenai.getMatricula());
        System.out.println("O nome do aluno é: " + professorSenai.getNome());
        System.out.println("A idade do aluno é: " + professorSenai.getIdade());

    }

}
