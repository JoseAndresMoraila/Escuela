/*Las clases anónimas son aquellas que se consistuten en una sola línea de código y a diferencia de las clases normales las anonimas
solo pueden tener campos públicos, todos los campos deben estar iniciados con algún valor, tampoco los campos pueden ser static
y en una clase anónima no se pueden definir funciones. Como su nombre lo indica no tienen algún nombre de identifación*/

using System;

class HelloWorld
{
  static void Main()
  {
    /*Definimos mediante 'var' que vamos a declarar una variable sin algún tipo espicifido de dato (pero hay veces que el compilador
    deduce de que tipo es mediante su valor que hay guardada en ella) y le pusimos de nombre 'Variable1' seguido de un '=' y un 
    'new {}' donde en este ultimo definimos que será una clase anonima con sus respectivos campos y valores.*/
    var Variable1 = new {Nombre = "José", Edad = 20};
    //Imprimimos el valor que hay en esa variable de clase anonima
    Console.WriteLine("Hola soy " + Variable1.Nombre + " y tengo " + Variable1.Edad);
    
    //Creamos otra clase privada y la guardamos en una variable y lo imprimimos
    var Variable2 = new {Nombre = "Andrés", Edad = "30"};
    Console.WriteLine("Hola soy " + Variable2.Nombre + " y tengo " + Variable2.Edad);
  }
}

/*Si queremos que una variable de tipo clase privada tengan los mismos valores que otra variable de tipo clase deben tener los mismos
campos del mismo tipo en el que fueron declarados. Por ejemplo:
Variable1 = Variable2; Saldría un error ya que el segundo campo(Edad) de la clase anonima en la cual se declaró Variable1 es de tipo
int y en ese mismo segundo campo pero en la clase anonima de Variable2 se declaró como string ya que el número tiene comillas.*/
