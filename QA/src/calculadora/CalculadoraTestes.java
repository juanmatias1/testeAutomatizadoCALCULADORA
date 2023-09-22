package calculadora;

public class CalculadoraTestes {
	
	public static void main(String [] args) {
		Calculadora calc = new Calculadora();
		
		//SOMA
		System.out.println("SOMAR:");
		//Cenario de teste 1: Soma de dois valores
		int soma = calc.somar(3,7);
		System.out.println(soma);
		
		//Cenario de teste 2: Soma de dois valores sendo um zero
		soma = calc.somar(3,0);
		System.out.println(soma);
		
		//Cenario de teste 3: Soma de dois valores sendo ambos zero
		soma = calc.somar(0,0);
		System.out.println(soma);
		
		//Cenario de teste 4: Soma de dois valores sendo um negativo
		soma = calc.somar(3,-1);
		System.out.println(soma);
		
		//SUBTRAIR
		System.out.println("SUBTRAÇÃO:");
		//Cenario de teste 1: Subtração de dois valores
		int sub = calc.subtrair(3,7);
		System.out.println(sub);
		
		//Cenario de teste 2: Subtração de dois valores sendo um zero
		sub = calc.subtrair(3,0);
		System.out.println(sub);
		
		//Cenario de teste 3: Subtração de dois valores sendo ambos zero
		sub = calc.subtrair(0,0);
		System.out.println(sub);
		
		//Cenario de teste 4: Subtração de dois valores sendo um negativo
		sub = calc.subtrair(3,-1);
		System.out.println(sub);
		
		//MULTIPLICAR
		System.out.println("MULTIPLICAÇÃO:");
		//Cenario de teste 1: Multiplicação de dois valores
		int mult = calc.multiplicar(3,7);
		System.out.println(mult);
		
		//Cenario de teste 2: Multiplicação de dois valores sendo um zero
		mult = calc.multiplicar(3,0);
		System.out.println(mult);
		
		//Cenario de teste 3: Multiplicação de dois valores sendo ambos zero
		mult = calc.multiplicar(0,0);
		System.out.println(mult);
		
		//Cenario de teste 4: Multiplicação de dois valores sendo um negativo
		mult = calc.multiplicar(3,-1);
		System.out.println(mult);
		
		//DIVIDIR
		System.out.println("DIVISÃO:");
		//Cenario de teste 1: Divisão de dois valores
		int div = calc.dividir(3,7);
		System.out.println(div);
		
		//Cenario de teste 2: Divisão de dois valores sendo um zero
		div = calc.dividir(3,0);
		System.out.println(div);
		
		//Cenario de teste 3: Divisão de dois valores sendo ambos zero
		div = calc.dividir(0,0);
		System.out.println(div);
		
		//Cenario de teste 4: Divisão de dois valores sendo um negativo
		div = calc.dividir(3,-1);
		System.out.println(div);
	}
}
