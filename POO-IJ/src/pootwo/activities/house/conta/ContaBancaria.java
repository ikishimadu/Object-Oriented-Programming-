package pootwo.activities.house.conta;

public class ContaBancaria {

    private String banco;

    private String agencia;

    private int numeroconta;

    private String tipoconta;

    private int saldoatual;

    private int limitedisponivel;

    public ContaBancaria(String banco, String agencia, int numeroconta, String tipoconta, int saldoatual, int limitedisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.tipoconta = tipoconta;
        this.saldoatual = saldoatual;
        this.limitedisponivel = limitedisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public int getSaldoatual() {
        return saldoatual;
    }

    public void setSaldoatual(int saldoatual) {
        this.saldoatual = saldoatual;
    }

    public int getLimitedisponivel() {
        return limitedisponivel;
    }

    public void setLimitedisponivel(int limitedisponivel) {
        this.limitedisponivel = limitedisponivel;
    }
}
