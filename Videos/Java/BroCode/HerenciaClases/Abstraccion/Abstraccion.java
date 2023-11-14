// 'Abstraccion.java' ES LA CLASE PRINCIPAL Y SON ESENCIALES LOS ARCHIVOS 'Vehiculo.java' & 'Carro.java'
public class Abstraccion {
    public static void main(String[] args){
        /* La abstracción sirve para hacer un código más limpio y seguro. El objetivo principal de la abstracción es ocultar los detalles innecesarios a los usuarios.
        La abstracción consiste en seleccionar datos de un conjunto más grande para mostrar solo detalles relevantes del objeto al usuario. Ayuda a reducir la complejidad y
        los esfuerzos de programación. Es uno de los conceptos más importantes de la programación orientada a objetos.
        
           No se pueden crear objetos/instancias de clases padres abstractas y dentro del cuerpo de clases abstractas se pueden poner metodos abstractos pero no llevarán un cuerpo
           con instrucciones, ya que el metodo abstracto con el mismo nombre se puede poner en las clases hijos pero sin la palabra clase 'abstract' y sí se pueden crear objetos
           de clases hijos aunque su clase padre sea abstracta*/

        // Vehiculo Vehiculo1 = new Vehiculo(); //Debido a que la clase 'Vehiculo' es abstracta no podemos crear un objeto basado en esa clase (Lo ponemos en comentario para que no arroje error)
        Carro Carro1 = new Carro(); //A pesar de que la clase 'Carro' es hijo de la clase padre 'Vehiculo', sí se puede crear una instancia debido a que solo se le puso 'abstact' a 'Vehiculo'

        Carro1.Avanzar(); //

    }
}
