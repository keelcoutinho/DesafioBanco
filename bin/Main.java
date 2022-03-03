package desafioBanco;

public class Main {

	public static void main(String[] args) {
		Cliente Ana = new Cliente();
		Ana.setNome("Ana");
		
		iConta cc = new ContaCorrente(Ana);
		cc.depositar(100);
		
		iConta poupanca = new ContaPoupanca(Ana);
		
		cc.transferir(100, poupanca);
		poupanca.sacar(20);			
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
