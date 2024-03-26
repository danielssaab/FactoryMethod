package org.example;


public class ServicoEstoque implements IServico {

	public String executar() {
		return "Estoque atualizado";
	}

	public String cancelar() {
		return "Operação de estoque cancelada";
	}
}
