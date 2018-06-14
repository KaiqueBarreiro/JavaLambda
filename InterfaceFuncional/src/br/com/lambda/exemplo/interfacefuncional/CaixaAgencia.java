package br.com.lambda.exemplo.interfacefuncional;

public class CaixaAgencia {
	private double saldo;

	public CaixaAgencia(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static CaixaAgencia atualizarSaldo(CaixaAgencia ctaA, double valor, InterfaceFuncionalContaCorrente trader) {
		return trader.atualizarSaldo(ctaA, valor);

	}
}
