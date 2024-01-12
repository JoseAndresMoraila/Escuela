using System;

class HelloWorld 
{
  static void Main()
  {
    /*Al crear el siguiente objeto basado en la clase 'Iniacializador' el cual imprimirá un mensaje automáticamente ya que se puso
    un WriteLine en el constructor el cual es un iniacializador y cualquier cosa que se ponga en el constructor se ejecutará automáticamente
    al crear un objeto*/
    Iniacializador obj1 = new Iniacializador();
    
    //Creamos un objeto de la misma clase pero de otro constructor pasandole un argumento
    Iniacializador obj2 = new Iniacializador(2);
  }
}

class Iniacializador
{
    /*Creamos un constructor y no solo adentro le podemos poner asiganción de valores de atributos/variables/campos de clase
    a través de parametros pasados al instanciar sino que un constructor también sirve como un iniciador, es decir, que el siguiente
    mensaje se imprimirá automáticamente al instanciar con esta clase llamada 'Iniacializador' pero también se pueden poner otras
    cosas en un constructor que queremos que se hagan al crear un objeto de la clase*/
    public Iniacializador()
    {
        Console.WriteLine("Este mensaje está en el constructor que no acepta parámetros el cual un constructor es un Iniacializador.");
    }
    
    //Creamos otro constructor pero este tomará como parametro un entero y al pasarle un entero se llamará a este constructor
    public Iniacializador(int Num)
    {
        Console.WriteLine($"Este mensaje está en el constructor número {Num} y se diferencia del otro porque este al menos acepta un argumento.");
    }
}

/*La clase 'Iniacializador' puede tener más constructores los cuales al haber más de uno se le llama sobrecarga de constructores
pero se puede llamar a uno específicamente poniendo sus argumentos correspondientes.

También cabe aclarar que si una clase no tiene constructor se toma uno 'imaginario' por defecto al instanciar el cual no tiene ningún argumento 
a pasar pero si creamos uno con los argumento que sean o con ninguno entonces ese constructor será el de defecto y al instanciar
tendremos que pasarle los argumentos correspondientes para que no haya ningún error o no pasarle ninguno si se creó el constructor
para que no tome argumentos.*/
