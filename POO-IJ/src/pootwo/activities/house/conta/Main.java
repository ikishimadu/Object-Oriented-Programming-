package pootwo.activities.house.conta;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Itaú", "Uniclass", 767559, "Nível 5", 10000, 4000);

        Funcionario pessoa = new Funcionario("F845U368N", "Maria Eduarda", "Rua Mello Morais", "74583215", "dev.eduardajesus@gmail.com", conta );

        System.out.println(pessoa.getConta());

    }

}
