// 'Abstraccion.java' ES LA CLASE PRINCIPAL Y SON ESENCIALES LOS ARCHIVOS 'Vehiculo.java' & 'Carro.java'
public abstract class Vehiculo { // No se puede crear un objeto de esta clase por tener 'abstract'
    abstract void Avanzar(); //Los métodos abstractos en la clase padre abstracta no necesitan un cuerpo para ejecución, se tienen que poner este método también en las subclases con cuerpo de ejecución
}