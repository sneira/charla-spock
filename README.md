Ejemplo de JUnit
Nombre de la clase
Herencia e imports
Métodos de característica: ¿qué queremos probar? El nombre es un string.
Bloques: estímulo/respuesta
Bloque mínimo: expect (suma)
Transformar a setup/expect: el setup puede ser implícito, y puede llamarse given (historias de usuario)
Transformar a setup/when/then: explicar legibilidad, condiciones, when/then se pueden repetir
Explicar and como complemento del then
Bloque cleanup
¿Muchas llamadas para probar diferentes datos? Mejor data driven testing.
Tuberías de datos: proveedores de datos (colecciones, ficheros, consultas SQL...). Pueden ser multivariable.
Tablas de datos. Pipe doble como separación visual. Explicar iteraciones.
Tablas con una sola columna (multiplicación por 0)
Ejecución de los tests sin fallos
Ejecución con fallos: ¿cómo detectar el punto exacto? -> @Unroll, expresiones. % de similitud al comparar strings.
Otras extensiones útiles: Ignore, IgnoreRest, IgnoreIf, Requires. Documentación: Title, Narrative, Issue.
Control de excepciones: thrown, notThrown
Fixture methods: setup y cleanup (antes de cada método), setupSpec() y cleanupSpec() (al principio y al final)
Helper methdos: por ejemplo, si en un bloque then tenemos muchas condiciones
Propiedades: los cambios no se mantienen entre métodos ni entre iteraciones, a no ser que vayan con @Shared o sean static