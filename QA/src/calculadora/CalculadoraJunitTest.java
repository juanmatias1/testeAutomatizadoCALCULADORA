package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * Classe de teste para a classe Calculadora utilizando JUnit.
 */
public class CalculadoraJunitTest {
    
    // ------------------- SOMA -------------------
    
    /**
     * Testa a soma de dois números positivos.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        
        Assert.assertEquals(12, soma);
    }
    
    /**
     * Testa a soma de dois números, sendo um deles zero.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivosSendoUmZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 0);
        
        Assert.assertEquals(10, soma);
    }
    
    /**
     * Testa a soma de dois números, ambos zero.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosSendoDoisZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(0, 0);
        
        Assert.assertEquals(0, soma);
    }
    
    /**
     * Testa a soma de dois números, sendo um deles negativo.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivosSendoUmNegativo() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, -10);
        
        Assert.assertEquals(23, soma);
    }
    
    // ------------------- SUBTRAÇÃO -------------------
    
    /**
     * Testa a subtração de dois números, sendo um deles negativo.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void SubtrairDoisNumerosPositivosSendoUmNegativo() {
        Calculadora calc = new Calculadora();
        int sub = calc.subtrair(3, -10);
        
        Assert.assertEquals(23, sub);
    }
    
    // ------------------- MULTIPLICAÇÃO -------------------
    
    /**
     * Testa a multiplicação de dois números, sendo um deles zero.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicarDoisNumerosSendoUmZero() {
        Calculadora calc = new Calculadora();
        int mult = calc.multiplicar(23, 0);
        
        Assert.assertEquals(17, mult);
    }
    
    // ------------------- DIVISÃO -------------------
    
    /**
     * Testa a divisão de dois números, ambos inteiros.
     */
    @SuppressWarnings("deprecation")
    @Test
    public void DividirDoisNumerosSendoDoisInteiros() {
        Calculadora calc = new Calculadora();
        int div = calc.dividir(23, 12);
        
        Assert.assertEquals(1, div);
    }
}

