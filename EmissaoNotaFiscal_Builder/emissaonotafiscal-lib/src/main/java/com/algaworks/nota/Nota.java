package com.algaworks.nota;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.algaworks.impressaonota.NotaFiscalInterface;
/*
 * Classe abstrata que representa uma NotaFiscal
 * Usa o método abstrato calculoImpostos() do tipo NotaFiscalInterface.
 */
public abstract class Nota {
	
	private int numero;
	private Date dataEmissao;
	private List<Item> itens;
	
	protected abstract NotaFiscalInterface calculoImpostos();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	//Metodo que dve ser chamado no Builder
	//calcula o total da nota e calcula imposto sobre a Nota.
	public final BigDecimal calculoNF() {
		BigDecimal total = this.getValorTotal();		
		return calculoImpostos().calcularImpostoNota(total);
	}
	
	public BigDecimal getValorTotal(){
		BigDecimal total = BigDecimal.ZERO;
		
		for (Item item: itens){
			total = total.add(item.getValor().multiply(new BigDecimal(item.getQuantidade())));
		}
		
		return total;
	}
	
}
