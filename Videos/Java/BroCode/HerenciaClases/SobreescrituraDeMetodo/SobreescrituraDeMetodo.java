//'SobreescrituraDeMetodo.java' ES EL ARCHIVO PRINCIPAL Y LOS ARCHIVOS 'Animal.java' & 'Perro.java' SON ESENCIALES
public class SobreescrituraDeMetodo {
    static public void main(String[] args) {
        /* Declarar un método en una subclase o clase hijo que ya está presente en la clase padre; la subclase le puede dar su propia implementación.
         Es decir, si un método de la clase hijo tiene el mismo nombre que uno de la clase padre, el del hijo tendrá prioridad */

        Perro Canino1 = new Perro(); //Se crea un objeto basado en la clase 'Perro' que a su vez es clase hijo de 'Animal' el cual es la clase padre
        Animal Animal1 = new Animal();

        Canino1.Comunicacion(); /*Se usará el método sobreescrito de la clase hijo ya que el objeto 'Canino1' está basado en 'Perro' que es subclase de 'Animal'
        En este caso imprimirá: "El animal se está comunicando (clase 'Perro')" */

        Animal1.Comunicacion();/*Aún con el mismo nombre de método, en este caso 'Animal1' está basado en la clase padre 'Animal' por lo cual no esta sobreescrito nada y conserva el original
        En este caso imprimirá: "El animal se está comunicando (clase 'Animal')" */
    }
}
