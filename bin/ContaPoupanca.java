package desafioBanco;

public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("\n*** Extrato Conta Poupan�a ***");
		super.imprimirInfoComuns();
	}



	
	
}
