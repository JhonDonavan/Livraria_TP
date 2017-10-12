package model;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Autor {
	private String nome;
	private String sobreNome;
	private Date dataNascimento;
	private String nacionalidade;
	private Set<LivroAutor> livros;
	
	public Autor(){
		
	}
	
	public Autor(String nome, String sobreNome, Date dataNascimento, String nacionalidade) throws DadosException {
		super();
		this.setNome(nome);
		this.setSobreNome(sobreNome);
		this.setDataNascimento(dataNascimento);
		this.setNacionalidade(nacionalidade);
		this.livros = new TreeSet<LivroAutor>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws DadosException{
		Autor.validarNome(nome);
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) throws DadosException {
		Autor.validarSobreNome(sobreNome);
		this.sobreNome = sobreNome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) throws DadosException {
		Autor.validarDataNascimento(dataNascimento);
		this.dataNascimento = dataNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) throws DadosException {
		Autor.validarNacionalidade(nacionalidade);
		this.nacionalidade = nacionalidade;
	}
	
	public Set<LivroAutor> informarLivros() throws DadosException { 
		return new TreeSet<LivroAutor>(this.livros);
	}
	
	public static void validarNome(String nome) throws DadosException {
		
	}
	
	public static void validarSobreNome(String sobreNome) throws DadosException {
		
	}
	
	public static void validarDataNascimento(Date dataNascimento) throws DadosException {
		
	}
	
	public static void validarNacionalidade(String nacionalidade) throws DadosException {
		
	}

}
