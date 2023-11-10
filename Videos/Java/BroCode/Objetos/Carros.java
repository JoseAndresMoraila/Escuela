public class Carros { //'Carros.java' SE USA EN EL ARCHIVO 'Objetos.java'
    // A continuación se definen sus atributos que son las caracteristicas que tiene
    String Marca = "Nissan";
    String Modelo = "Versa";
    int Year = 2019;
    String Color = "Blanco";
    double Precio = 2000.00;

    // A continuación se definen sus metodos, es decir, las acciones que llevará a cabo.

    void Conducir(){ //No se le pone 'static' debido a que el metodo pertenece a la clase 'Carros' y se sabe que pertenecen solo ahí
        System.out.println("Estás conduciendo el carro");
    }
    void Frenar(){
        System.out.println("Has frenado el carro");
    }
}