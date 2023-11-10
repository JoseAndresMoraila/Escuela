public class ArregloDeObjetos {
    public static void main(String[] args){
        /* Como vimos anteriormente de la siguiente manera se declaran arreglos como si fueran objetos*/
        int[] Numeros = new int[3]; /* Se declara un arreglo de tipo int seguido de corchetes que significará que será un arreglo
        llamado 'Numeros' donde se le reserva espacio en memoria con 'new' de tipo int donde van a haber tres espacios en el arreglo*/

        Comida[] Refrigerador = new Comida[3]; /* Se hace un arreglo de tipo clase 'Comida' donde el objeto se llama 'Refrigerador'
        y se reserva un espacio en memoria donde el arreglo basado en 'Comida' tenga tres espacios*/

        Comida Comida1 = new Comida("Pizza"); /* Se crea un objeto llamado 'Comida1' basado en la clase 'Comida'*/
        Comida Comida2 = new Comida("Hamburgesa");
        Comida Comida3 = new Comida("Tacos");

        Refrigerador[0] = Comida1; /* En el arreglo 'Refrigerador' que tiene tres espacios basado en la clase 'Comida', en el espacio
         0 se le pondrá el objeto 'Comida1' incluyendo todos sus parametros y funciones*/
        Refrigerador[1] = Comida2;
        Refrigerador[2] = Comida3;

        /* Tambien se pueden poner los valores en los espacios de la siguiente manera ya que se crearon los objetos:

           Comida[] Refrigerador = {Comida1, Comida2, Comida3};
           Se crea un arreglo de tipo 'Comida' llamado 'Refrigerador' y entre llaves se le ponen los valores en los espacios correspondientes
         */

        System.out.println(Refrigerador[0].Nombre); /* Se imprime lo que hay en el espacio 0 en el arreglo 'Refrigerador' pero se
         tiene que poner un punto para indicar que queremos imprimir el nombre ya que si no lo hacemos imprimirá el espacio en memoria
         del objeto*/
        System.out.println(Refrigerador[1].Nombre);
        System.out.println(Refrigerador[2].Nombre);
    }

    //Crearemos una clase dentro del archivo y cuando va dentro del archivo se le pone 'static public class'
    static public class Comida{

        String Nombre;
        Comida(String Nombre){ //Se crea un constructor
            this.Nombre = Nombre; /*Como la variable de clase y el parametro tienen el mismo nombre se le tiene que poner 'this.'
            al de clase para que pueda ser pasado al constructor como parametro */
        }
    }
}