package model;

import java.util.Set;

public class Funcionario {
	private int matricula;
	private String nome;
	private Double salario;
	private Set<Compra> cExecutada;
	private Set<Compra> cCancelada;
	
	public Funcionario(){
		
	}
	
	public Funcionario(int matricula, String nome, Double salario){
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setSalario(salario);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		Funcionario.validarMatricula(matricula);
		this.matricula = matricula;
	}

	private static void validarMatricula(int matricula) {
		// TODO Auto-generated method stub
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Funcionario.validarNome(nome);
		this.nome = nome;
	}

	private static void validarNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		Funcionario.validarSalario(salario);
		this.salario = salario;
	}

	private static void validarSalario(Double salario) {
		// TODO Auto-generated method stub
		
	}

	public Set<Compra> getcExecutada() {
		return cExecutada;
	}

	public void setcExecutada(Set<Compra> cExecutada) {
		Funcionario.validarCExecutado(cExecutada);
		this.cExecutada = cExecutada;
	}

	private static void validarCExecutado(Set<Compra> cExecutada) {
		// TODO Auto-generated method stub
		
	}

	public Set<Compra> getcCancelada() {
		return cCancelada;
	}

	public void setcCancelada(Set<Compra> cCancelada) {
		Funcionario.validarCCancelada(cCancelada);
		this.cCancelada = cCancelada;
	}

	private static void validarCCancelada(Set<Compra> cCancelada) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
