/* Los constructores son objetos por los cuales se le pasan argumentos o parametros para que no todos los objetos sean completamente iguales*/
public class Constructores {
    public static void main(String[] args){
        Humano Persona1 = new Humano("Jose", 20, 60.20); /* Como ya se dijo 'Persona1' sirve como la variable de tipo 'Humano' que es el nombre de la
        clase por el cual queremos crear un objeto y será igual a 'New Humano()' por el cual aquí se reserva memoria para ese objeto
        de la clase 'Humano'
        Ahí se le pasaron los parametros en el constructor y cada parametro como NombreC, EdadC, PesoC que esa C signifcia Contructor */

        System.out.println(Persona1.Nombre); /* El valor que se le puso a 'Persona1' en el constructor 'Humano' en el parametro
        'NombreC' fue "José" y solamente queremos ver el nombre */


        Humano Persona2 = new Humano("Gael", 19, 40.50); //Se crea otro objeto
        System.out.println(Persona2.Nombre); //De 'Persona2' imprimimos el nombre como parametro que se le pasó que en este caso fue "Gael"
        Persona1.Comer();

    }
    //Se creó la clase dentro del archivo ejecutable para no usar otro archivo
     static public class Humano{ //En este caso como lo queremos hacer dentro del mismo archivo principal debe tener static y estar declarado dentro de la clase principal
        String Nombre;
        int Edad;
        double Peso;
        //El nombre del constructor tiene que ser el mismo que la clase
        Humano(String NombreC, int EdadC, double PesoC){ /* En vez de ponerle parametros a la clase que creamos ponemos un constructor y
        este albergará los parametros*/
            Nombre = NombreC; //Se tiene que pasar los valores de los parametros del constructor 'Humano' a las variables de la clase debido a que
            Edad = EdadC; // se asegura que los datos pasados al constructor sean visibles y accesibles en todo el objeto.
            Peso = PesoC; // Esto es importante para que otros métodos de la clase puedan utilizar esos datos.

            /* El uso de 'this.' se usa adentro del constructor en variables de clase para diferenciar en un constructor de Java se
            utiliza para distinguir entre los nombres de los parámetros del constructor y las variables de instancia de la clase que
            tienen el mismo nombre pero en este caso no se usó porque se usaron distintos nombres. Cuando los nombres de los
            parámetros y las variables de instancia coinciden, el compilador necesita una forma de diferenciarlos, y 'this.' es la
            manera de hacerlo.
            En caso que los parametros hubieran tenido el mismo nombre de variables de instancia hubiera quedado así:

            Humano(String Nombre, int Edad, double Peso){
            this.Nombre = Nombre;
            this.Edad = Edad;
            this.Peso = Peso; */

        }
        void Comer(){ //Se pone fuera del constructor
            System.out.println(Nombre + " está comiendo"); /* Se le tiene que poner la variable de clase
            En caso de que la variable de clase y los parametros tengan el mismo nombre se hará como se explicó antes,se pondrá:
            System.out.println(this.Nombre + " está comiendo");
            Recuerda que al usar 'this.' te refieres a la variable de clase
            */
        }
    }
}