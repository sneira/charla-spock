import spock.lang.*

/**
*  Created by Sofía on 08/05/2016.
*/

@Title("Título de esta clase")
@Narrative("Esto es una clase de ejemplo para una charla")
class CharlaSpec extends Specification {

    /*@Unroll
    def "La calculadora suma correctamente: #a + #b = #c"() {
        expect:
        Calculadora.sumar(a, b) == c

        where:
        *//*a << [1, 2, 3]
        b << [3, 4, 5]
        c << [4, 6, 8]*//*
        a | b || c
        1 | 3 || 4
        2 | 4 || 6
        3 | 5 || 8
        1 | 2 || 3
        0 | 7 || 7
    }

    def "Los strings se suman correctamente"() {
        *//*expect:
        Calculadora.sumarStrings("150", "200") == "350"*//*
        when:
        def resultado = Calculadora.sumarStrings("150", "200")

        then:
        notThrown(NumberFormatException)
        resultado == "350"
    }

    def "Sumar strings con letras da una excepción"() {
        when:
        Calculadora.sumarStrings("150", "a")

        then:
        thrown(NumberFormatException)
    }

    // todo: de aquí para abajo son pruebas

    *//*@Shared*//* static def entero = 2

    def "La multiplicación funciona correctamente"() {
        expect:
        Calculadora.multiplicar(a, b) == c

        where:
        *//*a << [1, 2, 3]
        b << [3, 4, 5]
        c << [3, 8, 15]*//*
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

        and: "Y no está vacío, y su tamaño es menor a 2"
        !vector.isEmpty()
        vector.size() < 2
    }

    def "Prueba propiedades"() {
        expect:
        entero == 2

        when:
        entero += a

        then:
        entero == b

        where:
        a | b
        3 | 5
        4 | 6
    }

    def "Prueba propiedades 2"() {
        expect:
        entero == 2

        when:
        entero += 5

        then:
        entero == 7
    }

    static class Calculadora {
        static def sumar(def a, def b) {
            a + b
        }

        static def restar(def a, def b) {
            a - b
        }

        static def multiplicar(int a, int b) {
            a * b
        }

        static def dividir (def a, def b) {
            a / b
        }

        static String sumarStrings(String a, String b) {
            return (a.toInteger() + b.toInteger()) as String
        }

    }*/
}
