import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class conta {

    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numeroConta;
    protected Double saldo;
    protected cliente cliente;
    private static int SEQUENCIAL = 1;


//CONSTRUTOR:

    public conta(cliente cliente) {
        this.agencia = conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++; //gera numero automaticamente
        this.saldo = 0.00;
        this.cliente = cliente;
    }

//METODOS:
    public void sacar(double valor){
        saldo -=valor;

    };
    public void depositar(double valor){
        saldo += valor;
    };
    public void transferir(double valor, conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    };
    protected void imprimirExtrato(){
        System.out.println("=== Extrato da conta === ");
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numeroConta));
        System.out.println(String.format("Cliente: %s ",this.cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    };

//GETTER:

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

}
