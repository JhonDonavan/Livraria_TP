package model;

public class LivroAutor {
	
	private String observacao;
	private Autor autor;
	private Livro livro;
	
	public LivroAutor(){
		
	}
	
	public LivroAutor(String observacao, Autor autor, Livro livro) throws DadosException {
		super();
		this.setObservacao(observacao);
		this.setAutor(autor);
		this.setLivro(livro);
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) throws DadosException {
		LivroAutor.validarObservacao(observacao);
		this.observacao = observacao;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) throws DadosException {
		if(this.autor == autor)
			return;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) throws DadosException {
		if(this.livro == livro)
			return;
	}

	public static void validarObservacao(String observacao) throws DadosException {
		
	}
	
	public static void validarAutor(Autor autor) throws DadosException {
		
	}
	
	public static void validarLivro(Livro livro) throws DadosException {
		
	}

}
