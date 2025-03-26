# Proyecto MundoPc

Este proyecto simula la creación y gestión de computadoras, monitores, teclados y ratones utilizando un enfoque orientado a objetos en Java. En este ejemplo, creamos una computadora con un monitor, teclado y ratón de la marca "Lenovo" utilizando clases personalizadas.

## Características

- **Objetos**: Creación de objetos que representan periféricos de una computadora como **Raton**, **Teclado**, **Monitor**, y **Computadora**.
- **Impresión de detalles**: Al crear los objetos, se imprime información sobre cada uno de los periféricos y la computadora.

## Estructura del Proyecto

El proyecto tiene una estructura básica que incluye las siguientes clases:

- **Raton**: Representa un ratón, con atributos como tipo de conexión (por ejemplo, "bluetooth") y marca.
- **Teclado**: Representa un teclado, con atributos similares a los del ratón.
- **Monitor**: Representa un monitor con la marca y tamaño de pantalla.
- **Computadora**: Representa una computadora que combina un monitor, teclado y ratón.

### Clases

- **`Raton`**:
    - **Atributos**: Tipo de conexión (`bluetooth`, `USB`), marca.
    - **Métodos**: Método para obtener la representación del ratón.
  
- **`Teclado`**:
    - **Atributos**: Tipo de conexión (`bluetooth`, `USB`), marca.
    - **Métodos**: Método para obtener la representación del teclado.

- **`Monitor`**:
    - **Atributos**: Marca, tamaño de pantalla (en pulgadas).
    - **Métodos**: Método para obtener la representación del monitor.

- **`Computadora`**:
    - **Atributos**: Nombre de la computadora, objetos de tipo **Monitor**, **Teclado** y **Raton**.
    - **Métodos**: Método para obtener la representación de la computadora completa, que incluye los detalles de cada componente.

## Ejemplo de Uso

Aquí tienes un ejemplo de cómo se crean y utilizan los objetos en el programa:

```java
package MundoPc;

import modelo.Computadora;
import modelo.Monitor;
import modelo.Raton;
import modelo.Teclado;

public class Main {

    public static void main(String[] args) {
        
        // Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);
        
        // Crear un objeto de tipo Computadora
        Computadora computadoraLenovo = 
            new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);
    }
}

Salida esperada
La salida de este programa será algo similar a esto (dependiendo de cómo hayas implementado los métodos toString en cada clase):

Raton [conexión=bluetooth, marca=Lenovo]
Teclado [conexión=bluetooth, marca=Lenovo]
Monitor [marca=Lenovo, tamaño=27]
Computadora [nombre=Computadora Lenovo, monitor=Monitor [marca=Lenovo, tamaño=27], teclado=Teclado [conexión=bluetooth, marca=Lenovo], raton=Raton [conexión=bluetooth, marca=Lenovo]]
Dependencias
Este proyecto no requiere dependencias externas. Solo necesitas tener configurado un entorno de desarrollo Java.

Requisitos
JDK 8 o superior.

Instalación
Clona este repositorio a tu máquina local:
git clone https://github.com/tu_usuario/MundoPc.git

Abre el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA, Eclipse, NetBeans).

Asegúrate de tener el JDK 8 o superior instalado.

Ejecuta el archivo Main.java para ver el funcionamiento del programa.

Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún error o tienes sugerencias para mejorar el proyecto, por favor abre un issue o envía un pull request.

Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

Este archivo `README.md` explica las funcionalidades de tu proyecto, cómo se utilizan las clases y los objetos en el código, y proporciona ejemplos claros para que otros usuarios puedan entender rápidamente cómo funciona tu programa.
