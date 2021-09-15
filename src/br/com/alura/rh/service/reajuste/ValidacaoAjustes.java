package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoAjustes {

	void validar(Funcionario funcionario, BigDecimal reajuste);
	
}
