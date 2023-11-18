// ES IMPORTANTE QUE LOS PAQUETES 'Paquete1' & 'Paquete2' CON SUS RESPECTIVOS ARCHIVOS ('A.java' & 'B.java') & ('C.java' & 'AsubClase.java') ESTÉN SINCRONIZADOS

// ESTA ES LA CLASE PRINCIPAL

package Paquete1; //Esto significa que el archivo 'A.java' se encuentra en el 'Paquete1'
import Paquete2.*; // Esto significa que importaremos todas las clases/archivos del paquete 'Paquete2'

/* Los paquetes son colecciones lógicas o agrupaciones de clases, interfaces y otros tipos de archivos relacionados.
Los paquetes se utilizan para organizar y estructurar el código fuente en módulos coherentes. Cada clase en Java pertenece a
un paquete.

Al agrupar clases relacionadas en un paquete, puedes mejorar la claridad y mantenibilidad de tu código. Los paquetes también ayudan
a prevenir conflictos de nombres, ya que puedes tener varias clases con el mismo nombre siempre y cuando estén en paquetes diferentes.

También se explica los modificadores de acceso como 'public', 'protected', 'private' y 'default'*/


public class A {
    public static void main(String[] args){
        C InstanciaDeC = new C(); // Se crea una instancia/objeto basado enn la clase 'C' que se encuentra en el paquete 'Paquete2' en la línea 15
        System.out.println(InstanciaDeC.MensajePublic); //En la línea 15 en la clase 'C' en el paquete 'Paquete2' se declaró esa variable la cual no tiene restricciones y es completamente accesible

        /* System.out.println(InstanciaDeC.MensajeProtected);  Lo marcará como error debido a que marcará que 'MensajeProtected' está protegido ya que así se indicó en la clase 'C'
           en el paquete 'Paquete2' en la línea 18.
           Si queremos que funcione tendremos que hacer que la clase 'A' sea subclase de la clase 'C' para poder usarlo*/

        /* System.out.println(InstanciaDeC.MensajePrivado); Lo marcará como error debido a que se indicó en la clase 'C' en el paquete 'Paquete2' que es 'private' en la línea 25.
           Es decir, solo puede ser accesible dentro de la misma clase que se declaró y nada más*/
    }
}
