package model;

import java.util.Date;

public class Compra {
	private String observacoes;
	private Date dataCompra;
	private Cliente cliente;
	
	public Compra(){
		
	}
	
	public Compra(String observacoes, Date dataCompra, Cliente cliente){
		this.setCliente(cliente);
		this.setDataCompra(dataCompra);
		this.setObservacoes(observacoes);
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		Compra.validarObservacoes(observacoes);
		this.observacoes = observacoes;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		Compra.validarDataCompra(dataCompra);
		this.dataCompra = dataCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		Compra.validarCliente(cliente);
		this.cliente = cliente;
	}
	
	
	private static void validarCliente(Cliente cliente2) {
		// TODO Auto-generated method stub
		
	}

	private static void validarObservacoes(String observacoes2) {
		// TODO Auto-generated method stub
		
	}
	
	
	private static void validarDataCompra(Date dataCompra2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
