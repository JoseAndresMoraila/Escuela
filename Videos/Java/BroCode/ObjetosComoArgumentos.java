public class ObjetosComoArgumentos{
    public static void main(String[] args){
        /* A*/

        Garache Cochera = new Garache(); //Creamos un objeto llamado 'Cochera' basado en la clase 'Garache'
        Coches Carro1 = new Coches("BMW");// Creamos un objeto llamado 'Carro1' basado en 'Coches' y se le pasa como parametro 'BMW' obligatoriamente

        Cochera.Estacionar(Carro1); /* La clase 'Garache' tiene un método llamado 'Estacionar' que se le tiene que pasar como argumento
        un objeto que tiene que estar basado en la clase 'Coches' que en este caso es 'Carro1'.
        En pocas palabras se le pasa como argumento un objeto de tipo de dato clase que se configuró en la clase*/

        //Creamos otro objeto llamado 'Carro2' y lo estacionamos
        Coches Carro2 = new Coches("Tesla");
        Cochera.Estacionar(Carro2);
    }

    //Se crean las clases:

    static public class Coches{
        // Creamos un constructor
        String Modelo;
        Coches(String Modelo){
            this.Modelo = Modelo;
        }
    }

    static public class Garache{
        void Estacionar(Coches CarroP){ /* Solo objetos basados en la clase 'Coches ' pueden ser pasados como argumentos al objeto ('Cochera') que está
        basado en esta clase. En otras palabras solo se le pueden pasar argumentos objetos basados en la clase que se configuró para pasarse.
        
        Como parametro se le pone que va a recibir datos de tipo clase 'Coches' y el nombre del parametro puede ser el que le quieras poner*/
        System.out.println("El carro " + CarroP.Modelo + " ha sido estacionado en la cochera.");
        /* Dentro del método de la clase que queremos que vaya un argumento que sea un objeto de otra clase podremos poner la acción que
        queremos que haga. En este caso si vamos a usar alguna variable o metodo de esa clase tenemos que escribir el parametro ya que recordemos
        que se declaró con el tipo de dato del nombre de la clase que se quiere usar y luego un punto y el metodo o variable que queremos usar*/
        }
    }
}