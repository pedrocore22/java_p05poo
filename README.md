# Programación Orientada a Objetos

## Clases y Objetos

Las clases tienen dos objetivos fundamentales que son
la instancia de objetos (con unas características comunes)
y la modularización de código.

## Clases en Java

Se declaran con la sintaxis

modificadores class Identificador opciones {
    // miembros de la clase
    //    - Atributos (variables dentro de una clase)
    //    - Métodos (funciones dentro de una clase)
    //         - Constructores
}

- Identificador cumple las reglas Java y usa DoubleCamelCase
- Buena práctica que el identificador sea semántico

## Objetos en Java

Se declaran o instancian con la palabra new y el constructor

Clase identificador = new Clase(argumentos);

## Paquetes

Son una agrupación lógica de clases. En Java podemos modularizar el código mediante esta agrupación en la cual simplemente hay que añadir
al inicio de cada archivo la sintaxis:

package identificador; (convención de nombres)

Normalmente todos los archivos de un paquete estarán en un
mismo directorio del proyecto