public class principal {
    public static void main(String[] args) {
        cliente joao = new cliente();
        joao.setNome("Joao");

        conta CC = new contaCorrente(joao);
        conta poupanca = new contaPoupanca(joao);

        CC.depositar(100.00);
        CC.sacar(25.00);
        CC.transferir(30.0,poupanca);
        poupanca.depositar(20.0);
        CC.imprimirExtrato();
        poupanca.imprimirExtrato();

        cliente maria = new cliente();
        maria.setNome("Maria");

        conta CC1 = new contaCorrente(maria);
        conta poupanca1 = new contaPoupanca(maria);

        CC1.depositar(200.00);
        CC1.sacar(25.00);
        CC1.transferir(60.0,poupanca);
        poupanca1.depositar(42.0);
        CC1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        cliente pedro = new cliente();
        pedro.setNome("Pedro");

        conta CC2 = new contaCorrente(pedro);
        conta poupanca2 = new contaPoupanca(pedro);

        CC2.depositar(250.00);
        CC2.sacar(90.00);
        CC2.transferir(30.0,poupanca1);
        poupanca2.depositar(20.0);
        CC2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        //poupanca Maria após transferencia de Pedro:
        poupanca1.imprimirExtrato();
    }
}
