package model;

public abstract class Cliente {
	private String telefone;
	private String email;

	public Cliente() {

	}
	
	public Cliente(String telefone, String nome) throws DadosException{
		this.setEmail(email);
		this.setTelefone(telefone);
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws DadosException{
		Cliente.validarTelefone(telefone);
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws DadosException{
		Cliente.validarEmail(email);
		this.email = email;
	}

	private static void validarEmail(String email) throws DadosException{
		if(email.isEmpty()){
			throw new DadosException(new ErroDeDominio(1, Cliente.class, "O email deve ser infomado"));
		}
		
	}
	
	private static void validarTelefone(String telefone) throws DadosException{
		if(telefone.isEmpty()){
			throw new DadosException(new ErroDeDominio(2, Cliente.class, "O telefone deve ser infomado"));
		}
	}

	
	
}
