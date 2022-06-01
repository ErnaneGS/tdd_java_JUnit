package br.com.ernane.tdd.service;

import br.com.ernane.tdd.modelo.Desempenho;
import br.com.ernane.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void consederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percentualAReajustar = desempenho.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentualAReajustar);
        funcionario.reajustarSalario(reajuste);
    }

}
