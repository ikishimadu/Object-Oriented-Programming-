package pootwo.activities.house.conta;

public class Funcionario {

    private String codigofuncionario;

    private String nome;

    private String endereço;

    private String telefone;

    private String email;

    private ContaBancaria conta;

    public Funcionario(String codigofuncionario, String nome, String endereço, String telefone, String email, ContaBancaria conta) {
        this.codigofuncionario = codigofuncionario;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.conta = conta;
    }

    public String getCodigofuncionario() {
        return codigofuncionario;
    }

    public void setCodigofuncionario(String codigofuncionario) {
        this.codigofuncionario = codigofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }
}
