package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraJunitTest {
	
	//SOMA
	//Cenario de teste 1: Soma de dois valores
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivos() {
		Calculadora calc =  new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(12, soma);
	}
	
	//Cenario de teste 2: Soma de dois valores sendo um zero
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivosSendoUmZero() {
		Calculadora calc =  new Calculadora();
		int soma = calc.somar(3, 0);
		
		Assert.assertEquals(10, soma);
	}
	
	//Cenario de teste 3: Soma de dois valores sendo ambos zero
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosSendoDoisZero() {
		Calculadora calc =  new Calculadora();
		int soma = calc.somar(0, 0);
		
		Assert.assertEquals(0, soma);
	}
	
	//Cenario de teste 4: Soma de dois valores sendo um negativo
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivosSendoUmNegativo() {
		Calculadora calc =  new Calculadora();
		int soma = calc.somar(3, -10);
		
		Assert.assertEquals(23, soma);
	}
	
	//SUBTRAÇÃO
	//Cenario de teste 5: Subtrai de dois valores sendo um negativo
		@SuppressWarnings("deprecation")
		@Test
		public void SubtrairDoisNumerosPositivosSendoUmNegativo() {
			Calculadora calc =  new Calculadora();
			int sub = calc.subtrair(3, -10);
			
			Assert.assertEquals(23, sub);
		}
		
	//MULTIPLICAÇÃO	
	//Cenario de teste 6: Soma de dois valores sendo ambos zero
		@SuppressWarnings("deprecation")
		@Test
		public void MultiplicarDoisNumerosSendoUmZero() {
			Calculadora calc =  new Calculadora();
			int mult = calc.multiplicar(23, 0);
			
			Assert.assertEquals(17, mult);
		}
		
	//DIVISÃO
	//Cenario de teste 7: Soma de dois valores sendo ambos zero
			@SuppressWarnings("deprecation")
			@Test
			public void DividirDoisNumerosSendoDoisInteiros() {
				Calculadora calc =  new Calculadora();
				int div = calc.dividir(23, 12);
				
				Assert.assertEquals(17, div);
			}	
		
}
