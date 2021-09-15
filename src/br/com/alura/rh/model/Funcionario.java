package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
	
	private DadosPessoais dadosPessoais;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;	

	public Funcionario(String nome, String cpf, LocalDate dataNascimento, 
			Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
		this.setDadosPessoais(new DadosPessoais(nome, dataNascimento, cpf));
		this.cargo = cargo;
		this.salario = salario;
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}
	
	public void promoverFuncionario(Cargo novoCargo) {
		this.cargo = novoCargo;
	}

	//getters and setters
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}
	
}
