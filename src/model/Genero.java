package model;

public class Genero {
	private String nome;
	private String descricao;
	private Livro[] livros;
	
	public Genero(){
		
	}
	
	public Genero(String nome, String descricao){
		this.setNome(nome);
		this.setDescricao(descricao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Genero.validarNome(nome);
		this.nome = nome;
	}

	private static void validarNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		Genero.validarDescricao(descricao);
		this.descricao = descricao;
	}

	private static void validarDescricao(String descricao) {
		// TODO Auto-generated method stub
		
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	
	
	
}
