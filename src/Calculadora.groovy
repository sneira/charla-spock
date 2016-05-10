/**
 * Created by Sofía on 11/05/2016.
 */
class Calculadora {
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
}
