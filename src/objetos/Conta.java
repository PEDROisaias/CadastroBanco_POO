package objetos;

public abstract class Conta {
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
