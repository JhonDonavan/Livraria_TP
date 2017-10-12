package model;

import java.util.Set;
import java.util.TreeSet;

public class Editora {
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private String email;
	private String telefone;
	private Set<Livro> livros;
	
	public Editora(){
		
	}
	
	public Editora(String nomeFantasia, String razaoSocial, String cnpj, String email, String telefone) 
			throws DadosException {
		super();
		this.setNomeFantasia(nomeFantasia);
		this.setRazaoSocial(razaoSocial);
		this.setCnpj(cnpj);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.livros = new TreeSet<Livro>();
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) throws DadosException {
		Editora.validarNomeFantasia(nomeFantasia);
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) throws DadosException {
		Editora.validarRazaoSocial(razaoSocial);
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) throws DadosException {
		Editora.validarCnpj(cnpj);
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws DadosException {
		Editora.validarEmail(email);
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws DadosException {
		Editora.validarTelefone(telefone);
		this.telefone = telefone;
	}
	
	public Set<Livro> informarLivros() throws DadosException { 
		return new TreeSet<Livro>(this.livros);
	}
	
	public static void validarNomeFantasia(String nomeFantasia) throws DadosException {
		
	}
	
	public static void validarRazaoSocial(String razaoSocial) throws DadosException {
		
	}
	
	public static void validarCnpj(String cnpj) throws DadosException {
		
	}
	
	public static void validarEmail(String email) throws DadosException {
		
	}
	
	public static void validarTelefone(String telefone) throws DadosException {
		
	}
	
	public static void validarLivro(String livro) throws DadosException {
		
	}
}
