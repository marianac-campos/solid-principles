package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPorcentualSalario implements ValidacaoAjustes{

	@Override
	public void validar(Funcionario funcionario, BigDecimal reajuste) {
		BigDecimal salarioAtual = funcionario.getSalario();
		
		BigDecimal percentualReajuste = reajuste.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}

}
