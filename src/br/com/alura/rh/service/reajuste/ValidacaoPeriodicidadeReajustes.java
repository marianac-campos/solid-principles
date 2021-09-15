package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeReajustes implements ValidacaoAjustes{

	@Override
	public void validar(Funcionario funcionario, BigDecimal reajuste) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataReajusteAtual = LocalDate.now();
		
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataReajusteAtual);
		
		if(mesesDesdeUltimoReajuste < 9) {
			throw new ValidacaoException("Tempo minimo entre ajustes e de 9 meses!");
		}
		
	}

}
