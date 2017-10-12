package model;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Livro {
	private String titulo;
	private String isbn;
	private double preco;
	private Date anoLancamento;
	private int edicao;
	private int quantidadeEstoque;
	private Editora editora;
	private Set<LivroAutor> livautores;
	
	public Livro(){
		
	}

	public Livro(String titulo, String isbn, double preco, Date anoLancamento, int edicao,
			int quantidadeEstoque, Editora editora) throws DadosException{
		super();
		this.setTitulo(titulo);
		this.setIsbn(isbn);
		this.setPreco(preco);
		this.setAnoLancamento(anoLancamento);
		this.setEdicao(edicao);
		this.setQuantidadeEstoque(quantidadeEstoque);
		this.setEditora(editora);
		this.livautores = new TreeSet<LivroAutor>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws DadosException {
		Livro.validarTitulo(titulo);
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws DadosException {
		Livro.validarIsbn(isbn);
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws DadosException {
		Livro.validarPreco(preco);
		this.preco = preco;
	}

	public Date getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Date anoLancamento) throws DadosException {
		Livro.validarAnoLancamento(anoLancamento);
		this.anoLancamento = anoLancamento;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) throws DadosException {
		Livro.validarEdicao(edicao);
		this.edicao = edicao;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) throws DadosException {
		Livro.validarQuantidadeEstoque(quantidadeEstoque);
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) throws DadosException{
		Livro.validarEditora(editora);
		this.editora = editora;
	}

	public void adicionarLivroAutor(LivroAutor livaut) throws DadosException {
		Livro.validarLivroAutor(livaut);
	}
	
	public void removerLivroAutor(LivroAutor livaut) throws DadosException {
		Livro.validarLivroAutor(livaut);
	}
	
	public static void validarTitulo(String titulo) throws DadosException {
		
	}
	
	public static void validarIsbn(String isbn) throws DadosException {
		
	}
	
	public static void validarPreco(double preco) throws DadosException {
		
	}
	
	public static void validarAnoLancamento(Date anaLancamento) throws DadosException {
		
	}
	
	public static void validarEdicao(int edicao) throws DadosException {
		
	}
	
	public static void validarQuantidadeEstoque(int quantidadeEstoque) throws DadosException {
		
	}
	
	public static void validarEditora(Editora editora) throws DadosException {
		
	}
	
	public static void validarLivroAutor(LivroAutor livaut) throws DadosException {
		
	}

}