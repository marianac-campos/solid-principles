package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promoverFuncionario(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		
		if(Cargo.GERENTE == funcionario.getCargo()) {
			throw new ValidacaoException("Nao ha cargo para que gerente seja promovido!");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promoverFuncionario(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario nao pode ser promovido,"
					+ "pois a meta nao foi batida!");
		}
	}
	
}
