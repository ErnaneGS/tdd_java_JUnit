package br.com.ernane.tdd.service;

import br.com.ernane.tdd.modelo.Desempenho;
import br.com.ernane.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("Ernane Sousa", LocalDate.now(), new BigDecimal(1000.00));
    }

    @Test
    public void seDesempenhoForADesejarReajusteSalarialDeveSerDeTresPorCento(){
        reajusteService.consederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void seDesempenhoForBomReajusteSalarialDeveSerDeQuinzePorCento(){
        reajusteService.consederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void seDesempenhoForOtimoReajusteSalarialDeveSerDeVintePorCento(){
        reajusteService.consederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
