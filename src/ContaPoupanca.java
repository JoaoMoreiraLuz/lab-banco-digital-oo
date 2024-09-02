
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Valor de " + valor + " depositado na sua conta poupança, saldo total: " + saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
