// 'Abstraccion.java' ES LA CLASE PRINCIPAL Y SON ESENCIALES LOS ARCHIVOS 'Vehiculo.java' & 'Carro.java'
public class Carro extends Vehiculo {
    void Avanzar(){ //Ponemos el mismo nombre del método abstracto pero esta vez sin el 'abstract' y aquí tenemos que poner que hará, es decir un cuerpo de ejecución
        System.out.println("El carro está avanzando");
    }
}