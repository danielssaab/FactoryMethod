package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoFinanceiroTest {

	@Test
	void deveRealizarTransacaoFinanceira() {
		IServico servico = ServicoFactory.obterServico("Financeiro");
		assertEquals("Transação financeira realizada", servico.executar());
	}

	@Test
	void deveCancelarTransacaoFinanceira() {
		IServico servico = ServicoFactory.obterServico("Financeiro");
		assertEquals("Transação financeira cancelada", servico.cancelar());
	}
}
