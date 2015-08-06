package com.luiz.builder;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.algaworks.nota.Item;
import com.algaworks.nota.Nota;
import com.luiz.emissaonota.PF.EmissaoNotaPF;
import com.luiz.emissaonota.PJ.EmissaoNotaPJ;
/*
 * Implementação do padrão Builder do Design Pattern - Tem responsabilidade de criar 
 * os objetos e padronizar a inicialização dos métodos.
 */
public class EmitirNotaBuilder{

	private Nota instancia;

	public EmitirNotaBuilder() {		
	}
	
	public EmitirNotaBuilder comPessoaFisica(){
		this.instancia = new EmissaoNotaPF();
		return this;
	}
	
	public EmitirNotaBuilder comPessoaJuridica(){
		this.instancia = new EmissaoNotaPJ();
		return this;
	}
	
	public EmitirNotaBuilder comData(String data){
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.instancia.setDataEmissao(dataFormatada.parse(data));
        } catch (ParseException ex) {
            throw new IllegalArgumentException("Impossível converter a String informada" +
            		" para Data, verifique o valor passado: " + data);
        }        
        return this;
	}
	
	public EmitirNotaBuilder comItem(String nome, String quantidade, String valor){

		Item item = new Item();
		try {
			item.setNome(nome);
			item.setValor(new BigDecimal(valor));
			item.setQuantidade(Integer.parseInt(quantidade));
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Impossível converter a String informada" +
            		" para inteiro, verifique o valor passado: " + quantidade);
        }		
		
		if (this.instancia.getItens() == null) {
			this.instancia.setItens(new ArrayList<Item>());
		}
		
		this.instancia.getItens().add(item);
		
		return this;
	}
	/*
	public NotaFiscal construir() {
		return this.instancia;
	}
	*/
	
	public EmitirNotaBuilderValido comNumero(String numero){
		try {
			this.instancia.setNumero(Integer.parseInt(numero));
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Impossível converter a String informada" +
            		" para inteiro, verifique o valor passado: " + numero);
        }		
		//return this;
		return new EmitirNotaBuilderValido(instancia);
	}
	
}
