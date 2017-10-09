package model;

public class Cliente {
	private String telefone;
	private String email;

	public Cliente() {

	}
	
	public Cliente(String telefone, String nome){
		this.setEmail(email);
		this.setTelefone(telefone);
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		Cliente.validarTelefone(telefone);
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Cliente.validarEmail(email);
		this.email = email;
	}

	private static void validarEmail(String email2) {
		// TODO Auto-generated method stub
		
	}
	
	private static void validarTelefone(String telefone2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
