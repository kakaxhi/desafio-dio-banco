import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.setNome("Diego");
		
		Conta contaCorrente1 = new ContaCorrente(diego);
		Conta contaPoupanca1 = new ContaPoupança(diego);
		
		contaCorrente1.depositar(1000);
		contaCorrente1.depositar(100);
		contaCorrente1.transferir(300, contaPoupanca1);

		
		contaCorrente1.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();
		
		Banco banco = new Banco("Santander", List.of(contaCorrente1, contaPoupanca1));
        banco.listarClientes();

	}

}