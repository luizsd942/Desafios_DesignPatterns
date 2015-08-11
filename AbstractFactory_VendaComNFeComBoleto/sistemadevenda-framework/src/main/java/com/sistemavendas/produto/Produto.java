package com.sistemavendas.produto;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private String quantidade;
	private BigDecimal valorUnitario;
	private BigDecimal valorTotal;

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public Produto() {
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valor) {
		this.valorUnitario = valor;
	}

	public double calcularTotal(double imposto) {
		valorTotal = valorUnitario.multiply(new BigDecimal(quantidade));
		valorTotal = valorTotal.multiply(new BigDecimal(imposto));
		return valorTotal.doubleValue();
	}
}
