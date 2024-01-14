using System;

namespace Herencia
{
    
    class HelloWorld
    {
      static void Main()
      {
        Humamo ser_humano = new Humamo();
        Perro Firulais = new Perro();
        
        
        ser_humano.lactancia();/*Como podemos ver a pesar de que la clase 'Humamo' no tiene como tal la función 'lactancia' de todos
        modos se despliega el mensaje ya que 'Humamo' es una clase hijo de la clase 'Mamifero'*/
        ser_humano.pensar();//La función 'pensar' solo está presente en la clase 'Humano'
        
        Firulais.lactancia(); //Igual pasa que se hereda el método 'lactancia' aunque no se declaró en la clase 'Perro'
        Firulais.ladrar();
      }
    }
    
//RECUERDA CHECAR ABAJO ANTES DE ENTENDER LO DE ARRIBA

    /*Creamos la superclase o clase padre la cual heredará sus funciones y atributos completamente si se declararon como public
    o protected, o parcialmente si protected internal a sus subclases o clases hijos.
    Creamos la clase padre 'Mamifero'*/
    class Mamifero
    {
        //Las siguientes don funciones publicas serán heredadas a sus subclases
        public void lactancia()
        {
            Console.WriteLine("El mamifero es capaz de dar lactancia a sus críaz");
        }
        public void respirar()
        {
            Console.WriteLine("El mamifero es capaz de respirar");
        }
    }
    
    //Si queremos que la clase 'Humamo' sea una clase hijo de 'Mamifero' se pone de la siguiente forma
    class Humamo : Mamifero
    {
        //Esta función debido a que se declaró dentro de la subclase 'Humano', solo está disponible para objetos creados basados en esta clase
        public void pensar()
        {
            Console.WriteLine("El ser humano es capaz de pensar");
        }
    }
    
    class Perro : Mamifero
    {
        public void ladrar()
        {
            Console.WriteLine("Los perros ladran");
        }
    }
}
