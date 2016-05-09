import spock.lang.Specification
import spock.lang.Unroll

/**
*  Created by Sofía on 08/05/2016.
*/

class CharlaSpec extends Specification {

    // Propiedades, métodos de precondición, métodos de característica y métodos de ayuda.

    // Métodos de característica: estímulo > respuesta

    def "La multiplicación funciona correctamente"() {
        expect:
        Calculadora.multiplicar(a, b) == c

        where:
        /*a << [1, 2, 3]
        b << [3, 4, 5]
        c << [3, 8, 15]*/
        a | b || c
        1 | 3 || 3
        2 | 4 || 8
        3 | 5 || 15
    }

    @Unroll
    // def "Un número multiplicado por 0 siempre es 0"() {
    def "#a multiplicado por 0 siempre es 0"() { // todo: para mostrar tablas de datos con una sola columna
        expect:
        Calculadora.multiplicar(a, 0) == 0

        where:
        // a << [1, 2, 3]
        a | _
        1 | _
        2 | _
        3 | _
    }

    def "Bloques: when/then"() {
        setup: "Inicializamos el vector"
        Vector vector = new Vector()

        expect: "El vector tiene tamaño 0"
        vector.size() == 0

        when: "Añadimos un elemento al vector"
        vector.add("Prueba")

        then: "El vector tiene tamaño 1"
        vector.size() == 1
    }

    static class Calculadora {
        static def multiplicar(int a, int b) {
            a * b
        }
    }
}
