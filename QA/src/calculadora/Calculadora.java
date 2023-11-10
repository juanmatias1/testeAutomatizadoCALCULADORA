package calculadora;

/**
 * A classe Calculadora realiza operações básicas de aritmética.
 * As operações incluem soma, subtração, multiplicação e divisão.
 */
public class Calculadora {
    
    /**
     * Realiza a adição de dois números inteiros.
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return A soma dos dois números.
     */
    public int somar(int a, int b) {
        return a + b;
    }
    
    /**
     * Realiza a subtração de dois números inteiros.
     * @param a O número do qual será subtraído.
     * @param b O número a ser subtraído.
     * @return A diferença entre os dois números.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    /**
     * Realiza a multiplicação de dois números inteiros.
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O produto dos dois números.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Realiza a divisão de dois números inteiros.
     * @param a O número dividendo.
     * @param b O número divisor.
     * @return O resultado da divisão.
     * @throws ArithmeticException Se a divisão por zero for tentada.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }
}
