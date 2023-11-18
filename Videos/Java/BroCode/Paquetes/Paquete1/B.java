// ES IMPORTANTE QUE LOS PAQUETES 'Paquete1' & 'Paquete2' CON SUS RESPECTIVOS ARCHIVOS ('A.java' & 'B.java') & ('C.java' & 'AsubClase.java') ESTÉN SINCRONIZADOS

package Paquete1; //Esto significa que el archivo 'B.java' se encuentra en el 'Paquete1'
import Paquete2.*; // Esto significa que importaremos todas las clases/archivos del paquete 'Paquete2'

/* Los paquetes son colecciones lógicas o agrupaciones de clases, interfaces y otros tipos de archivos relacionados.
Los paquetes se utilizan para organizar y estructurar el código fuente en módulos coherentes. Cada clase en Java pertenece a
un paquete.

Al agrupar clases relacionadas en un paquete, puedes mejorar la claridad y mantenibilidad de tu código. Los paquetes también ayudan
a prevenir conflictos de nombres, ya que puedes tener varias clases con el mismo nombre siempre y cuando estén en paquetes diferentes. */

public class B {
}
