public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("John");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.sacar(10);
        cc.imprimirExtrato();
        cc.transferir(50, poupanca);
        
        poupanca.imprimirExtrato();
        poupanca.sacar(25);
        poupanca.imprimirExtrato();
        poupanca.depositar(10);
        poupanca.imprimirExtrato();
        poupanca.transferir(15, cc);

        cc.imprimirExtrato();
    }
}
