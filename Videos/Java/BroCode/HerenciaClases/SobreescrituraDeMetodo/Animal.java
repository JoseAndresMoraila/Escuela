//'SobreescrituraDeMetodo.java' ES EL ARCHIVO PRINCIPAL Y LOS ARCHIVOS 'Animal.java' & 'Perro.java' SON ESENCIALES
public class Animal {
    void Comunicacion(){

        System.out.println("El animal se está comunicando (clase 'Animal')"); //No se imprimirá en pantalla porque fue sobreescrito en la clase 'Perro'
    }
}
