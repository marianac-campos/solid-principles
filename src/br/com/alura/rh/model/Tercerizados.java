package br.com.alura.rh.model;

import java.time.LocalDate;

public class Tercerizados {

	private DadosPessoais dadosPessoais;
	private String empresa;
	
	public Tercerizados(String nome, String cpf, LocalDate dataNascimento, String empresa) {
		this.dadosPessoais = new DadosPessoais(nome, dataNascimento, cpf);
		this.empresa = empresa;
	}
	
	//getters and setters
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	public String getEmpresa() {
		return empresa;
	}
}
