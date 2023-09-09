# Java API

La API de Java (Application Programming Interface) es un conjunto de clases, interfaces y métodos predefinidos en el lenguaje de programación Java que se utilizan para desarrollar aplicaciones y programas. Es una biblioteca de software que proporciona una serie de herramientas para programar en Java de manera más sencilla y eficiente.

# Clase Math.

```java
Math.metodo

Math.sqrt(n): //raíz cuadrada de un número

Math.pow(base, exponente): //potencia de un número. Base y exponente son

Math.sin(ángulo). Math.cos(ángulo). Math.tan(ángulo). Math.atan(ángulo)

Math.round(decimal): //redondeo de un número.

Math.PI: //constante de clase con el número PI
```

Si queremos redondear un double a un int usamos

```java
int raiz = (int)Math.round(num1);
```

# String

## charAt

Obetenr la letra de un string

```java
variable_string.chartAt(indice);
nombre.charAt(1);
```

## Substring

El método substring en Java se utiliza para obtener una subcadena (porción de una cadena de texto).

```java
String str = "Ejemplo de texto";
String subStr = str.substring(3, 9); 
// El resultado es "mplo d"
```

```java
String str = "Ejemplo de texto";
String subStr = str.substring(7); 
// El resultado es "de texto"
```

## Equals

El método equals en Java se utiliza para comparar si dos objetos de tipo String son iguales en cuanto a su contenido (es decir, si tienen los mismos caracteres en el mismo orden)

```java
String str1 = "Hola";
String str2 = "Hola";
boolean result = str1.equals(str2); // El resultado es true
```

## Equals Ignore Case

También es posible utilizar el método equalsIgnoreCase para comparar si dos objetos de tipo String son iguales en cuanto a su contenido, pero sin tener en cuenta si los caracteres están en mayúsculas o minúsculas:

```java
String str1 = "Hola";
String str2 = "hola";

boolean result = str1.equalsIgnoreCase(str2); // El resultado es true
```

En resumen, el método equals se utiliza para comparar si dos objetos de tipo String son iguales en cuanto a su contenido, mientras que el método equalsIgnoreCase se utiliza para hacer la comparación sin tener en cuenta las mayúsculas y minúsculas.

# NUMEROS CON FORMATO

Poner la cantidad de decimales que queramos:  
"%1.CANTIDAD DE DECIMALES"

```java
System.out.printf("%1.2f", x/3);
```

# CLASE DE INTERFACES Y VENTANAS DE DIALOGO --

**JOptionPane**

```
String nombreUsuario = JOptionPane.showInputDialog("Introduce nombre");
```

# Indices aleatorios

```java
String paises [] = new String [8];
       String paisesEnElMundo [] = {"Colombia", "Ecuador", "Mexico", "Venezuela", "Peru", "Chile", "Argentina"};
       Random seed = new Random();
       
       for (int i = 0; i < paises.length; i++){
           int indice = seed.nextInt(paisesEnElMundo.length);
           paises[i] = paisesEnElMundo[indice];
       }
```

# ForEach

```java
for (tipo nombreVariable: array) {

}
```

# Polimorfismo

Un ejemplo de polimorfismo podría ser guardar un objeto de una clase hija en un array de objetos tipo clase padre.  
El polimorfismo en Java es la capacidad de objetos de diferentes clases de responder al mismo mensaje o método de una manera que tenga sentido para cada objeto en particular. Esto se logra mediante la herencia y la implementación de interfaces en Java.

Hay dos tipos de polimorfismo en Java:

Polimorfismo de tiempo de compilación (compile-time polymorphism): Este tipo de polimorfismo se logra a través de la sobrecarga de métodos, donde se tienen varios métodos con el mismo nombre pero diferentes parámetros en una clase. El compilador de Java selecciona el método adecuado para ser llamado según los argumentos pasados en la llamada del método.

Polimorfismo de tiempo de ejecución (runtime polymorphism): Este tipo de polimorfismo se logra a través de la herencia y la implementación de interfaces. Se puede crear una referencia de una clase padre o de una interfaz, y asignar un objeto de cualquiera de sus subclases o implementaciones respectivamente. Luego, se puede llamar a un método en la referencia, y el método que se ejecutará dependerá del objeto real al que se haya asignado la referencia.

Por ejemplo, si tenemos una clase "Animal" y dos subclases "Perro" y "Gato", y ambas subclases tienen un método "hacerSonido", podemos crear una referencia de la clase "Animal" y asignarle un objeto de la subclase "Perro" o "Gato". Luego, al llamar al método "hacerSonido" en la referencia, el método que se ejecutará dependerá del objeto real al que se haya asignado la referencia.

# Refundición (Casting)

## Primitivos

`int num = (int) numDouble;`

## Objetos

```java
Tipo nombreObjeto = (Tipo) variableClasePadre;
```

# Detener herencia

Cuando se quiere finalizar la herencia de una clase o método se usa **final** haciendo imposible su sobre escritura

# Abstract

`abstract`

En Java, "abstracto" se utiliza para definir una clase o método que no se puede instanciar directamente. Una clase abstracta se utiliza como una plantilla para crear subclases que implementan los métodos abstractos y añaden funcionalidad adicional. Un método abstracto es un método sin implementación que se define en una clase abstracta y se espera que las subclases lo implementen con su propia lógica. La palabra clave "abstract" se utiliza para declarar una clase o método como abstracto en Java.

```java
public abstract class Figura {
   public abstract double calcularArea();
}
```

# Modificadores de acceso

En Java, existen cuatro modificadores de acceso que se utilizan para controlar el acceso a clases, métodos y variables. Estos son:

**public**: este modificador de acceso permite que la clase, método o variable sea accesible desde cualquier parte del programa, ya sea desde el mismo paquete o desde otros paquetes.

**private**: este modificador de acceso hace que la clase, método o variable solo sea accesible desde dentro de la propia clase en la que se define. Los miembros privados no son accesibles desde otras clases, incluso si esas clases están en el mismo paquete que la clase que los define.

**protected**: este modificador de acceso hace que la clase, método o variable sea accesible desde dentro de la propia clase en la que se define y desde cualquier subclase que herede de esa clase. Los miembros protegidos no son accesibles desde fuera del paquete en el que se define la clase, a menos que la clase que los utiliza sea una subclase de la clase que los define.

**default** o sin modificador: si una clase, método o variable no tiene ningún modificador de acceso especificado, se considera que tiene un modificador de acceso "predeterminado" o "paquete". Esto significa que la clase, método o variable es accesible solo desde dentro del mismo paquete en el que se define. Los miembros con acceso predeterminado no son accesibles desde fuera del paquete en el que se definen.

Es importante tener en cuenta que estos modificadores de acceso se utilizan para controlar el acceso a clases, métodos y variables en tiempo de compilación. En tiempo de ejecución, el acceso a estos miembros puede verse afectado por otros factores, como el alcance de las variables o la herencia de las clases.

# ENUM

En Java, un "enum" es un tipo de datos especial que permite definir un conjunto fijo de constantes con nombres descriptivos. Cada constante del enum es un objeto que tiene un nombre y un valor fijo que no puede ser cambiado durante la ejecución del programa.

Para definir un enum en Java, se utiliza la palabra clave "enum", seguida del nombre del enum y una lista de constantes entre llaves:

```arduino
    enum DiasSemana {
      LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
```

Una vez que se ha definido un enum, se puede utilizar en el código como cualquier otro tipo de datos. Por ejemplo, se puede declarar una variable con el tipo de datos del enum y asignarle uno de los valores constantes:

```java
DiasSemana dia = DiasSemana.MARTES;
```

También se puede utilizar un switch para realizar diferentes acciones según el valor de la constante del enum:

```arduino
switch (dia) {
  case LUNES:
    // hacer algo si es lunes
    break;
  case MARTES:
    // hacer algo si es martes
    break;
  // otros casos
}
```

El uso de enum en Java ayuda a mejorar la legibilidad del código, ya que permite utilizar nombres descriptivos en lugar de números o cadenas de texto para representar valores fijos y constantes en el programa. Además, evita errores en el código al limitar las opciones a un conjunto fijo de valores bien definidos.

# Interfaces

En Java, una interfaz es una colección de métodos abstractos (métodos sin implementación) y constantes (variables final estáticas) que se definen sin proporcionar una implementación. Las interfaces se utilizan para definir un contrato o un conjunto de métodos que una clase debe implementar para cumplir con un determinado comportamiento.

Para utilizar una interfaz en Java, se debe seguir los siguientes pasos:

Definir la interfaz utilizando la palabra clave "**interface**":

```java
public interface MiInterfaz {
    void metodo1();
    int metodo2(String parametro);
    final int CONSTANTE = 10;
}
```

Implementar la interfaz en una clase utilizando la palabra clave "implements". La clase que implementa la interfaz debe proporcionar una implementación para todos los métodos definidos en la interfaz:

```java
public class MiClase implements MiInterfaz {
    @Override
    public void metodo1() {
        // Implementación del método 1
    }

    @Override
    public int metodo2(String parametro) {
        // Implementación del método 2
        return 0;
    }
}
```

Crear un objeto de la clase que implementa la interfaz y llamar a los métodos definidos en la interfaz utilizando la referencia de la interfaz:

```java
MiInterfaz miObjeto = new MiClase();
miObjeto.metodo1();
int resultado = miObjeto.metodo2("parametro");
```

En este ejemplo, se crea un objeto de la clase "MiClase" que implementa la interfaz "MiInterfaz". Luego, se llama a los métodos "metodo1" y "metodo2" utilizando la referencia de la interfaz "MiInterfaz".

En resumen, una interfaz en Java es una colección de métodos abstractos y constantes que se utilizan para definir un contrato o un conjunto de métodos que una clase debe implementar para cumplir con un determinado comportamiento. Para utilizar una interfaz, se debe implementar en una clase y proporcionar una implementación para todos los métodos definidos en la interfaz. Luego, se puede crear un objeto de la clase que implementa la interfaz y llamar a los métodos definidos en la interfaz utilizando la referencia de la interfaz.

# Ordenar arrays

Usamos la clase **Arrays** *[API](https://docs.oracle.com/javase/7/docs/api/)*

En Java, la clase Arrays proporciona varios métodos para manipular arreglos, incluyendo el método "sort" para ordenar los elementos de un arreglo. El método "sort" utiliza el algoritmo de ordenamiento quicksort para ordenar los elementos del arreglo en orden ascendente.

Para utilizar el método "sort" de la clase Arrays para ordenar un arreglo, se puede hacer lo siguiente:

## Tipos primitivos

Declarar e inicializar un arreglo de elementos del tipo que se desea ordenar. Por ejemplo:

```
int[] numeros = {5, 2, 7, 1, 9};
```

Llamar al método "sort" de la clase Arrays y pasarle como argumento el arreglo que se desea ordenar:

```
Arrays.sort(numeros);
```

Después de la llamada al método "sort", el arreglo estará ordenado en orden ascendente:

```arduino
System.out.println(Arrays.toString(numeros)); // Imprime [1, 2, 5, 7, 9]
```

Es importante destacar que el método "sort" de la clase Arrays ordena los elementos del arreglo en su lugar, es decir, modifica el arreglo original. Si se desea mantener el arreglo original sin cambios y obtener una copia ordenada, se puede crear una copia del arreglo y luego llamar al método "sort" en la copia:

```scss
int[] numeros = {5, 2, 7, 1, 9};
int[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
Arrays.sort(numerosOrdenados);
```

En este ejemplo, se crea una copia del arreglo original "numeros" utilizando el método "copyOf" de la clase Arrays, y luego se llama al método "sort" en la copia "numerosOrdenados". De esta forma, el arreglo original "numeros" se mantiene sin cambios, y la copia "numerosOrdenados" contiene los mismos elementos ordenados en orden ascendente.

## Objetos

El método "sort" de la clase Arrays también se puede utilizar para ordenar arreglos de objetos en Java. Para hacer esto, se debe implementar la interfaz "Comparable" en la clase de los objetos que se desea ordenar. La interfaz "Comparable" define un método "compareTo" que se utiliza para comparar dos objetos y determinar su orden relativo.

Por ejemplo, supongamos que se tiene una clase "Persona" con dos atributos: "nombre" y "edad". Para ordenar un arreglo de objetos de tipo "Persona" en orden ascendente por edad, se debe implementar la interfaz "Comparable" en la clase "Persona" de la siguiente manera:

```arduino
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.edad, otraPersona.getEdad());
    }
}
```

En este ejemplo, se implementa la interfaz `"Comparable<Persona>"` en la clase "Persona" y se define el método "compareTo" que compara dos objetos de tipo "Persona" por su edad.

Para ordenar un arreglo de objetos de tipo "Persona" utilizando el método "sort" de la clase Arrays, se puede hacer lo siguiente:

Declarar e inicializar un arreglo de objetos de tipo "Persona". Por ejemplo:

```scss
Persona[] personas = {
        new Persona("Juan", 25),
        new Persona("Maria", 32),
        new Persona("Pedro", 19),
        new Persona("Luisa", 45),
        new Persona("Jorge", 28)
};
```

Llamar al método "sort" de la clase Arrays y pasarle como argumento el arreglo que se desea ordenar:

```bash
Arrays.sort(personas);
```

Después de la llamada al método "sort", el arreglo estará ordenado en orden ascendente por edad:

```java
for (Persona persona : personas) {
    System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
}
```

Lo que deberia imprimir

```bash
Pedro tiene 19 años.
Juan tiene 25 años.
Jorge tiene 28 años.
Maria tiene 32 años.
Luisa tiene 45 años.
```

En resumen, para ordenar un arreglo de objetos en Java utilizando el método "sort" de la clase Arrays, se debe implementar la interfaz "Comparable" en la clase de los objetos y definir el método "compareTo" para comparar los objetos según el criterio de ordenamiento deseado. Luego, se puede llamar al método "sort" de la clase Arrays para ordenar el arreglo.

# Instanceof

En Java, el operador "instanceof" se utiliza para comprobar si un objeto es una instancia de una determinada clase o de una subclase de esa clase. El operador "instanceof" devuelve un valor booleano (verdadero o falso) y se utiliza en una expresión condicional.

La sintaxis básica del operador "instanceof" es la siguiente:

```java
objeto instanceof Clase
```

Donde "objeto" es el objeto que se quiere comprobar y "Clase" es la clase o interfaz que se quiere comprobar. El operador "instanceof" devuelve "true" si el objeto es una instancia de la clase o de una subclase de esa clase, y devuelve "false" en caso contrario.

Por ejemplo, supongamos que tenemos una clase "Animal" y dos subclases "Perro" y "Gato":

```java
public class Animal {
    // Código de la clase Animal
}

public class Perro extends Animal {
    // Código de la clase Perro
}

public class Gato extends Animal {
    // Código de la clase Gato
}
```

Para comprobar si un objeto es una instancia de la clase "Perro" o de la clase "Gato", se puede utilizar el operador "instanceof" de la siguiente manera:

```
Animal animal1 = new Perro();
Animal animal2 = new Gato();

if (animal1 instanceof Perro) {
    System.out.println("El animal1 es un perro");
}

if (animal2 instanceof Gato) {
    System.out.println("El animal2 es un gato");
}
```

En este ejemplo, se crea un objeto "animal1" de la clase "Perro" y un objeto "animal2" de la clase "Gato". Luego, se utiliza el operador "instanceof" para comprobar si "animal1" es una instancia de la clase "Perro" y si "animal2" es una instancia de la clase "Gato". En ambos casos, el resultado de la expresión condicional es "true" y se imprime un mensaje por pantalla.

En resumen, el operador "instanceof" se utiliza en Java para comprobar si un objeto es una instancia de una determinada clase o de una subclase de esa clase. El operador devuelve un valor booleano y se utiliza en una expresión condicional.

# Crear Temporizador

## Class Timer de javax.swing

```java
public class PruebaTemportizador {
    public static void main(String [] args) {
        DameLaHora oyente = new DameLaHora();
        Timer mitemporizador = new Timer(5000, oyente);
        mitemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
    }
}

class DameLaHora implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("La hora es " + ahora);
    }
}
```

# Toolkit

# Clases internas

## Ventajas

- Para acceder a los campos privados de una clase desde otra clase.
- Para ocultar o encapsular una clase de otra pertenecientes al mismo paquete.
- Para crear clases internas "anonimas", muy utiles para gestionar eventos y retrollamadas
- Cuando solo una clase debe acceder a los campos de ejemplar

Las clases internas en Java son clases definidas dentro de otra clase. Pueden ser de varios tipos, como clases anónimas, locales, estáticas o miembro. Las clases internas pueden acceder a los campos y métodos privados de la clase externa y también pueden ser utilizadas para encapsular la funcionalidad relacionada en una sola unidad. Las clases internas se utilizan comúnmente en el desarrollo de aplicaciones Java para mejorar la modularidad, la seguridad y la eficiencia del código.

## Clases internas locales

### ¿Que son?

Una clase dentro de un método

- Son utiles cuando solo se va a utilizar (instanciar) la clase interna una vez. El objetivo es simplificar aún más el código.
- Su ámbito queda restringido al metodo donde son declaradas, es decir, no pueden ser utilizadas fuera del método, lo que las hace estar "muy encapsuladas".
- No pueden tener modificadores de acceso

# Interfaces gráficas

Java 1.0 usa solo las interfaces graficas del paquete **java.awt**, mientras que desde la version Java 1.2 se implemento la clase **javax.swing**.

## Paquete java.awt

Permitia hacer las UI basadas en la interfaz del sistema operativo.

## Paquete javax.swing

Permite hacer las UI creadas en una ventana, lo que comprende más personalización y menos problemas. Entre sus funciones hereda de la clase **Frame** del paquete **java.awt** conviertiendola en **JFrame**.

### Ventanas

*Una ventana puede llamarse marco/frame*

- Nacen invisibles. Se necesita el método setVisible para hacerlos visibles.
- Nacen con un tamaño inútil (0px\*0px). Se necesita el método setSize para darles tamaño.
- Conviene decir qué debe hacer el programa si se cierra un frame.

# Swing en Java

Swing es una biblioteca de componentes gráficos para la creación de interfaces de usuario en Java. Estos componentes son objetos que se pueden agregar a un contenedor para crear una ventana de la aplicación.

## Componentes en Swing

Los componentes principales de Swing son:

- `JFrame`: ventana principal.
- `JPanel`: panel de contenido.
- `JButton`: botón.
- `JLabel`: etiqueta.
- `JTextField`: campo de texto.
- `JCheckBox`: casilla de verificación.

Además, Swing también incluye componentes más avanzados para crear interfaces de usuario complejas, como `JTable` (tabla de datos), `JTree` (árbol de jerarquías) y `JFileChooser` (selector de archivos).

## Crear componentes en Swing

Para crear un componente en Swing, se instancia una clase que representa al componente y se configuran sus propiedades. Por ejemplo, para crear un botón, se instancia la clase `JButton` y se establece su texto y tamaño:

```java
JButton btn = new JButton("Click me!");
btn.setPreferredSize(new Dimension(100, 50));
```

## Organización de componentes

Los componentes se organizan en un árbol de contenedores, donde cada contenedor puede tener cero o más componentes. El contenedor principal en Swing es `JFrame`.

```java
JFrame frame = new JFrame("Mi aplicación");
frame.setSize(800, 600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel = new JPanel();
frame.add(panel);

JButton btn = new JButton("Click me!");
panel.add(btn);

frame.setVisible(true);
```

## Eventos en Swing

Los eventos en Swing son acciones que ocurren en los componentes, como hacer clic en un botón o escribir en un campo de texto. Para manejar eventos, se registran controladores de eventos en los componentes.

Los controladores de eventos son métodos que se llaman automáticamente cuando ocurre un evento en un componente. Para registrar un controlador de eventos, se utiliza el método `addActionListener()` en el componente.

```java
JButton btn = new JButton("Click me!");
btn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
});
```

## Estilos en Swing

Swing también proporciona herramientas para dar estilo a los componentes, como establecer el color de fondo o el tipo de letra. Estos estilos se establecen a través de objetos de la clase `javax.swing.UIManager`.

```java
UIManager.put("Button.background", Color.BLUE);
UIManager.put("Button.font", new Font("Arial", Font.BOLD, 14));
```

## Conclusiones

En general, Swing es una biblioteca muy poderosa para la creación de interfaces de usuario en Java, y el curso de Píldoras Informáticas es una excelente manera de aprender sus fundamentos y comenzar a crear aplicaciones gráficas en Java. Espero que estos apuntes te hayan sido de utilidad.

# Resumen swing

Swing es una biblioteca de componentes gráficos de usuario (GUI) para Java. Esta biblioteca permite crear interfaces gráficas de usuario de manera sencilla y efectiva en Java. Los componentes gráficos de Swing se pueden personalizar y son altamente flexibles.

Para utilizar Swing en Java, se debe seguir los siguientes pasos:

1.  Importar las clases de Swing al programa con la instrucción import javax.swing.\*;
2.  Crear un contenedor principal para los componentes Swing, generalmente un objeto JFrame o JPanel.
3.  Agregar componentes Swing al contenedor principal mediante métodos como add() o setLayout().
4.  Personalizar los componentes Swing utilizando métodos como setPreferredSize() o setBackground().

Por ejemplo, para crear una ventana simple con un botón en Swing:

```java
import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Mi ventana Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creación de un botón y configuración
        JButton boton = new JButton("Haz clic aquí");
        boton.setPreferredSize(new Dimension(100, 50));
        
        // Agregar el botón al contenedor principal
        add(boton);
        
        // Configuración final de la ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Crear una instancia de la ventana
        new Ventana();
    }
}
```

En este ejemplo, se crea una clase Ventana que extiende JFrame para crear una ventana principal. Se crea un botón y se agrega a la ventana principal mediante el método add(). Finalmente, se configura la ventana y se hace visible.

En resumen, Swing es una biblioteca de componentes gráficos de usuario para Java que permite crear interfaces gráficas de usuario de manera sencilla y efectiva. Se pueden personalizar y son altamente flexibles. Para utilizar Swing, se deben seguir los pasos de importar las clases, crear un contenedor principal, agregar componentes y personalizarlos.

# Eventos de ventana

El evento WindowListener en Java se utiliza para manejar eventos de ventana, como abrir o cerrar una ventana. Aquí hay un ejemplo de cómo usar WindowListener en Java:

```java
import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample extends Frame implements WindowListener {
    
    public WindowListenerExample() {
        super("Window Listener Example");
        addWindowListener(this);
        setSize(400, 400);
        setVisible(true);
    }
    
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }
    
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
        System.exit(0);
    }
    
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }
    
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }
    
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }
    
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
    
    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
```

En este ejemplo, hemos creado una clase `WindowListenerExample` que extiende `Frame` e implementa la interfaz `WindowListener`. La clase `WindowListenerExample` tiene varios métodos para manejar eventos de ventana, como `windowOpened`, `windowClosing`, `windowClosed`, `windowIconified`, `windowDeiconified`, `windowActivated` y `windowDeactivated`.

En el constructor de la clase `WindowListenerExample`, agregamos el `WindowListener` actual a la ventana mediante el método `addWindowListener(this)`. Luego, definimos el tamaño de la ventana y la hacemos visible.

Cuando ejecutamos la clase `WindowListenerExample`, podemos ver los mensajes de registro que se imprimen en la consola cada vez que se produce un evento de ventana, como abrir, cerrar, minimizar, maximizar, etc.

# Clases adaptadoras para eventos

- KeyAdapter
- WindowsAdapter
- MouseAdapter

## Eventos de estado de ventana

- WindowStateListener
    - método windowStateChanged (WindowEvent)

# Eventos del teclado

## keyListener (i)

**keyPressed**(keyEvent e)

La interfaz `KeyListener` en Java se utiliza para recibir eventos del teclado. Esta interfaz define tres métodos que deben ser implementados por cualquier clase que desee recibir eventos del teclado:

- `keyPressed(KeyEvent e)`: Este método se llama cuando se presiona una tecla en el componente asociado con el KeyListener.
- `keyReleased(KeyEvent e)`: Este método se llama cuando se suelta una tecla en el componente asociado con el KeyListener.
- `keyTyped(KeyEvent e)`: Este método se llama cuando se presiona y suelta una tecla en el componente asociado con el KeyListener.

Para utilizar la interfaz KeyListener, una clase debe implementar estos métodos y registrar un objeto de esa clase como un oyente de eventos del teclado en un componente utilizando el método `addKeyListener`.

# Eventos del mouse

La interfaz `MouseListener` en Java se utiliza para recibir eventos del ratón. Esta interfaz define cinco métodos que deben ser implementados por cualquier clase que desee recibir eventos del ratón:

- `mouseClicked(MouseEvent e)`: Este método se llama cuando se hace clic en el componente asociado con el MouseListener.
- `mouseEntered(MouseEvent e)`: Este método se llama cuando el cursor del ratón entra en el componente asociado con el MouseListener.
- `mouseExited(MouseEvent e)`: Este método se llama cuando el cursor del ratón sale del componente asociado con el MouseListener.
- `mousePressed(MouseEvent e)`: Este método se llama cuando se presiona un botón del ratón sobre el componente asociado con el MouseListener.
- `mouseReleased(MouseEvent e)`: Este método se llama cuando se suelta un botón del ratón sobre el componente asociado con el MouseListener.

Para utilizar la interfaz MouseListener, una clase debe implementar estos métodos y registrar un objeto de esa clase como un oyente de eventos del ratón en un componente utilizando el método `addMouseListener`.

# Eventos de foco de ventana

La interfaz `FocusListener` se utiliza para recibir eventos de enfoque de teclado en un componente. La clase que está interesada en procesar un evento de enfoque implementa esta interfaz o extiende la clase abstracta `FocusAdapter` (sobrescribiendo solo los métodos de interés). El objeto de escucha creado a partir de esa clase se registra con un componente utilizando el método `addFocusListener` del componente.

Aquí hay un ejemplo de cómo usar `FocusListener` en Java:

```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusListenerExample extends JFrame implements FocusListener {
    JTextField textField1, textField2;

    public FocusListenerExample() {
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);
        textField2 = new JTextField(10);
        add(textField2);

        textField1.addFocusListener(this);
        textField2.addFocusListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        if (e.getSource() == textField1) {
            System.out.println("textField1 gained focus.");
        } else if (e.getSource() == textField2) {
            System.out.println("textField2 gained focus.");
        }
    }

    public void focusLost(FocusEvent e) {
        if (e.getSource() == textField1) {
            System.out.println("textField1 lost focus.");
        } else if (e.getSource() == textField2) {
            System.out.println("textField2 lost focus.");
        }
    }

    public static void main(String[] args) {
        new FocusListenerExample();
    }
}
```

# Layouts

- FlowLayout
- BorderLayout
- GridLayout

Un layout en Java Swing es un esquema de interfaz de usuario que tiene opciones para crear aplicaciones con diferentes diseños. Java Swing usa LayoutManagers para colocar los componentes de la interfaz de usuario en la pantalla. Los LayoutManagers son objetos que controlan el tamaño y la posición de los componentes en un contenedor. Hay varios tipos de LayoutManagers disponibles en Java Swing, cada uno con sus propias características y ventajas.

Por ejemplo, el gestor de diseño BorderLayout divide el contenedor en cinco áreas: norte, sur, este, oeste y centro. Cada área puede contener un solo componente. El gestor de diseño FlowLayout coloca los componentes en una fila horizontal o vertical. El gestor de diseño GridLayout organiza los componentes en una cuadrícula.

Aquí hay un ejemplo simple que muestra cómo usar BorderLayout para colocar dos botones en una ventana:

```java
import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
   public static void main(String[] args) {
      JFrame frame = new JFrame("BorderLayout Example");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 200);

      JButton button1 = new JButton("North");
      JButton button2 = new JButton("South");

      frame.getContentPane().add(button1, BorderLayout.NORTH);
      frame.getContentPane().add(button2, BorderLayout.SOUTH);

      frame.setVisible(true);
   }
}
```

# Cuadros de texto y areas de texto

[Los cuadros de texto y las áreas de texto son componentes de la interfaz gráfica de usuario (GUI) en Java Swing que permiten al usuario introducir o mostrar texto](https://guru99.es/java-swing-gui/)[<sup>1</sup>](https://guru99.es/java-swing-gui/). La diferencia entre ellos es que los cuadros de texto son de una sola línea y las áreas de texto pueden tener varias líneas.

Para usarlos, se deben seguir estos pasos:

- Importar el paquete javax.swing.\* que contiene las clases necesarias para crear componentes de GUI.
- Crear un objeto de la clase JFrame que representa la ventana principal de la aplicación.
- Crear objetos de las clases JTextField y JTextArea que representan los cuadros y áreas de texto respectivamente. Se puede especificar el número de columnas o filas que tendrán como parámetro del constructor.
- Añadir los objetos creados al panel de contenido del objeto JFrame usando el método add().
- Establecer el tamaño y el comportamiento de cierre del objeto JFrame usando los métodos setSize() y setDefaultCloseOperation().
- Hacer visible el objeto JFrame usando el método setVisible().

```java
import javax.swing.*;

class Ejemplo {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Ejemplo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);

        // Crear el cuadro de texto
        JTextField cuadro = new JTextField(10);
        cuadro.setText("Escribe algo");

        // Crear el área de texto
        JTextArea area = new JTextArea(5, 20);
        area.setText("Aquí se mostrará lo que escribas");

        // Añadir los componentes al panel de contenido
        ventana.getContentPane().add(cuadro);
        ventana.getContentPane().add(area);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
```

## Objetos tipo Document

[Los objetos Document son modelos de datos que representan el contenido de los componentes de texto en Swing, como los cuadros y áreas de texto](https://guru99.es/java-swing-gui/)[<sup>1</sup>](https://guru99.es/java-swing-gui/). Los objetos Document permiten manipular el texto de forma independiente de la presentación y el comportamiento del componente.

Para usarlos en eventos, se pueden seguir estos pasos:

- Obtener el objeto Document asociado al componente de texto usando el método getDocument().
- Añadir un objeto que implemente la interfaz DocumentListener al objeto Document usando el método addDocumentListener(). El objeto debe definir los métodos insertUpdate(), removeUpdate() y changedUpdate() que se ejecutarán cuando se modifique el texto.
- Dentro de los métodos del objeto DocumentListener, se puede acceder al objeto Document usando el parámetro DocumentEvent que reciben. El objeto DocumentEvent contiene información sobre el cambio ocurrido en el texto.
- Usar los métodos del objeto Document para obtener o modificar el texto según se desee. Por ejemplo, se puede usar el método getLength() para obtener la longitud del texto o el método insertString() para insertar una cadena en una posición determinada.

```java
import javax.swing.*;
import javax.swing.event.*;

class Ejemplo {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Ejemplo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);

        // Crear el cuadro de texto
        JTextField cuadro = new JTextField(10);
        cuadro.setText("Escribe algo");

        // Obtener el objeto Document asociado al cuadro de texto
        Document documento = cuadro.getDocument();

        // Añadir un objeto que implemente la interfaz DocumentListener al objeto Document
        documento.addDocumentListener(new MiDocumentListener());

        // Añadir el componente al panel de contenido
        ventana.getContentPane().add(cuadro);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}

// Clase que implementa la interfaz DocumentListener
class MiDocumentListener implements DocumentListener {
    // Método que se ejecuta cuando se inserta texto
    public void insertUpdate(DocumentEvent e) {
        // Obtener el objeto Document que generó el evento
        Document documento = e.getDocument();
        // Mostrar un mensaje con la longitud del texto
        System.out.println("Se insertó texto. Longitud: " + documento.getLength());
    }

    // Método que se ejecuta cuando se elimina texto
    public void removeUpdate(DocumentEvent e) {
        // Obtener el objeto Document que generó el evento
        Document documento = e.getDocument();
        // Mostrar un mensaje con la longitud del texto
        System.out.println("Se eliminó texto. Longitud: " + documento.getLength());
    }

    // Método que se ejecuta cuando se cambia algún atributo del texto
    public void changedUpdate(DocumentEvent e) {
        // No se usa en este ejemplo
    }
}
```

# CheckBox

- Un checkbox es un componente gráfico que permite al usuario seleccionar o deseleccionar una opción. Se puede usar en una interfaz gráfica de usuario (GUI) o en una aplicación web.
- Para usar un checkbox en Java se necesita importar la clase `javax.swing.JCheckBox` o la clase `java.awt.Checkbox` dependiendo del tipo de interfaz que se esté usando. También se puede usar la clase `javax.swing.JToggleButton` con el método `setSelectedIcon()` para crear un checkbox personalizado.
- Los constructores más comunes de la clase `JCheckBox` son:
    - `JCheckBox()`: crea un checkbox sin texto ni imagen.
    - `JCheckBox(String text)`: crea un checkbox con el texto especificado.
    - `JCheckBox(String text, boolean selected)`: crea un checkbox con el texto especificado y el estado inicial seleccionado o no según el valor del parámetro booleano.
    - `JCheckBox(String text, Icon icon)`: crea un checkbox con el texto y la imagen especificados.
    - `JCheckBox(String text, Icon icon, boolean selected)`: crea un checkbox con el texto, la imagen y el estado inicial especificados.
- Los constructores de la clase `Checkbox` son similares pero sin el parámetro de la imagen. Además, se puede especificar el grupo al que pertenece el checkbox con el parámetro `CheckboxGroup group`.
- Para agregar un checkbox a una interfaz se usa el método `add()` del contenedor donde se quiere colocar, por ejemplo un panel o un marco. Para obtener o modificar el estado de un checkbox se usan los métodos `isSelected()` y `setSelected(boolean b)` de la clase `JCheckBox` o los métodos `getState()` y `setState(boolean state)` de la clase `Checkbox`.
- Para añadir una acción al checkbox se puede implementar la interfaz `ActionListener` y registrarla con el método `addActionListener(ActionListener l)` de la clase `JCheckBox` o el método `addItemListener(ItemListener l)` de la clase `Checkbox`. El método `actionPerformed(ActionEvent e)` o el método `itemStateChanged(ItemEvent e)` se ejecutará cuando el usuario cambie el estado del checkbox.

```java
// Importar las clases necesarias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Crear una clase que extienda de JFrame e implemente ActionListener
public class EjemploCheckbox extends JFrame implements ActionListener {

  // Declarar los componentes
  private JCheckBox cb1, cb2;
  private JLabel lb1;

  // Crear el constructor
  public EjemploCheckbox() {
    // Inicializar los componentes
    cb1 = new JCheckBox("Opción 1");
    cb2 = new JCheckBox("Opción 2", true);
    lb1 = new JLabel("Selecciona una opción");

    // Agregar los componentes al marco
    this.setLayout(new FlowLayout());
    this.add(lb1);
    this.add(cb1);
    this.add(cb2);

    // Registrar los listeners
    cb1.addActionListener(this);
    cb2.addActionListener(this);

    // Configurar el marco
    this.setTitle("Ejemplo de checkbox");
    this.setSize(300, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  // Sobreescribir el método actionPerformed
  public void actionPerformed(ActionEvent e) {
    // Obtener la fuente del evento
    Object source = e.getSource();

    // Comprobar qué checkbox ha cambiado de estado
    if (source == cb1) {
      // Mostrar un mensaje con el estado del checkbox 1
      JOptionPane.showMessageDialog(this, "El estado del checkbox 1 es: " + cb1.isSelected());
    } else if (source == cb2) {
      // Mostrar un mensaje con el estado del checkbox 2
      JOptionPane.showMessageDialog(this, "El estado del checkbox 2 es: " + cb2.isSelected());
    }
  }

  // Crear el método main para ejecutar la aplicación
  public static void main(String[] args) {
    // Crear una instancia de la clase EjemploCheckbox
    EjemploCheckbox ec = new EjemploCheckbox();
  }
}

```

# Botones de radio

Los botones de radio son componentes gráficos que permiten seleccionar una opción entre varias. Para usarlos, necesitas lo siguiente:

- Crear un objeto de la clase JRadioButton para cada opción que quieras mostrar. Puedes asignarle un texto, un icono y un estado inicial (seleccionado o no).
- Agrupar los botones de radio en un objeto de la clase ButtonGroup. Esto hace que solo se pueda seleccionar uno a la vez.
- Añadir los botones de radio a un contenedor, como un JPanel o un JFrame. Puedes usar un administrador de diseño para organizarlos como quieras.
- Añadir un escuchador de eventos a cada botón de radio, usando el método addActionListener. Esto te permite ejecutar una acción cuando el usuario selecciona una opción.

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploRadioButton extends JFrame implements ActionListener {

    // Creamos los botones de radio
    JRadioButton rbRojo = new JRadioButton("Rojo", true); // El primero está seleccionado por defecto
    JRadioButton rbVerde = new JRadioButton("Verde");
    JRadioButton rbAzul = new JRadioButton("Azul");

    // Creamos el grupo de botones
    ButtonGroup bgColores = new ButtonGroup();

    // Creamos una etiqueta para mostrar el mensaje
    JLabel lblMensaje = new JLabel("Has elegido el color rojo");

    public EjemploRadioButton() {
        // Configuramos la ventana
        setTitle("Ejemplo de botones de radio");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Añadimos los botones al grupo
        bgColores.add(rbRojo);
        bgColores.add(rbVerde);
        bgColores.add(rbAzul);

        // Añadimos los escuchadores a los botones
        rbRojo.addActionListener(this);
        rbVerde.addActionListener(this);
        rbAzul.addActionListener(this);

        // Creamos un panel para los botones
        JPanel pnlBotones = new JPanel();
        pnlBotones.setLayout(new GridLayout(3, 1)); // Usamos un diseño en rejilla
        pnlBotones.add(rbRojo);
        pnlBotones.add(rbVerde);
        pnlBotones.add(rbAzul);

        // Añadimos el panel y la etiqueta a la ventana
        add(pnlBotones, BorderLayout.WEST); // El panel va a la izquierda
        add(lblMensaje, BorderLayout.CENTER); // La etiqueta va al centro

        // Hacemos visible la ventana
        setVisible(true);
    }

    // Este método se ejecuta cuando se selecciona un botón
    public void actionPerformed(ActionEvent e) {
        // Obtenemos el botón que ha generado el evento
        JRadioButton rb = (JRadioButton) e.getSource();
        // Obtenemos el texto del botón
        String color = rb.getText();
        // Mostramos el mensaje correspondiente
        lblMensaje.setText("Has elegido el color " + color);
    }

    public static void main(String[] args) {
        // Creamos una instancia de la clase
        new EjemploRadioButton();
    }
}
```

# JSlider

[Un JSlider es un componente que te permite seleccionar un valor numérico dentro de un rango mínimo y máximo deslizando un botón](https://docs.oracle.com/javase/8/docs/api/javax/swing/JSlider.html)[<sup>1</sup>](https://docs.oracle.com/javase/8/docs/api/javax/swing/JSlider.html). [Puedes usarlo para controlar la velocidad de una animación, el volumen de un sonido o cualquier otro parámetro que requiera ajuste fino](https://docs.oracle.com/javase/tutorial/uiswing/components/slider.html)[<sup>2</sup>](https://docs.oracle.com/javase/tutorial/uiswing/components/slider.html).

Para crear un JSlider necesitas especificar su orientación (horizontal o vertical), su valor mínimo, máximo e inicial. Por ejemplo:

```java
JSlider slider = new JSlider (JSlider.HORIZONTAL, 0, 100, 50); 
```

Copiar

Este código crea un slider horizontal con valores entre 0 y 100 y un valor inicial de 50.

[También puedes usar otros constructores que solo requieren la orientación o el rango de valores](https://docs.oracle.com/javase/8/docs/api/javax/swing/JSlider.html)[<sup>1</sup>](https://docs.oracle.com/javase/8/docs/api/javax/swing/JSlider.html).

Para personalizar el aspecto del slider puedes usar varios métodos, como:

- setMajorTickSpacing(int n): establece el espacio entre las marcas principales del slider.
- setMinorTickSpacing(int n): establece el espacio entre las marcas secundarias del slider.
- setPaintTicks(boolean b): determina si se pintan o no las marcas del slider.
- setPaintLabels(boolean b): determina si se pintan o no las etiquetas del slider.
- setLabelTable(Dictionary labels): establece una tabla personalizada de etiquetas para el slider.
- [setFont(Font font): establece la fuente del slider](https://docs.oracle.com/javase/tutorial/uiswing/components/slider.html)[<sup>2</sup>](https://docs.oracle.com/javase/tutorial/uiswing/components/slider.html)[<sup>3</sup>](https://byspel.com/como-utilizar-el-deslizador-en-java-o-jslider-netbeans/).

Para capturar los cambios de valor del slider puedes usar un ChangeListener, que es una interfaz que define el método stateChanged(ChangeEvent e). Este método se invoca cada vez que el usuario mueve el botón del slider. [Dentro de este método puedes obtener el valor actual del slider con el método getValue() y realizar las acciones que necesites](https://docs.oracle.com/javase/tutorial/uiswing/components/slider.html)

```java
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class EjemploJSlider extends JFrame {

    private JSlider slider;
    private JLabel etiqueta;

    public EjemploJSlider() {
        super("Ejemplo de JSlider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        // Crear el slider con orientación horizontal y valores entre 10 y 100
        slider = new JSlider(JSlider.HORIZONTAL, 10, 100, 50);

        // Establecer las propiedades del slider
        slider.setMajorTickSpacing(10); // Espacio entre marcas principales
        slider.setMinorTickSpacing(5); // Espacio entre marcas secundarias
        slider.setPaintTicks(true); // Pintar las marcas
        slider.setPaintLabels(true); // Pintar las etiquetas

        // Añadir un listener al slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Obtener el valor actual del slider
                int valor = slider.getValue();
                // Cambiar el tamaño de la fuente de la etiqueta según el valor
                etiqueta.setFont(new Font("Arial", Font.PLAIN, valor));
            }
        });

        // Crear la etiqueta con el texto "Hola"
        etiqueta = new JLabel("Hola", SwingConstants.CENTER);

        // Añadir el slider y la etiqueta al panel principal
        add(slider, BorderLayout.NORTH);
        add(etiqueta, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploJSlider();
    }
}
```

# JSpinner

[Un JSpinner es un componente que te permite seleccionar un valor numérico u objeto dentro de una secuencia ordenada](https://docs.oracle.com/javase/tutorial/uiswing/components/spinner.html)[<sup>1</sup>](https://docs.oracle.com/javase/tutorial/uiswing/components/spinner.html). [Los JSpinner son similares a los JComboBox y los JList, pero tienen la ventaja de que no ocupan mucho espacio y permiten al usuario introducir el valor directamente](https://docs.oracle.com/javase/8/docs/api/javax/swing/JSpinner.html)[<sup>2</sup>](https://docs.oracle.com/javase/8/docs/api/javax/swing/JSpinner.html). Sin embargo, solo se deben usar cuando los posibles valores y su orden son obvios.

Para crear un JSpinner necesitas especificar su modelo, que es el encargado de gestionar los posibles valores y el valor actual del componente. [Existen varias clases que implementan la interfaz SpinnerModel, como SpinnerListModel, SpinnerNumberModel y SpinnerDateModel.](https://docs.oracle.com/javase/tutorial/uiswing/components/spinner.html)

```java
// Crear un JSpinner con un modelo de lista que contiene los nombres de los días de la semana
String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
SpinnerListModel modeloLista = new SpinnerListModel(dias);
JSpinner spinnerLista = new JSpinner(modeloLista);

// Crear un JSpinner con un modelo de números que tiene un valor inicial de 10, un mínimo de 0, un máximo de 100 y un paso de 5
SpinnerNumberModel modeloNumero = new SpinnerNumberModel(10, 0, 100, 5);
JSpinner spinnerNumero = new JSpinner(modeloNumero);

// Crear un JSpinner con un modelo de fechas que tiene el valor inicial de hoy, un mínimo de hace un año y un máximo de dentro de un año
Calendar calendario = Calendar.getInstance();
Date hoy = calendario.getTime();
calendario.add(Calendar.YEAR, -1);
Date minimo = calendario.getTime();
calendario.add(Calendar.YEAR, 2);
Date maximo = calendario.getTime();
SpinnerDateModel modeloFecha = new SpinnerDateModel(hoy, minimo, maximo, Calendar.DAY_OF_MONTH);
JSpinner spinnerFecha = new JSpinner(modeloFecha);
```

# JMenu

Para crear un menú en Java Swing, primero debes crear un objeto JMenuBar y agregarlo a la ventana principal. Luego, puedes agregar objetos JMenu al menú de la barra de menú. Para agregar elementos de menú a un objeto JMenu, debes crear objetos JMenuItem y agregarlos al objeto JMenu.

Aquí hay un ejemplo de código que puedes usar como referencia para crear un menú en Java Swing:

```java
JMenuBar menuBar = new JMenuBar();
JMenu menu = new JMenu("Archivo");
JMenuItem menuItem = new JMenuItem("Nuevo");
menu.add(menuItem);
menuBar.add(menu);
```

Este código crea un objeto JMenuBar y lo agrega a la ventana principal. Luego, crea un objeto JMenu llamado “Archivo” y lo agrega al menú de la barra de menú. Finalmente, crea un objeto JMenuItem llamado “Nuevo” y lo agrega al objeto JMenu.

## Menus con imágen

```java
JMenuItem menuItem = new JMenuItem("Nuevo", new ImageIcon("ruta/a/la/imagen.png"));
```

Este código crea un objeto JMenuItem llamado “Nuevo” y le asigna una imagen ubicada en “ruta/a/la/imagen.png

## Menus con checkbox o radio

Para agregar un objeto JCheckBoxMenuItem o JRadioButtonMenuItem a un objeto JMenu en Java Swing, puedes crear un objeto JCheckBoxMenuItem o JRadioButtonMenuItem y agregarlo al objeto JMenu. Aquí hay un ejemplo de código que puedes usar como referencia:

```java
JMenu menu = new JMenu("Archivo");
JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Opción 1");
JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem("Opción 2");
menu.add(checkBoxMenuItem);
menu.add(radioButtonMenuItem);
```

Este código crea un objeto JMenu llamado “Archivo” y agrega dos objetos JMenuItem al menú. El primer objeto JMenuItem es un objeto JCheckBoxMenuItem llamado “Opción 1” y el segundo objeto JMenuItem es un objeto JRadioButtonMenuItem llamado “Opción 2”.

## Menu emergente

Para crear un menú emergente en Java Swing, puedes crear un objeto JPopupMenu y agregar objetos JMenuItem al menú emergente. Luego, puedes asociar el menú emergente con un componente de la interfaz de usuario, como un botón o una tabla. Aquí hay un ejemplo de código que puedes usar como referencia.

```java
JPopupMenu popupMenu = new JPopupMenu();
JMenuItem menuItem1 = new JMenuItem("Opción 1");
JMenuItem menuItem2 = new JMenuItem("Opción 2");
popupMenu.add(menuItem1);
popupMenu.add(menuItem2);

JButton button = new JButton("Botón");
button.addMouseListener(new MouseAdapter() {
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }
});

```

Este código crea un objeto JPopupMenu y agrega dos objetos JMenuItem al menú emergente. Luego, crea un objeto JButton llamado “Botón” y agrega un MouseListener al botón para mostrar el menú emergente cuando se hace clic con el botón derecho del ratón.

# JToolBar

¡Por supuesto! Para crear una barra de herramientas en Java Swing, puedes crear un objeto JToolBar y agregar objetos JButton u otros componentes a la barra de herramientas. Luego, puedes agregar la barra de herramientas a un contenedor de la interfaz de usuario, como un objeto JFrame o JDialog. Aquí hay un ejemplo de código que puedes usar como referencia

```java
JToolBar toolBar = new JToolBar();
JButton button1 = new JButton("Botón 1");
JButton button2 = new JButton("Botón 2");
toolBar.add(button1);
toolBar.add(button2);

JFrame frame = new JFrame("Mi ventana");
frame.getContentPane().add(toolBar, BorderLayout.PAGE_START);

```

Este código crea un objeto JToolBar y agrega dos objetos JButton a la barra de herramientas. Luego, crea un objeto JFrame llamado “Mi ventana” y agrega la barra de herramientas al contenedor del JFrame.

# Disposición Box

La clase Box en Java Swing es una clase contenedora ligera que utiliza un objeto BoxLayout como su administrador de diseño. Box proporciona varios métodos de clase que son útiles para contenedores que utilizan BoxLayout, incluso contenedores no Box. La clase Box puede crear varios tipos de componentes invisibles que afectan el diseño: pegamento (glue), soportes (struts) y áreas rígidas (rigid areas)

```java
Box box = Box.createVerticalBox();
JButton button1 = new JButton("Botón 1");
JButton button2 = new JButton("Botón 2");
box.add(button1);
box.add(Box.createVerticalStrut(10));
box.add(button2);

JFrame frame = new JFrame("Mi ventana");
frame.getContentPane().add(box);
```

Este código crea un objeto Box vertical y agrega dos objetos JButton al objeto Box. Luego, crea un objeto JFrame llamado “Mi ventana” y agrega el objeto Box al contenedor del JFrame.

# Cuadro de dialogo

El paquete Swing de Java proporciona varios tipos de cuadros de diálogo que puedes utilizar en tus aplicaciones. Algunos de los tipos de cuadros de diálogo más comunes son:

- JDialog: un cuadro de diálogo modal que se utiliza para mostrar información o solicitar entrada del usuario.
- JOptionPane: un cuadro de diálogo que se utiliza para mostrar mensajes, solicitar entrada del usuario o seleccionar una opción.
- JFileChooser: un cuadro de diálogo que se utiliza para permitir al usuario seleccionar un archivo o directorio.
- JColorChooser: un cuadro de diálogo que se utiliza para permitir al usuario seleccionar un color.
- JProgressBar: un componente que se utiliza para mostrar el progreso de una tarea.

Para utilizar estos tipos de cuadros de diálogo, debes crear un objeto del tipo correspondiente y configurarlo según tus necesidades. Aquí hay un ejemplo básico de cómo utilizar un JOptionPane para mostrar un mensaje

# Archivos JAR

[Un archivo JAR es un archivo que contiene una o más clases de Java y otros archivos de recursos. Los archivos JAR se utilizan para distribuir aplicaciones o bibliotecas de clases Java. Un archivo JAR es similar a un archivo ZIP, excepto que está diseñado para contener archivos de clase Java](https://www.ibm.com/docs/es/i/7.1?topic=platform-java-jar-class-files)

Para crear un archivo JAR en Java, debes utilizar la herramienta jar que se incluye con el JDK (Java Development Kit). Aquí hay un ejemplo básico de cómo crear un archivo JAR

```bash
jar cf myapp.jar *.class
```

Este comando crea un archivo JAR llamado “myapp.jar” que contiene todos los archivos de clase en el directorio actual.

Para firmar digitalmente un archivo JAR, debes utilizar la herramienta jarsigner que también se incluye con el JDK. Aquí hay un ejemplo básico de cómo firmar digitalmente un archivo JAR:

```java
jarsigner -keystore mykeystore myapp.jar myalias
```

Este comando firma digitalmente el archivo JAR “myapp.jar” utilizando el almacén de claves “mykeystore” y el alias “myalias”

# Excepciones

Las excepciones en Java son objetos que se utilizan para manejar errores y situaciones excepcionales que pueden ocurrir durante la ejecución de un programa. [En Java, los errores en tiempo de ejecución se denominan excepciones](https://bing.com/search?q=java+excepciones)[<sup>1</sup>](https://bing.com/search?q=java+excepciones). [Existen dos tipos de excepciones en Java: las excepciones comprobadas y las excepciones no comprobadas](https://quejava.com/que-son-las-excepciones-en-java/)[<sup>2</sup>](https://quejava.com/que-son-las-excepciones-en-java/). [Las excepciones comprobadas son aquellas que el compilador obliga a manejar o propagar](https://barcelonageeks.com/tipos-de-excepcion-en-java-con-ejemplos/)[<sup>3</sup>](https://barcelonageeks.com/tipos-de-excepcion-en-java-con-ejemplos/). [Las excepciones no comprobadas son aquellas que no se obliga al programador a manejar o propagar](https://quejava.com/que-son-las-excepciones-en-java/)[<sup>2</sup>](https://quejava.com/que-son-las-excepciones-en-java/).

Para manejar una excepción en Java, se utiliza el bloque try-catch. [El bloque try contiene el código que puede generar una excepción y el bloque catch contiene el código que se ejecuta cuando se produce una excepción](https://www.w3schools.com/java/java_try_catch.asp)[<sup>4</sup>](https://www.w3schools.com/java/java_try_catch.asp).

[Existen muchas excepciones predefinidas en Java para determinadas situaciones, como por ejemplo IOException para errores producidos en operaciones de entrada/salida](https://bing.com/search?q=java+excepciones+tipos)[<sup>5</sup>](https://bing.com/search?q=java+excepciones+tipos). [Algunas de las excepciones más comunes son ArithmeticException, NullPointerException y ArrayIndexOutOfBoundsException](https://barcelonageeks.com/tipos-de-excepcion-en-java-con-ejemplos/)[<sup>3</sup>](https://barcelonageeks.com/tipos-de-excepcion-en-java-con-ejemplos/).

Es importante tener en cuenta que las excepciones no deben utilizarse para controlar el flujo normal del programa. [En su lugar, deben utilizarse para manejar situaciones excepcionales que puedan ocurrir durante la ejecución del programa](https://docs.oracle.com/javase/tutorial/essential/exceptions/)[<sup>6</sup>](https://docs.oracle.com/javase/tutorial/essential/exceptions/).

```java
public class Main {
  public static void main(String[] args) {
    try {
      int[] numeros = {1, 2, 3};
      System.out.println(numeros[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Se ha producido un error: " + e);
    }
  }
```

## IOException

las IOException, son excepciones comprobadas que se utilizan para manejar errores producidos en operaciones de entrada/salida. Por ejemplo, si intentas leer un archivo que no existe, se producirá una IOException. Para manejar esta excepción, debes utilizar el bloque try-catch

## RuntimeException

Estas excepciones significan que el codigo se puede programar mejor

## Try-catch-finally

El bloque try-catch-finally se utiliza para manejar excepciones en Java. El bloque try contiene el código que puede generar una excepción y el bloque catch contiene el código que se ejecuta cuando se produce una excepción. El bloque finally se utiliza para ejecutar código que siempre debe ejecutarse, independientemente de si se produce una excepción o no.

Aquí te muestro un ejemplo de cómo utilizar el bloque try-catch-finally:

```java
public class Main {
  public static void main(String[] args) {
    try {
      // Código que puede generar una excepción
    } catch (Exception e) {
      // Código que se ejecuta cuando se produce una excepción
    } finally {
      // Código que siempre debe ejecutarse
    }
  }
}
```

# Streams

Un stream es un flujo de datos que se puede leer o escribir desde una fuente o destino. Los streams se usan para acceder a ficheros en el disco, en la red o en la memoria. Hay dos tipos de streams: los de bytes y los de caracteres. Los de bytes operan con datos binarios y los de caracteres con datos de texto.

Para crear un stream de acceso a un fichero, se necesita una clase que implemente la interfaz InputStream (para leer) o OutputStream (para escribir). Por ejemplo, la clase FileInputStream permite leer bytes desde un fichero y la clase FileOutputStream permite escribir bytes en un fichero. Estas clases se pueden usar directamente o envolverlas en otras clases que proporcionen más funcionalidad, como BufferedInputStream o DataOutputStream.

Para leer o escribir datos desde un stream, se usan los métodos read() o write(), que pueden recibir o devolver un byte, un array de bytes o una longitud determinada de bytes. Estos métodos pueden lanzar una excepción IOException si ocurre algún error. Al terminar de usar un stream, se debe cerrar con el método close(), que también puede lanzar una excepción IOException.

```java
// Crear un stream de lectura desde el fichero input.txt 
InputStream in = new FileInputStream(“input.txt”);

// Crear un stream de escritura al fichero output.txt 
OutputStream out = new FileOutputStream(“output.txt”);

// Leer el primer byte del fichero de entrada 
int b = in.read();

// Escribir el byte leído al fichero de salida 
out.write(b);

// Cerrar los streams in.close(); 
out.close();
```

## Streams en Java

En Java, los streams son una forma poderosa de procesar secuencias de datos de manera eficiente y flexible. Un stream es una secuencia de elementos que se puede procesar en paralelo o en forma secuencial. Los streams permiten realizar operaciones como filtrado, mapeo, reducción y más, de manera concisa y expresiva.

Los streams se basan en dos conceptos clave:

1.  **Fuente de datos**: El stream se crea a partir de una fuente de datos, que puede ser una colección, un arreglo, un archivo, etc. Java proporciona métodos para crear streams a partir de estas fuentes de datos.
    
2.  **Operaciones intermedias y terminales**: Los streams permiten realizar operaciones intermedias y terminales. Las operaciones intermedias son aquellas que se aplican al stream y devuelven otro stream, lo que permite encadenar múltiples operaciones. Las operaciones terminales son aquellas que producen un resultado final, como una lista, un arreglo, o un valor agregado.
    

A continuación, veremos cómo exportar y leer archivos de texto y archivos en bytes utilizando streams en Java.

## Exportar y leer archivos de texto

Para exportar y leer archivos de texto, Java proporciona las clases `FileWriter` y `BufferedReader`, respectivamente, que se pueden utilizar en combinación con streams para lograr una lectura y escritura eficiente de archivos.

A continuación se muestra un ejemplo de cómo exportar un archivo de texto:

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileExportExample {
    public static void main(String[] args) {
        String filePath = "ruta/del/archivo.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hola, esto es un ejemplo de exportación de archivo de texto.");
            // Agregar más escritura de datos si es necesario
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, utilizamos `FileWriter` para escribir datos en un archivo de texto. Dentro del bloque `try-with-resources`, abrimos el archivo para escritura y utilizamos el método `write` para agregar el contenido al archivo. Una vez finalizada la escritura, el archivo se cerrará automáticamente gracias al uso del bloque `try-with-resources`.

Para leer un archivo de texto, podemos utilizar la clase `BufferedReader`. A continuación se muestra un ejemplo:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String filePath = "ruta/del/archivo.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, utilizamos `BufferedReader` para leer el archivo de texto línea por línea. Utilizamos el método `readLine` para leer cada línea y luego imprimirla en la consola. Nuevamente, utilizamos el bloque `try-with-resources` para garantizar que el archivo se cierre correctamente después de la lectura.

## Exportar y leer archivos en bytes

Para exportar y leer archivos en bytes, Java proporciona las clases `FileOutputStream` y `FileInputStream`, respectivamente, que se pueden combinar con streams para lograr una lectura y escritura eficiente de archivos binarios.

A continuación se muestra un ejemplo de cómo exportar un archivo en bytes:

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExportBytesExample {
    public static void main(String[] args) {
        String filePath = "ruta/del/archivo.dat";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            byte[] data = { 72, 101, 108, 108, 111 }; // Ejemplo de datos en bytes
            outputStream.write(data);
            // Agregar más escritura de datos si es necesario
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, utilizamos `FileOutputStream` para escribir datos en un archivo en bytes. Dentro del bloque `try-with-resources`, abrimos el archivo para escritura y utilizamos el método `write` para escribir el arreglo de bytes en el archivo.

Para leer un archivo en bytes, podemos utilizar la clase `FileInputStream`. A continuación se muestra un ejemplo:

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadBytesExample {
    public static void main(String[] args) {
        String filePath = "ruta/del/archivo.dat";
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, utilizamos `FileInputStream` para leer el archivo en bytes. Utilizamos el método `read` para leer cada byte y luego imprimirlo en la consola. Al igual que antes, utilizamos el bloque `try-with-resources` para garantizar que el archivo se cierre correctamente después de la lectura.

Espero que esta explicación profunda te haya ayudado a comprender cómo exportar y leer archivos de texto y archivos en bytes utilizando streams en Java.

# Serialización en Java

La serialización en Java es un proceso que permite convertir objetos en una secuencia de bytes, lo que facilita su almacenamiento, transmisión o persistencia en disco. La serialización se utiliza principalmente en el contexto de la comunicación entre diferentes componentes de una aplicación distribuida o para guardar el estado de un objeto en un archivo.

## ¿Qué es la serialización?

La serialización es el mecanismo mediante el cual los objetos en memoria se convierten en una secuencia de bytes, lo que les permite ser guardados o transmitidos. Este proceso se lleva a cabo utilizando la interfaz `java.io.Serializable`, que marca las clases como serializables.

## ¿Para qué sirve la serialización?

La serialización tiene varios usos importantes en Java:

1.  **Persistencia de objetos:** Permite guardar el estado de un objeto en un archivo o base de datos para su posterior recuperación. Esto es especialmente útil en aplicaciones que requieren almacenar datos de manera permanente.
    
2.  **Comunicación en red:** La serialización facilita el intercambio de objetos entre sistemas distribuidos a través de la red. Al convertir los objetos en una secuencia de bytes, se pueden enviar a través de una red y reconstruir en otro sistema.
    
3.  **Caché de objetos:** Los objetos serializados pueden ser almacenados en caché para mejorar el rendimiento de una aplicación. Al serializar un objeto y guardarlo en memoria, se evita la necesidad de consultas costosas a una base de datos o de recrear el objeto desde cero.
    

## ¿Cómo se usa la serialización?

Para hacer que una clase sea serializable, simplemente debes implementar la interfaz `java.io.Serializable`. A continuación, se muestra un ejemplo de una clase serializable en Java:

```java
import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    // Constructor, getters y setters

    // Resto del código de la clase
}
```

Una vez que la clase implementa la interfaz `Serializable`, se pueden serializar objetos de esa clase utilizando las clases `ObjectOutputStream` y `ObjectInputStream`. A continuación, se muestra un ejemplo de cómo se puede realizar la serialización y deserialización de un objeto:

```java
import java.io.*;

public class EjemploSerializacion {
    public static void main(String[] args) {
        // Serialización
        try {
            Persona persona = new Persona("Juan", 30);
            FileOutputStream fileOut = new FileOutputStream("persona.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(persona);
            out.close();
            fileOut.close();
            System.out.println("El objeto ha sido serializado y guardado en 'persona.ser'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización
        try {
            FileInputStream fileIn = new FileInputStream("persona.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Persona persona = (Persona) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Objeto deserializado:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

Una vez que la clase implementa la interfaz `Serializable`, se pueden serializar objetos de esa clase utilizando las clases `ObjectOutputStream` y `ObjectInputStream`. A continuación, se muestra un ejemplo de cómo se puede realizar la serialización y deserialización de un objeto:

```java
import java.io.*;

public class EjemploSerializacion {
    public static void main(String[] args) {
        // Serialización
        try {
            Persona persona = new Persona("Juan", 30);
            FileOutputStream fileOut = new FileOutputStream("persona.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(persona);
            out.close();
            fileOut.close();
            System.out.println("El objeto ha sido serializado y guardado en 'persona.ser'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización
        try {
            FileInputStream fileIn = new FileInputStream("persona.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Persona persona = (Persona) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Objeto deserializado:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## ¿Qué es SerialVersionUID?

El `SerialVersionUID` es un identificador de versión único que se utiliza en la serialización de objetos en Java. Es un número de versión que se asocia con la clase serializable y se utiliza para controlar la compatibilidad entre la versión serializada de un objeto y la versión de la clase en tiempo de ejecución.

Cuando se serializa un objeto, se incluye el `SerialVersionUID` en la secuencia de bytes. Al deserializar el objeto, se comprueba si el `SerialVersionUID` de la clase actual coincide con el `SerialVersionUID` almacenado en los bytes. Si hay una diferencia, se lanza una excepción `InvalidClassException`, lo que indica que la clase ha cambiado de manera incompatible.

El `SerialVersionUID` se puede especificar explícitamente en una clase serializable declarando un campo estático con el nombre `serialVersionUID`. Si no se especifica, Java calcula automáticamente un valor basado en la estructura de la clase, pero esto puede generar problemas si se modifican los campos o métodos de la clase. Al especificar el `SerialVersionUID`, se garantiza que el identificador de versión se mantiene constante incluso si se realizan cambios en la clase, siempre y cuando no sean cambios incompatibles.

```java
import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    // Constructor, getters y setters

    // Resto del código de la clase
}
```

En este ejemplo, la clase `Persona` implementa la interfaz `Serializable` y declara el campo estático `serialVersionUID`. Se establece un valor específico para `serialVersionUID` utilizando el número `1L`.

Es importante destacar que el `serialVersionUID` debe ser único para cada versión de la clase serializable. Si realizas cambios incompatibles en la clase (por ejemplo, cambiar el tipo de datos de un campo), deberás actualizar el `serialVersionUID` para indicar que la versión serializada ya no es compatible con las versiones anteriores.

Al establecer explícitamente el `serialVersionUID`, puedes controlar la compatibilidad de versiones y evitar excepciones `InvalidClassException` al deserializar objetos.

# Manejo de archivos en Java y la clase `File`

El manejo de archivos es una tarea común en el desarrollo de aplicaciones en Java. La plataforma Java proporciona varias clases y métodos para interactuar con archivos y directorios. Una de las clases clave en el manejo de archivos es `File`, que se encuentra en el paquete `java.nio.file`.

La clase `File` proporciona métodos estáticos para realizar diversas operaciones relacionadas con archivos y directorios, como crear, copiar, mover, eliminar, buscar y leer archivos. A continuación, exploraremos algunos de los métodos más utilizados de la clase `Files`:

## Crear un archivo o directorio

- `createFile(Path path, FileAttribute<?>... attrs)`: Crea un nuevo archivo en la ubicación especificada por el objeto `Path`. También se pueden proporcionar atributos opcionales, como permisos, al crear el archivo.
    
- `createDirectory(Path dir, FileAttribute<?>... attrs)`: Crea un nuevo directorio en la ubicación especificada por el objeto `Path`. Al igual que con `createFile()`, también se pueden proporcionar atributos opcionales al crear el directorio.
    

## Copiar, mover y eliminar archivos

- `copy(Path source, Path target, CopyOption... options)`: Copia un archivo de origen a una ubicación de destino especificada por los objetos `Path`. Se pueden proporcionar opciones adicionales, como `REPLACE_EXISTING`, para controlar el comportamiento de la copia.
    
- `move(Path source, Path target, CopyOption... options)`: Mueve o renombra un archivo o directorio de origen a una ubicación de destino especificada. También se pueden proporcionar opciones adicionales, como `REPLACE_EXISTING`.
    
- `delete(Path path)`: Elimina un archivo o directorio especificado por el objeto `Path`.
    

## Leer y escribir archivos

- `readAllLines(Path path)`: Lee todas las líneas de un archivo de texto y las devuelve como una lista de cadenas.
    
- `write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options)`: Escribe las líneas especificadas en un archivo de texto. También se pueden proporcionar opciones adicionales, como `APPEND`, para controlar el comportamiento de escritura.
    

## Verificar la existencia y propiedades de un archivo

- `exists(Path path, LinkOption... options)`: Verifica si un archivo o directorio existe en la ubicación especificada.
    
- `isDirectory(Path path, LinkOption... options)`: Verifica si el objeto `Path` especificado representa un directorio.
    
- `isRegularFile(Path path, LinkOption... options)`: Verifica si el objeto `Path` especificado representa un archivo regular (no un directorio).
    

## Buscar archivos

- `walk(Path start, FileVisitOption... options)`: Recorre de forma recursiva un directorio y sus subdirectorios, devolviendo un flujo (Stream) de objetos `Path` que representan los archivos y directorios encontrados.

Estos son solo algunos de los métodos proporcionados por la clase `Files`. Existen muchos más métodos que permiten realizar operaciones adicionales relacionadas con archivos y directorios, como cambiar permisos, obtener metadatos, establecer marcas de tiempo, entre otros.

Recuerda que al trabajar con la clase `Files` y las operaciones de archivos, es importante manejar adecuadamente las excepciones que puedan ocurrir, como `IOException`, y cerrar los recursos utilizados, como flujos de lectura/escritura, después de su uso.

## Ejemplo 1: Crear un archivo

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CrearArchivo {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("ruta/del/archivo.txt");
            Files.createFile(filePath);
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Ejemplo 2: Copiar un archivo

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopiarArchivo {
    public static void main(String[] args) {
        try {
            Path sourcePath = Paths.get("ruta/archivo_original.txt");
            Path targetPath = Paths.get("ruta/archivo_copia.txt");
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Ejemplo 3: Leer un archivo

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("ruta/del/archivo.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

# Programación genérica en Java

La programación genérica en Java es una característica que permite crear clases, interfaces y métodos que pueden trabajar con diferentes tipos de datos sin especificarlos de manera concreta. Proporciona flexibilidad y reutilización de código al permitir que la funcionalidad sea independiente del tipo de datos con el que se trabaja.

## Uso de la programación genérica

La programación genérica se utiliza principalmente para:

1.  **Reutilización de código**: Permite escribir algoritmos y estructuras de datos genéricas que funcionan con múltiples tipos de datos, evitando la duplicación de código.
    
2.  **Seguridad de tipos**: Proporciona verificación de tipos en tiempo de compilación, lo que ayuda a detectar posibles errores antes de la ejecución del programa. Esto mejora la robustez y evita errores relacionados con la manipulación incorrecta de tipos de datos.
    
3.  **Abstracción y generalización**: Permite definir estructuras y algoritmos que son independientes de los tipos de datos específicos, lo que facilita la creación de componentes genéricos y flexibles.
    

## Sintaxis de la programación genérica

La sintaxis básica de la programación genérica en Java implica el uso de parámetros de tipo (también conocidos como tipo genérico) dentro de ángulos `< >`. Estos parámetros de tipo representan un tipo de dato genérico que se especifica posteriormente al usar la clase, interfaz o método genérico.

### Clases y interfaces genéricas

```java
public class MiClase<T> {
    // Variables y métodos de la clase
}

public interface MiInterfaz<T> {
    // Métodos de la interfaz
}
```

En el ejemplo anterior, `T` es un parámetro de tipo que representa un tipo de dato genérico. Puedes utilizar `T` como tipo de dato en variables, parámetros de métodos y en la definición de métodos dentro de la clase o interfaz genérica.

### Métodos genéricos

```java
public <T> void miMetodo(T elemento) {
    // Implementación del método
}
```

## Aplicando programación genérica

La programación genérica se aplica en Java de diferentes formas, como:

1.  **Colecciones genéricas**: Las clases de la biblioteca de Java, como `ArrayList` y `HashMap`, utilizan programación genérica para permitir el almacenamiento y manipulación de objetos de diferentes tipos de manera segura.
    
2.  **Clases y métodos utilitarios**: Se pueden crear clases y métodos genéricos que realicen operaciones comunes en diferentes tipos de datos, como algoritmos de ordenamiento o búsquedas.
    
3.  **Estructuras de datos personalizadas**: La programación genérica facilita la creación de estructuras de datos personalizadas, como listas enlazadas genéricas o árboles binarios genéricos, que pueden funcionar con cualquier tipo de dato.
    

## Beneficios de la programación genérica

Al utilizar la programación genérica, se obtienen los siguientes beneficios:

- **Reutilización de código**: Se puede escribir código genérico que funciona con múltiples tipos de datos, evitando la duplicación de código.
    
- **Seguridad de tipos**: La verificación de tipos en tiempo de compilación reduce los errores relacionados con los tipos de datos y proporciona mayor robustez al programa.
    
- **Flexibilidad**: La programación genérica permite crear componentes más flexibles y adaptables, ya que no están limitados a un tipo de dato específico.
    
- **Mejor rendimiento**: Al trabajar con tipos de datos específicos en lugar de utilizar tipos de datos genéricos (como `Object`), se evita el costo de las conversiones y se mejora el rendimiento en tiempo de ejecución.
    

En resumen, la programación genérica en Java permite escribir código más flexible, seguro y reutilizable al trabajar con múltiples tipos de datos. Facilita la creación de estructuras de datos y algoritmos genéricos, lo que lleva a un desarrollo más eficiente y mantenible de aplicaciones.

La clase `ArrayList` en Java es una implementación de la interfaz `List` que proporciona una estructura de datos dinámica que puede almacenar elementos de manera ordenada. Te mostraré cómo utilizar la clase `ArrayList` para realizar operaciones comunes:

## Importar la clase ArrayList

Antes de usar la clase `ArrayList`, debes importarla en tu archivo Java:

```java
import java.util.ArrayList;
```

## Declarar un ArrayList

Puedes declarar un `ArrayList` indicando el tipo de elementos que contendrá. Por ejemplo, para almacenar cadenas de texto:

```java
ArrayList<String> miLista = new ArrayList<>();
```

En este caso, hemos creado un `ArrayList` que almacenará elementos de tipo `String`.

## Agregar elementos

Puedes agregar elementos a un `ArrayList` utilizando el método `add()`:

```java
miLista.add("Elemento 1");
miLista.add("Elemento 2");
miLista.add("Elemento 3");
```

En este ejemplo, hemos agregado tres elementos de tipo `String` a `miLista`.

## Acceder a elementos

Puedes acceder a elementos individuales de un `ArrayList` utilizando el método `get()` junto con el índice del elemento:

```java
String primerElemento = miLista.get(0);
System.out.println(primerElemento); // Imprime: Elemento 1
```

En este caso, hemos accedido al primer elemento de `miLista`.

## Modificar elementos

Puedes modificar un elemento en un `ArrayList` utilizando el método `set()` junto con el índice del elemento:

```java
miLista.set(1, "Nuevo elemento");
```

En este ejemplo, hemos modificado el elemento en el índice 1 por el valor "Nuevo elemento".

## Eliminar elementos

Puedes eliminar elementos de un `ArrayList` utilizando el método `remove()`:

```java
miLista.remove(2);
```

En este caso, hemos eliminado el elemento en el índice 2 de `miLista`.

## Tamaño del ArrayList

Puedes obtener el tamaño actual de un `ArrayList` utilizando el método `size()`:

```java
int tamaño = miLista.size();
System.out.println(tamaño); // Imprime: 2 (después de eliminar un elemento)
```

## Recorrer un ArrayList

Puedes recorrer un `ArrayList` utilizando bucles como `for` o `foreach`:

```java
for (String elemento : miLista) {
    System.out.println(elemento);
}
```

Este bucle imprime cada elemento del `ArrayList` en una nueva línea.

Estos son solo algunos ejemplos básicos de cómo utilizar la clase `ArrayList` en Java. La clase ofrece muchos más métodos y funcionalidades, como ordenación, búsqueda y filtrado de elementos. Puedes consultar la documentación oficial de Java para obtener más información sobre la clase `ArrayList` y sus métodos.

# Threads y la programación de hilos en Java

En Java, la programación de hilos (threads) es una parte fundamental para lograr la concurrencia y la ejecución paralela de tareas en un programa. Un hilo es una unidad básica de ejecución dentro de un proceso, y permite que múltiples tareas se ejecuten de manera concurrente.

## ¿Qué es un hilo (thread)?

Un hilo en Java representa una secuencia independiente de instrucciones que pueden ejecutarse en paralelo con otros hilos. Cada hilo tiene su propia pila de ejecución y puede ejecutar un fragmento de código de forma independiente. Esto permite que diferentes partes de un programa se ejecuten simultáneamente, mejorando así la capacidad de respuesta y la eficiencia de la aplicación.

## Creación de hilos en Java

En Java, puedes crear hilos utilizando la clase `Thread` o implementando la interfaz `Runnable`. Veamos ambos enfoques:

### Usando la clase `Thread`

```java
class MiHilo extends Thread {
    public void run() {
        // Código que será ejecutado en el hilo
    }
}

// Crear una instancia del hilo
MiHilo miHilo = new MiHilo();

// Iniciar la ejecución del hilo
miHilo.start();

```

### Implementando la interfaz `Runnable`

java

```java
class MiRunnable implements Runnable {
    public void run() {
        // Código que será ejecutado en el hilo
    }
}

// Crear una instancia del Runnable
MiRunnable miRunnable = new MiRunnable();

// Crear una instancia del hilo y pasarle el Runnable
Thread miHilo = new Thread(miRunnable);

// Iniciar la ejecución del hilo
miHilo.start();

```

## Ciclo de vida de un hilo

Un hilo en Java pasa por varios estados a lo largo de su ciclo de vida:

1.  Nuevo (`New`): El hilo ha sido creado pero aún no se ha iniciado.
2.  Ejecutable (`Runnable`): El hilo está listo para ejecutarse y está esperando su turno para ser programado por el planificador del sistema operativo.
3.  En ejecución (`Running`): El hilo está siendo ejecutado actualmente.
4.  Bloqueado (`Blocked`): El hilo está esperando ciertos recursos u otras condiciones para continuar su ejecución.
5.  Muerto (`Dead`): El hilo ha terminado su ejecución.

## Sincronización de hilos

Cuando múltiples hilos trabajan sobre los mismos recursos o variables compartidas, puede haber problemas de concurrencia, como la condición de carrera (race condition) o el acceso no sincronizado a los datos. Java proporciona mecanismos de sincronización para evitar estos problemas, como el uso de la palabra clave `synchronized` y los métodos `wait()` y `notify()`.

## Beneficios de la programación de hilos en Java

La programación de hilos en Java permite:

1.  Aprovechar la capacidad de procesamiento de las computadoras modernas con múltiples núcleos o procesadores.
2.  Mejorar la capacidad de respuesta de una aplicación al realizar tareas en paralelo.
3.  Realizar operaciones asincrónicas, como procesamiento en segundo plano o manejo de eventos.
4.  Mejorar el rendimiento al realizar tareas en paralelo, especialmente en aplicaciones intensivas en cálculos o de red.

## Consideraciones y desafíos

La programación de hilos en Java introduce desafíos adicionales, como la sincronización de datos compartidos, condiciones de carrera y problemas de concurrencia. Es importante tener en cuenta estos aspectos y aplicar las prácticas recomendadas para evitar errores y comportamientos inesperados en el programa.

## Conclusión

La programación de hilos en Java es una herramienta poderosa para lograr la concurrencia y ejecución paralela de tareas. Permite que diferentes partes de un programa se ejecuten simultáneamente, mejorando la capacidad de respuesta y la eficiencia de la aplicación. Sin embargo, se deben considerar cuidadosamente los desafíos asociados y aplicar las prácticas recomendadas para evitar problemas de concurrencia.

# Iterador/ListIterator

Un iterador en Java es un objeto que permite recorrer una colección de elementos. Para usar un iterador en Java, se puede utilizar la interfaz Iterator. Esta interfaz admite los siguientes métodos: Siguiente (), que devuelve el siguiente elemento en la colección; y Eliminar (), que elimina el elemento actual de la colección.

```java
List<String> list = Arrays.asList("elemento1", "elemento2", "elemento3");
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String elemento = iterator.next();
    System.out.println(elemento);
}

```

# Colecciones en Java

En Java, las colecciones son estructuras de datos que permiten almacenar y manipular grupos de objetos de manera eficiente. Proporcionan una forma conveniente de trabajar con conjuntos de elementos y ofrecen una amplia gama de funcionalidades para agregar, eliminar, buscar y recorrer elementos de la colección. Java ofrece varias interfaces y clases para implementar diferentes tipos de colecciones según las necesidades específicas de tu programa.

A continuación, te presentaré algunas de las colecciones más comunes en Java y en qué momentos específicos son útiles:

## 1\. List

La interfaz `List` es una colección ordenada que permite duplicados. Los elementos se almacenan en un orden específico, y puedes acceder a ellos mediante un índice. Algunas implementaciones notables de la interfaz `List` son `ArrayList` y `LinkedList`.

- Utiliza `ArrayList` cuando necesites un acceso rápido a los elementos por índice y no requieras una inserción o eliminación frecuente de elementos en el medio de la lista.
- Utiliza `LinkedList` cuando necesites realizar inserciones o eliminaciones frecuentes en el medio de la lista y no te importe un acceso más lento por índice.

## 2\. Set

La interfaz `Set` es una colección que no permite duplicados y no mantiene un orden específico. Se utiliza principalmente para almacenar elementos únicos. Algunas implementaciones notables de la interfaz `Set` son `HashSet` y `TreeSet`.

- Utiliza `HashSet` cuando no te importe el orden de los elementos y necesites un acceso rápido para verificar si un elemento está presente en el conjunto.
- Utiliza `TreeSet` cuando necesites que los elementos se mantengan ordenados automáticamente o cuando desees usar un comparador personalizado para el ordenamiento.

## 3\. Map

La interfaz `Map` representa una colección de pares clave-valor, donde cada clave es única y se utiliza para acceder a su correspondiente valor. Algunas implementaciones notables de la interfaz `Map` son `HashMap` y `TreeMap`.

- Utiliza `HashMap` cuando no te importe el orden de los elementos y necesites un acceso rápido a los valores mediante una clave.
- Utiliza `TreeMap` cuando necesites que los elementos se mantengan ordenados automáticamente según las claves o cuando desees usar un comparador personalizado para el ordenamiento.

## 4\. Queue

La interfaz `Queue` representa una colección que mantiene el orden de inserción de los elementos y proporciona operaciones para agregar elementos al final y eliminar elementos del principio. Algunas implementaciones notables de la interfaz `Queue` son `LinkedList` y `PriorityQueue`.

- Utiliza `LinkedList` cuando necesites una cola estándar y no requieras operaciones de prioridad.
- Utiliza `PriorityQueue` cuando necesites una cola donde los elementos se ordenen automáticamente según su prioridad.

## 5\. Deque

La interfaz `Deque` (double-ended queue) es similar a una cola, pero permite operaciones tanto en el principio como en el final de la cola. Algunas implementaciones notables de la interfaz `Deque` son `ArrayDeque` y `LinkedList`.

- Utiliza `ArrayDeque` cuando necesites una cola de tamaño variable y acceso rápido tanto al principio como al final.
- Utiliza `LinkedList` cuando necesites una cola de tamaño variable y realices operaciones de inserción o eliminación frecuentes en el medio de la cola.

## Conclusion

Las colecciones en Java ofrecen diferentes funcionalidades y características para satisfacer las necesidades específicas de tu programa. Es importante seleccionar la colección adecuada según los requisitos de tu proyecto, considerando aspectos como el rendimiento, el orden, la presencia de duplicados y las operaciones frecuentes que realizarás. Con el conocimiento de las colecciones disponibles y sus características, podrás utilizar eficientemente las estructuras de datos en Java para mejorar la eficacia y claridad de tu código.

## Tabla de colecciones

### List

#### Ventaja

- Acceso aleatorio
- Están ordenadas (collection.sort())
- Añadir / Eliminar sin restricción
- ListIterator modifica en cualquier dirección

#### Desventajas

- Bajo rendimiento en operaciones concretas que se resolverian mejor con otras interfaces

| Tipo | Caracteristicas | Caracteristicas |     |     |
| --- | --- | --- | --- | --- |
| **ArrayList** | Muy Rapida accediendo a elementos | Se adapta a un gran numero de escenarios |     |     |
| **LinkedList** | Listas Enlazadas | Gran eficiencia agregando y eliminando elementos |     |     |
| **Vector** | Considerada como colenccion obsoleta | Utilizada unicamente en operaciones de concurrencia |     |     |
| **CopyOnWriteArrayList** | Utilizada en programas concurrentes | Eficiente en operaciones de lectura pero muy poco eficiente en operaciones de escritura |     |     |

### Set

#### Ventajas

- No permiten elemntos duplicados
- Uso sencillo del metodo add que ademas asegura no elementos duplicados

#### Desventajas

- No tienes acceso aleatorio
- Poca eficencia a la hora de ordenar elementos (Y no siempre se puede)

| Tipo | Caracteristicas | Caracteristicas |     |     |
| --- | --- | --- | --- | --- |
| **HashSet** | Rapida | No duplicados | No ordenacion | No acceso aleatorio |
| **LinkedHashSet** | Ordenacion por entrada | Eficiente al acceder | No eficiente al agregar |     |
| **TreeSet** | Es ordenado | Poco eficiente |     |     |
| **EnumSet** | La mejor para tipos enumerados |     |     |     |
| **CopyOnWriteArraySet** | Especifico concurrencia | Eficiente lectura | Poco eficiente en escritura | Poco eficiente al eliminar |
| **ConcurrentSkipList** | Especifico concurrencia | Admite ordenacion | Con muchos elementos no es eficiente |     |

## Maps

#### Ventajas

- Asociacón clave -> Valor (Index = keys)
- No claves iguales

#### Desventajas

- Poca eficiencia comparado con las demás colecciones

| Tipo | Caracteristicas | Caracteristicas |     |     |
| --- | --- | --- | --- | --- |
| **HashMap** | No ordenacion | eficiente |     |     |
| **LinkedHashMap** | Ordenado por insercion | Permite ordenacion por uso | Eficiente lectura | Poco eficiente escritura |
| **TreeMap** | Ordenado por clave | Poco eficiente en todas sus operaciones |     |     |
| **EnumMap** | Permite enum como claves | Muy eficiente |     |     |
| **WeakHashMap** | Utilizado para crear elementos que vaya borrando el sistema si no se utilizan | Muy eficiente |     |     |
| **Hashtable** | Considerado obsoleto | Utilizado en operaciones con concurencia |     |     |
| **ConcurrentHashMap** | Utilizado en concurrencia | No permite nulos |     |     |

## Queues (Colas)

#### Ventajas

- Muy rapido al acceder al primer y ultimo elemento.
- Permite crear colas de elementos muy eficiente. (LIFO/FIFO)

#### Desventajas

- Acceso lento a los elementos intermedios

| Tipo | Caracteristicas | Caracteristicas |
| --- | --- | --- |
| **ArrayDeque** | Gran eficiencia | La mas utilizada |
| **LinkedBlockingDeque** | Utilizado en programacion concurrente |     |
| **LinkedList** | Rendimiento inferior al de ArrayDeque |     |
| **ProrityQueue** | Para utilizar un COmparator | El primer elemento dependera de porpiedad elegida |
| **PriorityBlockingQueue** | Igual que el anterior pero mas eficiente en programacion concurrente |     |

# Crear tus propios eventos

**Define la interfaz del evento:** Crea una interfaz que represente el evento que deseas tener. Una interfaz de evento debe tener métodos que los objetos interesados puedan implementar para manejar el evento.

```java
public interface MiEventoListener {
    void eventoOcurrido();
}
```

## **Crea la clase que genera el evento:** Crea la clase que generará el evento y proporciona métodos para agregar y eliminar oyentes del evento, así como para notificar cuando el evento ocurra.

```java
import java.util.ArrayList;
import java.util.List;

public class GeneradorEvento {
    private List<MiEventoListener> listeners = new ArrayList<>();

    public void agregarEventoListener(MiEventoListener listener) {
        listeners.add(listener);
    }

    public void removerEventoListener(MiEventoListener listener) {
        listeners.remove(listener);
    }

    public void dispararEvento() {
        for (MiEventoListener listener : listeners) {
            listener.eventoOcurrido();
        }
    }
}
```

**Implementa los oyentes del evento:** Crea clases que implementen la interfaz `MiEventoListener` para manejar el evento cuando ocurra.

```java
public class MiOyente implements MiEventoListener {
    @Override
    public void eventoOcurrido() {
        System.out.println("El evento ocurrió. Realizar acciones aquí.");
    }
}
```

## **Usa el generador de eventos:** En tu programa principal, crea una instancia del generador de eventos, agrega oyentes y luego dispara el evento cuando sea necesario.

```java
public class Main {
    public static void main(String[] args) {
        GeneradorEvento generador = new GeneradorEvento();
        MiOyente oyente = new MiOyente();
        
        generador.agregarEventoListener(oyente);
        
        // Algo sucede...
        generador.dispararEvento();
        
        generador.removerEventoListener(oyente);
    }
}
```

&nbsp;

# Java EE

**Java Platform, Enterprise Edition** o Java EE (anteriormente conocido como Java 2 Platform, Enterprise Edition o J2EE hasta la versión 1.4), es una plataforma de programación—parte de la Plataforma Java —para desarrollar y ejecutar software de aplicaciones en Lenguaje de programación Java con arquitectura de N capas distribuidas y que se apoya ampliamente en componentes de software modulares ejecutándose sobre un servidor de aplicaciones.

## Tomcat

Apache Tomcat (también llamado Jakarta Tomcat o simplemente Tomcat) funciona como un contenedor de servlets desarrollado bajo el proyecto Jakarta en la Apache Software Foundation. Tomcat implementa las especificaciones de los servlets y de JavaServer Pages (JSP) de Oracle Corporation (aunque creado por Sun Microsystems).

Tomcat es un contenedor web con soporte de servlets y JSPs. Tomcat no es un servidor de aplicaciones, como JBoss o JOnAS. Incluye el compilador Jasper, que compila JSPs convirtiéndolas en servlets. El motor de servlets de Tomcat a menudo se presenta en combinación con el servidor web Apache.

Tomcat puede funcionar como servidor web por sí mismo. En sus inicios existió la percepción de que el uso de Tomcat de forma autónoma era solo recomendable para entornos de desarrollo y entornos con requisitos mínimos de velocidad y gestión de transacciones. Hoy en día ya no existe esa percepción y Tomcat es usado como servidor web autónomo en entornos con alto nivel de tráfico y alta disponibilidad.

Dado que Tomcat fue escrito en Java, funciona en cualquier sistema operativo que disponga de la máquina virtual Java.

#### Estructura de directorios

La jerarquía de directorios de instalación de Tomcat incluye:

- bin - arranque, cierre, y otros scripts y ejecutables.
- common - clases comunes que pueden utilizar Catalina y las aplicaciones web.
- conf - ficheros XML y los correspondientes DTD para la configuración de Tomcat.
- logs - logs de Catalina y de las aplicaciones.
- server - clases utilizadas solamente por Catalina.
- shared - clases compartidas por todas las aplicaciones web.
- webapps - directorio que contiene las aplicaciones web.
- work - almacenamiento temporal de ficheros y directorios.

#### Carácteristicas y versiones

En 2019 se daba soporte únicamente a las versiones mayores 7.x, 8.5.x y 9.x, siendo consideradas las dos primeras versiones antiguas.

Tomcat 3.x (distribución inicial)

Implementado a partir de las especificaciones Servlet 2.2 y JSP 1.1  
Recarga de servlets  
Funciones básicas HTTP  
Versión sin soporte  
Tomcat 4.x

Implementado a partir de las especificaciones Servlet 2.3 y JSP 1.2  
Contenedor de servlets rediseñado como Catalina.  
Motor JSP rediseñado con Jasper.  
Conector Coyote  
Java Management Extensions (JMX), JSP Y administración basada en Struts.  
Versión sin soporte  
Tomcat 5.x

Implementado a partir de las especificaciones Servlet 2.4 y JSP 2.0  
Recolección de basura reducida.  
Capa envolvente nativa para Windows y Unix para la integración de las plataformas.  
Análisis rápido JSP  
Versión sin soporte  
Tomcat 6.x

Implementado de Servlet 2.5 y JSP 2.1  
Soporte para Unified Expression Language 2.1  
Diseñado para funcionar en Java SE 5.0 y posteriores.  
Soporte para Comet a través de la interfaz CometProcessor.  
Versión sin soporte  
Tomcat 7.x

Implementado de Servlet 3.0 JSP 2.2 y EL 2.2  
Mejoras para detectar y prevenir "fugas de memoria" en las aplicaciones web.  
Limpieza interna de código.  
Soporte para la inclusión de contenidos externos directamente en una aplicación web.  
Tomcat 8.x

Primera versión de Apache Tomcat en soportar las especificaciones de Servlet 3.1, JSP 2.3 y EL 3.0.1​  
Versión sin soporte  
Tomcat 8.5.x

Añade soporte para HTTP/2, OpenSSL para JSSE, TLS virtual hosting y JASPIC 1.1. Creado desde Tomcat 9, siguiendo los retrasos de Java EE 8.  
Tomcat 9.x  
Primera versión de Apache Tomcat en soportar las especificaciones de Servlet 4.0.2.

## JSP

JavaServer Pages (JSP) es una tecnología que ayuda a los desarrolladores de software a crear páginas web dinámicas basadas en HTML y XML, entre otros tipos de documentos. JSP es similar a PHP, pero usa el lenguaje de programación Java.

```java
<%@ page errorPage="myerror.jsp" %>
<%@ page import="com.foo.bar" %>
<html>
<head>
<%! int serverInstanceVariable = 1;%>
…
<%! int localStackBasedVariable = 1;%>
…
```

#### Variables implícitas

Las páginas JSP incluyen ciertas variables privilegiadas sin necesidad de declararlas ni configurarlas:

| Variable | Clase |
| --- | --- |
| `pageContext` | `javax.servlet.jsp.PageContext` |
| `request` | `javax.servlet.http.HttpServletRequest` |
| `response` | `javax.servlet.http.HttpServletResponse` |
| `session` | `javax.servlet.http.HttpSession` |
| `config` | `javax.servlet.ServletConfig` |
| `application` | `javax.servlet.ServletContext` |
| `out` | `javax.servlet.jsp.JspWriter` |
| `page` | `java.lang.Object` |
| `exception` | `java.lang.Exception` |

### Declaraciones

Nos permiten declarar variables, funciones y datos estáticos.

```
 <%! int maxAlumnosClase = 30; %>
```

### Scriptlets

Los scriptlets son partes de código Java incrustadas entre los elementos estáticos de la página....

```
 <% ... código Java ... %>
```

### Expresiones

Las expresiones se evalúan dentro de la servlet. No deben acabar en ";".

```
 <%= maxAlumnosClase + 1%>
```

El siguiente ejemplo pondría como título de la página el atributo "titulo" contenido en el objeto request:

```
 <%
   String titulo = "";
   if (request.getAttribute("titulo") != null) {
     titulo = (String) request.getAttribute ("titulo");
   }
 %>
 ...
 <title><%=titulo%></title>
 ....
```

### Etiquetas

Etiquetas JSP para simplificar el código y dar mayor funcionalidad.

Desarrollar sitios web utilizando etiquetas presenta ciertas ventajas como:

- facilitar el aprendizaje.
- facilitar el mantenimiento.
- fomentar la modularidad y la reutilización.
- simplificar el código y reducir el número de líneas necesarias.

Su sintaxis sería:

```
 <%@ taglib uri="/taglib/lycka" prefix="lycka" %>
 ...
 <lycka:hola/>
 ...
```

A la hora de generar el código Java de la Servlet, esta etiqueta **hola** será interpretada por el [Servidor de Aplicaciones](https://es.wikipedia.org/wiki/Servidor_de_aplicaciones "Servidor de aplicaciones") como perteneciente a la biblioteca de etiquetas (Tag Library) **lycka**. Esta biblioteca estará identificada en el fichero descriptor de nuestra aplicación (web.xml) con el nombre de recurso (URI) **/taglib/lycka**.

```
 <taglib-uri>/taglib/lycka</taglib-uri>
 <taglib-location>/WEB-INF/tags/lycka.tld</taglib-location>
```

Una implementación de este fichero descriptor, /WEB-INF/tags/**lycka.tld** podría ser:

```
 <?xml version="1.0" encoding="ISO-8859-1" ?>
 <!DOCTYPE taglib PUBLIC "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN" 
    "http://java.sun.com/j2ee/dtds/web-jsptaglibrary_1_1.dtd">
 
 <taglib>
   <tlibversion>1.0</tlibversion>
   <jspversion>1.1</jspversion>
   <shortname>simp</shortname>
   <uri>http://www.hachisvertas.net/jcs/taglibs/lycka</uri>
   <info>A simple sample tag library</info>
 
   <tag>
     <name>hola</name>
     <tagclass>org.lcyka.taglibs.miEtiqueta</tagclass>
     <bodycontent>empty</bodycontent>
     <info>Alaba la belleza de mi gata.</info>
   </tag>
 </taglib>
```

Y por fin, el servidor de aplicaciones sustituirá la etiqueta por su código Java asociado, **org.lcyka.taglibs.miEtiqueta**:

```
 package org.lcyka.taglibs;
 import ...;
 public class miEtiqueta extends TagSupport {
   public int doStartTag {
     try {
       pageContext.getOut().print("Mi gata es preciosa");
     } catch (IOException ioe) {
     }
     return SKIP_BODY;
   }
```

Y finalmente el **navegador** mostraría:

```
 Mi gata es preciosa
```

#### Etiquetas JSP

Son las etiquetas pertenecientes a la especificación JSP. Proporcionan una funcionalidad básica.

Un primer grupo de etiquetas proporciona funcionalidad a nivel de la página de una manera muy simple:

- **&lt;jsp:forward&gt;**, redirige la request a otra URL
- **&lt;jsp:include&gt;**, incluye el texto de un fichero dentro de la página
- **&lt;jsp:plugin&gt;**, descarga un plugin de Java (una [applet](https://es.wikipedia.org/wiki/Applet "Applet") o un Bean).

Un segundo grupo permite manipular componentes JavaBean sin conocimientos de Java.

- **&lt;jsp:useBean&gt;**, permite manipular un [Bean](https://es.wikipedia.org/wiki/Bean_%28inform%C3%A1tica%29 "Bean (informática)") (si no existe, se creará el Bean), especificando su ámbito (scope), la clase y el tipo.
- **&lt;jsp:getProperty&gt;**, obtiene la propiedad especificada de un bean previamente declarado y la escribe en el objeto response.
- **&lt;jsp:setProperty&gt;**, establece el valor de una propiedad de un bean previamente declarado.

#### Etiquetas JSTL

Son proporcionadas por Sun dentro de la distribución de [JSTL](https://es.wikipedia.org/wiki/JSTL "JSTL").

- **core**, iteraciones, condicionales, manipulación de URL y otras funciones generales.
- **xml**, para la manipulación de XML y para XML-Transformation.
- **sql**, para gestionar conexiones a bases de datos.
- **i18n**, para la internacionalización y formateo de las cadenas de caracteres como cifras.

#### Etiquetas Struts TagLib

Distribuidas por [Apache](https://web.archive.org/web/20070624063648/http://struts.apache.org/1.x/struts-taglib/index.html) para funcionar junto con el [Framework](https://es.wikipedia.org/wiki/Framework "Framework") de Struts.

- **PHP**
- **Bean**
- **HTML**
- **Logic**
- **Nested**
- **vjgp**

#### Etiquetas personalizadas

Anteriormente hemos visto un ejemplo para crear una etiqueta personalizada almacenada en nuestra propia biblioteca de etiquetas.

Para desarrollar etiquetas personalizadas, utilizaremos la API de las bibliotecas de etiquetas (Tag Libraries).

La API de las Servlet de Java es:

```
 javax.servlet.*
```

La API de JSP extiende de esta API,

```
 javax.servlet.jsp.*
```

Finalmente, la API de las bibliotecas de etiquetas (Tag Libraries) extiende de esta última,

```
 javax.servlet.jsp.tagext.*
```

Lo más relevante de esta API son:

- Las [interfaces](https://es.wikipedia.org/wiki/Interfaz_%28Java%29 "Interfaz (Java)")
    - Tag, que todas las etiquetas deben implementar.
    - BodyTag, extiende a la anterior y define métodos adicionales para inspeccionar el cuerpo de una etiqueta.
- Las clases
    - BodyContent, un manejador (handler) para leer y escribir en el cuerpo de una etiqueta.
    - BodyTagSupport, que implementa la interfaz BodyTag.
    - TagAttributeInfo, para obtener la información de los atributos de la etiqueta declarados en el TLD.
    - TagData, que contiene los valores de los atributos.
    - TagExtraInfo, para especificar información extra de una etiqueta, como las variables que introduce en el código o los atributos que serán validados.
    - TagInfo, basado en la información de la TLD.
    - TagLibraryInfo, representa la información de una TLD.
    - TagSupport, implementa la interfaz Tag.
    - VariableInfo, contiene información como el tipo y ámbito de las variables creadas o modificadas por la etiqueta.

Podemos encontrar una descripción más detallada en [http://java.sun.com/j2ee/sdk\_1.3/techdocs/api/javax/servlet/jsp/tagext/package-summary.html](http://java.sun.com/j2ee/sdk_1.3/techdocs/api/javax/servlet/jsp/tagext/package-summary.html)

Otro ejemplo de etiqueta podría ser el siguiente código Java:
```java
 package org.lycka.taglibs;
 import ...;
 public class LowerCaseTag extends BodyTagSupport {
   public int doAfterBody() throws JspException {
     try {
       BodyContent body = getBodyContent();
       JspWriter writer = body.getEnclosingWriter();
       String bodyString = body.getString();
       if ( bodyString != null ) {
         writer.print( bodyString.toLowerCase());
       }
     } catch(IOException ioe) {
       throw new JspException("Error: IOException while writing to the user");
     }
     return SKIP_BODY;
   }
 }
```

Al encontrar el inicio de la etiqueta, el runtime primero se invocará el método doStart() una vez instanciada la clase. Puede devolver uno de los siguientes valores:

SKIP_BODY, no procesa el contenido del cuerpo de la etiqueta.
EVAL_BODY_INCLUDE , evalúa el cuerpo de la etiqueta.
EVAL_BODY_TAG , evalúa el cuerpo de la etiqueta y lanza el resultado a otro stream almacenado en una propiedad de la etiqueta.
El método doAfterBody() después de procesar el cuerpo de la etiqueta.

Finalmente se invocará el método doEndTag(). Puede devolver:

EVAL_PAGE, para seguir procesando la página JSP
SKIP_PAGE, para dejar de procesar la página JSP, para por ejemplo redirigir la página
Declarado en el descriptor de la biblioteca como

```java
 <tag>
   <name>lowercase</name>
   <tagclass>org.lycka.taglibs.LowerCaseTag</tagclass>
   <bodycontent>JSP</bodycontent>
   <info>Put body in lowercase.</info>
 </tag>
 ```
 Utilizado en la página JSP
 ```java
 <%@ taglib uri="/taglib/lycka" prefix="lycka" %>
 ...
 <lycka:lowercase>Esto es un EJEMPLO</lycka:lowercase>
 ```
 
 ## Buenas practicas JSP
 - No abusar de scriptlets y declaraciones en archivos JSP.
 - Evita la programación de cientos de lineas de archivos JSP.
 - Modular el programa separando el código Java en clases independientes
 - Utilizar MVC.