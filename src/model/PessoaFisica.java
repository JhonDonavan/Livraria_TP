package model;

public class PessoaFisica extends Cliente{
	private String nome;
	private String cpf;
	
	public PessoaFisica(){
		
	}
	
	public PessoaFisica(String nome, String cpf, String telefone, String email) throws DadosException {
		super();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws DadosException {
		PessoaFisica.validarNome(nome);
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws DadosException {
		PessoaFisica.validarCpf(cpf);
		this.cpf = cpf;
	}
	
	private static void validarNome(String nome) throws DadosException {
		
	}
	
	private static void validarCpf(String cpf) throws DadosException {
		
	}
}
