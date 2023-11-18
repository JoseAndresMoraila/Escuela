// ES IMPORTANTE QUE LOS PAQUETES 'Paquete1' & 'Paquete2' CON SUS RESPECTIVOS ARCHIVOS ('A.java' & 'B.java') & ('C.java' & 'AsubClase.java') ESTÉN SINCRONIZADOS

package Paquete2; //Esto significa que el archivo 'C.java' se encuentra en el 'Paquete2'
import Paquete1.*; // Esto significa que importaremos todas las clases/archivos del paquete 'Paquete1'

/* Los paquetes son colecciones lógicas o agrupaciones de clases, interfaces y otros tipos de archivos relacionados.
Los paquetes se utilizan para organizar y estructurar el código fuente en módulos coherentes. Cada clase en Java pertenece a
un paquete.

Al agrupar clases relacionadas en un paquete, puedes mejorar la claridad y mantenibilidad de tu código. Los paquetes también ayudan
a prevenir conflictos de nombres, ya que puedes tener varias clases con el mismo nombre siempre y cuando estén en paquetes diferentes. */

public class C { //Si se le quita 'public' la clase solo será accesible a otras clases dentro del mismo paquete pero no a clases de otros paquetes

    public String MensajePublic = "Este es el mensaje es publico si se importa el paquete en el que está guardado y la variable se declara como pública"; /* Si no se pone 'public' y se
    quiere acceder a esta variable en otro paquete no va a funcionar ya que solo será reconocidos por clases del mismo paquete en el que se encuentra. Funciona para subclases en otros paquetes*/

    protected String MensajeProtected = "Este es un mensaje protegido"; /* el modificador 'protected' es un modificador de acceso que se puede aplicar a variables de instancia,
     métodos y constructores. Cuando una miembro de una clase está marcado como protected, ese miembro es accesible dentro del mismo paquete y también por las subclases
     (heredadas) incluso si las subclases están en un paquete diferente.

     En general, se recomienda utilizar 'public' cuando se desea un acceso más amplio y 'protected' cuando se desea restringir el acceso, pero permitirlo en el contexto de
     herencia. La elección depende de los requisitos específicos del diseño. */

    private String MensajePrivado = "Este mensaje es privado"; /* Cuando algo se declara 'private' solamente puede ser usado dentro de la misma clase */
}
