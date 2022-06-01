package br.com.ernane.tdd.service;

import java.math.BigDecimal;

import br.com.ernane.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario){
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com salário maio que R$10.000,00 não pode recebrr bonus. ");
		}
		return valor;
	}

}
