
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Valor de " + valor + " depositado na sua conta corrente, saldo total: " + saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
