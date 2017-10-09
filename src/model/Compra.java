package model;

import java.util.Date;

public class Compra {
	private String observacoes;
	private Date dataCompra;
	private Cliente cliente;
	
	public Compra(){
		
	}
	
	public Compra(String observacoes, Date dataCompra, Cliente cliente)throws DadosException{
		this.setCliente(cliente);
		this.setDataCompra(dataCompra);
		this.setObservacoes(observacoes);
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes)throws DadosException{
		Compra.validarObservacoes(observacoes);
		this.observacoes = observacoes;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) throws DadosException{
		Compra.validarDataCompra(dataCompra);
		this.dataCompra = dataCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) throws DadosException{
		Compra.validarCliente(cliente);
		this.cliente = cliente;
	}
	
	
	private static void validarCliente(Cliente cliente) throws DadosException{
		// TODO Auto-generated method stub
		
	}

	private static void validarObservacoes(String observacoes)throws DadosException {
		// TODO Auto-generated method stub
		
	}
	
	
	private static void validarDataCompra(Date dataCompra) throws DadosException{
		// TODO Auto-generated method stub
		
	}
	
	
}
