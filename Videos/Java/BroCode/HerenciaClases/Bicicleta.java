//DEBIDO A QUE ES HERENCIA VARIOS ARCHIVOS DEBEN ESTAR JUNTOS, EN ESTE CASO DEBEN ESTAR JUNTOS: 'HerenciaCLases.java'(Principal), 'Vehiculo.java', 'Bicicleta.java' & 'Carro.java' para funcionar
public class Bicicleta extends Vehiculo { /* Al poner 'extends' ahora la clase 'Bicicleta' es una subclase de 'Vheiculo'(Superclase), es decir, hereda sus atributos y métodos*/

    // A pesar de ser una clase hijo también puede tener sus propios métodos y atributos sin necesidad de compartirlo con su clase padre o clase hermanos
    int Llantas = 2;
    int Puertas = 0;
}