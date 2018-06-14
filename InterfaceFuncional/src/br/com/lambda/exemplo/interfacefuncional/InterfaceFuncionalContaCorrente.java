package br.com.lambda.exemplo.interfacefuncional;

@FunctionalInterface
public interface InterfaceFuncionalContaCorrente {
	// Por ser funcional permite somente um método abstrato
	public CaixaAgencia atualizarSaldo(CaixaAgencia ctaA, double valor);
}
