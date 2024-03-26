package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoEstoqueTest {

	@Test
	void deveAtualizarEstoque() {
		IServico servico = ServicoFactory.obterServico("Estoque");
		assertEquals("Estoque atualizado", servico.executar());
	}

	@Test
	void deveCancelarAtualizacaoEstoque() {
		IServico servico = ServicoFactory.obterServico("Estoque");
		assertEquals("Operação de estoque cancelada", servico.cancelar());
	}
}