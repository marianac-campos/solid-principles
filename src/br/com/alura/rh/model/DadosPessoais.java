package br.com.alura.rh.model;

import java.time.LocalDate;

public class DadosPessoais {

	private String nome;
	private LocalDate dataNascimento;
	private String cpf;

	public DadosPessoais(String nome, LocalDate dataNascimento, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
}
