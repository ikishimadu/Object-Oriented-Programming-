package pootwo;

public class MainPessoa {

    public static void main(String[] args) {


        Pessoa fisica = new Pessoa();

        //DEFININDO VALORES PARA OS ATRIBUTOS.


        fisica.setNome("Maria Eduarda");
        fisica.setCpf("075.914.715-97");
        fisica.setIdade("19 anos");

        //Instanciando objeto e definindo valorespara os atributos.


        //Solicitando valores dos atributos.
        System.out.println("Objeto: " +fisica);
        System.out.println("Nome: " +fisica.getNome());
        System.out.println("CPF: " +fisica.getCpf());
        System.out.println("Idade: " +fisica.getIdade());



    }


}
