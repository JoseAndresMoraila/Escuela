//'SobreescrituraDeMetodo.java' ES EL ARCHIVO PRINCIPAL Y LOS ARCHIVOS 'Animal.java' & 'Perro.java' SON ESENCIALES
public class Perro extends Animal{ //La clase 'Perro' es una subclase de la clase 'Animal'


    void Comunicacion(){

        System.out.println("El animal se está comunicando (clase 'Perro')");//Se imprimirá este mensaje ya que sobreescribió al metodo de la clase 'Animal'
    }
}
