package model;

public class ItemDeCompra {
	private int quantidade;
	private double precoPraticado;
	private Livro livro;
	private Compra compra;
	
	public ItemDeCompra(){
		
	}
	
	public ItemDeCompra(int quantidade, double precoPraticado, Livro livro, Compra compra) throws DadosException {
		super();
		this.setQuantidade(quantidade);
		this.setPrecoPraticado(precoPraticado);
		this.setLivro(livro);
		this.setCompra(compra);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) throws DadosException { 
		this.quantidade = quantidade;
	}

	public double getPrecoPraticado() {
		return precoPraticado;
	}

	public void setPrecoPraticado(double precoPraticado) throws DadosException {
		this.precoPraticado = precoPraticado;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) throws DadosException {
		if(this.livro == livro)
			return;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) throws DadosException {
		if(this.compra == compra)
			return;
	}
	
	public static void validarQuantidade(int quantidade) throws DadosException {
		
	}

	public static void validarPrecoPraticado(double precoPraticado) throws DadosException {
		
	}

}
