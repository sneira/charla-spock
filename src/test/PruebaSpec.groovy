package test

import spock.lang.Specification

/**
*  Created by Sofía on 08/05/2016.
*/

class PruebaSpec extends Specification {

    def "prueba"() {
        expect:
        Pruebilla.getVariable(a) == b

        where:
        a << ['1', '2']
        b << ['Valor1', 'Valo2']
    }

    static class Pruebilla {
        static String variable = 'Valor'

        public static String getVariable(String param) {
            variable + param
        }
    }
}
