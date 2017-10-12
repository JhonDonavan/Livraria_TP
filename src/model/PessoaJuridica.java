package model;

public class PessoaJuridica extends Cliente{
	private String razaoSocial;
	private String nomeFantasia;
	private String sigla;
	private int cnpj;
	
	public PessoaJuridica(){
		
	}
	
	public PessoaJuridica(String razaoSocial, String nomeFantasia, String sigla, int cnpj, String telefone, 
			String email) throws DadosException {
		super();
		this.setRazaoSocial(razaoSocial);
		this.setNomeFantasia(nomeFantasia);
		this.setSigla(sigla);
		this.setCnpj(cnpj);
		this.setTelefone(telefone);
		this.setEmail(email);
		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) throws DadosException {
		PessoaJuridica.validarRazaoSocial(razaoSocial);
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) throws DadosException {
		PessoaJuridica.validarNomeFantasia(nomeFantasia);
		this.nomeFantasia = nomeFantasia;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) throws DadosException {
		PessoaJuridica.validarSigla(sigla);
		this.sigla = sigla;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) throws DadosException {
		PessoaJuridica.validarCnpj(cnpj);
		this.cnpj = cnpj;
	}
	
	private static void validarNomeFantasia(String nomeFantasia) throws DadosException {
		
	}
	
	private static void validarRazaoSocial(String razaoSocial) throws DadosException {
		
	}
	
	private static void validarSigla(String sigla) throws DadosException {
		
	}
	
	private static void validarCnpj(int cnpj) throws DadosException {
		
	}

}
