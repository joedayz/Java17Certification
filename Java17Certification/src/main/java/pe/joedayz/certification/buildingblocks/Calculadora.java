package pe.joedayz.certification;
/**
 * La clase {@code Calculadora} proporciona métodos para realizar operaciones matemáticas básicas 
 * como suma, resta, multiplicación y división.
 * <p>
 * Ejemplo de uso:
 * <pre>{@code
 * Calculadora calculadora = new Calculadora();
 * int suma = calculadora.sumar(5, 3);  // 8
 * int resta = calculadora.restar(5, 3);  // 2
 * int multiplicacion = calculadora.multiplicar(5, 3);  // 15
 * double division = calculadora.dividir(5, 3);  // 1.6667
 * }</pre>
 * </p>
 * <p>
 * Nota: La división por cero no está permitida y lanzará una excepción {@link ArithmeticException}.
 * </p>
 * 
 * @version 1.0
 * @since 2024-07-02
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     * 
     * @param a el primer número a sumar
     * @param b el segundo número a sumar
     * @return la suma de {@code a} y {@code b}
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param a el número del cual restar
     * @param b el número a restar
     * @return la resta de {@code b} de {@code a}
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param a el primer número a multiplicar
     * @param b el segundo número a multiplicar
     * @return el producto de {@code a} y {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * 
     * @param a el numerador
     * @param b el denominador
     * @return el cociente de {@code a} y {@code b}
     * @throws ArithmeticException si {@code b} es 0
     */
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) a / b;
    }
}
