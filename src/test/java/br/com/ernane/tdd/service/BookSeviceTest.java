package br.com.ernane.tdd.service;

import br.com.ernane.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookSeviceTest {

    @Test
    public void bonusDeveriaSerZeroParaSalariosAltos() throws IllegalAccessException {
        BonusService bonusService = new BonusService();
        assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(new Funcionario("Ernane Sousa", LocalDate.now(), new BigDecimal("25000"))));

    }

    @Test
    public void bonusDeveriaSerDezPorCentoDoSalario(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus =  bonusService.calcularBonus(new Funcionario("Ernane Sousa", LocalDate.now(), new BigDecimal("1500")));
        assertEquals(new BigDecimal("150.0"), bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorCentoParaSalarioDeDezMilReais(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus =  bonusService.calcularBonus(new Funcionario("Ernane Sousa", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.0"), bonus);
    }

}
