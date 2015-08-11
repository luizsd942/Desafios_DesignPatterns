import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.sistemavendas.produto.Produto;
import com.sistemavendas.venda.LojaFactory;
import com.sistemavendas.venda.ModuloVendaAbstract;
import com.sistemavendas.venda.Venda;

public class TestVendaComSPeBradesco {

	Venda venda;
	Produto produto;

	@Before
	public void init() {
		ModuloVendaAbstract bradescoRJ = new LojaFactory("bol_bra", "nfe_sp");
		venda = new Venda(bradescoRJ);
		produto = new Produto();
	}

	@Test
	public void deveEmitirTotalNotaFiscalEGerarBoleta() {
		venda.realizar(ExecutaVenda());

		assertEquals(new BigDecimal("120.0").doubleValue(), produto
				.getValorTotal().doubleValue(), 0.0001);
	}

	public Produto ExecutaVenda() {
		produto.setNome("Bolsa");
		produto.setQuantidade("2");
		produto.setValorUnitario(new BigDecimal("50"));

		// venda.realizar(produto); // Mostra a saída no console

		return produto;
	}

}
