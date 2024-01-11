/*Construcores sirven en programación para darle un estado inicial a un objeto como un atributo, ya sea color, edad*/
using System;

namespace consructor
{
    class HelloWorld 
    {
      static void Main()
      {
        /*Creamos un objeto de tipo 'carro' y le ponemos un '=' seguido de 'new carro()' el cual este último llama al consructor de la
        clase 'carro' y así darle un estado inicial, y si creamos muchos objetos de tipo 'carro' llamando a su constructor todoso tendrán 
        el estado inicial de ruedas = 4, puertas = 4 y pantalla = true*/
        carro mi_carro1 = new carro();
        
        /*Queremos que imprima cuantas ruedas tiene y lo hacemos mediante poner el objeto creado llamado 'mi_carro1' seguido de un punto
        y el nombre de la función pública 'ver_ruedas()' la cual es un getter que nos permite ver el valor de una variable privada*/
        Console.WriteLine($"Numero de ruedas en el carro1: {mi_carro1.ver_ruedas()}");
        
        //En el siguiente imprimir llamamos a la función getter la cual devuelve un string con toda la información. Más abajo del codigo está la clase y su función
        Console.WriteLine(mi_carro1.ver_informacion());
        
        
        //Creamos otro objeto pero pasandole los argumentos al constructor para que tengan el valor inicial que nosotros le asiganamos al crear el objeto y no venga ya asigando de clase:
        carro mi_carro2 = new carro(2, false); //con 'new' se llama al constructor de su clase pero al ponerle dos parametros nos referimos que llamamos al que acepta dos argumentos
        
        //Ahora queremos ver su información llamando a los metodos:
        Console.WriteLine($"\nNumero de ruedas en el carro2: {mi_carro2.ver_ruedas()}");
        
        Console.WriteLine(mi_carro2.ver_informacion());
      }
    }
    
    //Creamos una clase llamada 'carro'
    class carro
    {
        //Se crean las variables de clase pero sin inicializar valores:
        private int ruedas;
        private int puertas;
        private bool pantalla;
        
        /*Creamos un constructor el cual tiene que ser public para ser accesible desde otras clases y tiene que tener el mismo nombre que
        la clase, además tiene que tener los parenetesis por donde se le pasarán los argumentos*/
        public carro()
        {
            //Les asignamos un valor incial a las variables de clase:
            ruedas = 4;
            puertas = 4;
            pantalla = true;
        }
        
        //Creamos un metodo getter el cual te da la información de una variable/atributo de clase privado:
        public int ver_ruedas()
        {
            //retorna el valor de la variable privada ruedas
            return ruedas;
        }
        
        //Tambien podemos crear un getter devolviendo un string concatenado de todas las variables de clase privadas:
        public string ver_informacion()
        {
            return $"El carro tiene\n{ruedas} ruedas.\n{puertas} puertas.\nY su pantalla es {pantalla}.";
        }
        
        /*En el caso que no queramos que todas los objetos tengan el mismo estado inicial lo que podemos hacer es crear otro consructor
        pero usando la sobrecarga, lo que quiere decir que para diferenciarlo de otro constructor de la misma clase se le ponen diferente
        número de parametros*/
        public carro(int puertas, bool pantalla)
        {
            ruedas = 4; /*Al crear otro constructor no se te olvide tambien ponerle un valor a la variable de clase creada fuera del constructor
            pero dentro de la misma clase porque tomará el valor de 0 ya que podemos pensar que porque en otro constructor porque ya tiene un valor
            asigando podemos pensar que tambien aplica para otros constructores pero no, no se te olvide que las variables de clase en un constructor
            si quieres ponerle valor debes asignarlos individualmente depiendiendo a cual constructorse quiera llamar al crear el objeto*/
            
            this.puertas = puertas;
            this.pantalla = pantalla;
            /*Es normal que el nombre del argumento de un constructor y una variable de clase sean la misma, en este caso se le pone
            .this ya que nos referimos a la variable de clase el cual se le asigna el mismo valor que el parametro pasado.
            Es decir: this.VariableDeClase = ParametroDelConstructor*/
        }
    }
}
/*En algunos compiladores si no usas las variables declaradas te podrían salir estos mensajes de advertencia:
- warning CS0219: The variable `mi_carro1' is assigned but its value is never used
- warning CS0414: The private field `consructor.carro.ruedas' is assigned but its value is never used
- warning CS0414: The private field `consructor.carro.puertas' is assigned but its value is never used
- warning CS0414: The private field `consructor.carro.pantalla' is assigned but its value is never used

Si nos ponemos constructor a una clase y llamamos a su 'constructor' no pasa nada ya que es como llamar a uno que no hicimos el cual se podría ver así:
public carro
{
    
} Es decir el compilador al ver que no existe un constructor de una clase creará uno imaginario como ese puesto*/
