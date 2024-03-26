package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoListaComprasTest {

	@Test
	void deveCriarListaCompras() {
		IServico servico = ServicoFactory.obterServico("ListaCompras");
		assertEquals("Lista de compras criada", servico.executar());
	}

	@Test
	void deveCancelarListaCompras() {
		IServico servico = ServicoFactory.obterServico("ListaCompras");
		assertEquals("Lista de compras cancelada", servico.cancelar());
	}
}