//ESTE ARCHIVO LLAMADO 'HerenciaCLases.java' ES EL ARCHIVO PRINCIPAL Y NECESITA LOS ARCHIVOS 'Vehiculo.java', 'Bicicleta.java' & 'Carro.java' para funcionar
public class HerenicaClases {
    public static void main (String[] args){
        /* La herencia es cuando una clase adquiere los atributos y métodos de ota clase*/

        Carro Carro1 = new Carro(); //Creamos un objeto llamado 'Carro1' basado en la clase 'Carro'
        Bicicleta Bici1 = new Bicicleta();//Creamos un objeto llamado 'Bici1' basado en la clase 'Bicicleta'

        Bici1.Avanzar(); /* A pesar de que la clase 'Bicicleta' no cuenta con el método 'Avanzar', funciona debido a que a la clase 'Bicicleta' es una subclase o clase
        hijo de la superclase o clase padre el cual es 'Vehiculo' y por lo tanto heredó sus métodos y atributos*/

        Carro1.Avanzar();// Pasa lo mismo con la clase 'Carro'

        //Tambien funciona con sus variables de clase:

        System.out.println("La velocidad de la bicicleta es: " + Bici1.Velocidad); /* La clase 'Bicicleta' no cuenta con el atributo o variable 'Velocidad' pero como se
        dijo en la línea 9 y 10, 'Bicicleta' es una clase hijo de 'Vehiculo' y heredó sus atributos y métodos*/

        System.out.println("La velocidad del carro es: " + Carro1.Velocidad + "\n"); //Cuando se quiere imprimir el valor de una variable o atribito de clase se tiene que usar print

        //Las clases hijos también pueden tener sus propios atributos y métodos sin necesidad de compartirlo con su clase padre o clase hermanos
        System.out.println("La bicicleta tiene " + Bici1.Llantas + " llantas");
        System.out.println("El carro tiene " + Carro1.Llantitas + " llantas");
        System.out.println("La bicicleta tiene " + Bici1.Puertas + " puertas");
        System.out.println("El carro tiene " + Carro1.Puertitas + " puertas");
    }
}
