package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidacaoAjustes> validacoes;
	
	public ReajusteService(List<ValidacaoAjustes> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal reajuste) {
		this.validacoes.forEach(v -> v.validar(funcionario, reajuste));
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(reajuste);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
