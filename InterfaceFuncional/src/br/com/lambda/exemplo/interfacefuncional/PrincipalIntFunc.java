package br.com.lambda.exemplo.interfacefuncional;

public class PrincipalIntFunc {
	
	public static void main(String[] args) {
		new PrincipalIntFunc().processar();
	}

	private void processar() {
		InterfaceFuncionalContaCorrente lambdaDepositar = (X, Y) -> {
			return new CaixaAgencia(X.getSaldo() + Y);
		};
		InterfaceFuncionalContaCorrente lambdaSacar = (X, Y) -> {
			return new CaixaAgencia(X.getSaldo() - Y);
		};
		CaixaAgencia novaConta = null;
		novaConta = CaixaAgencia.atualizarSaldo(new CaixaAgencia(100.0), 7.0, lambdaDepositar);
		System.out.println("Nova conta após depósito: " + novaConta.getSaldo());
		novaConta = CaixaAgencia.atualizarSaldo(new CaixaAgencia(100.0), 7.0, lambdaSacar);
		System.out.println("Nova conta após saque: " + novaConta.getSaldo());
	}
}
