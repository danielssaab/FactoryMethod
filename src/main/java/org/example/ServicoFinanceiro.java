package org.example;

public class ServicoFinanceiro implements IServico {

	public String executar() {
		return "Transação financeira realizada";
	}

	public String cancelar() {
		return "Transação financeira cancelada";
	}
}
