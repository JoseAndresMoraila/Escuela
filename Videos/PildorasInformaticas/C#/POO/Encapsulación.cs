/*La encapsulacion es escencial en programación orientada a objetos ya que nos permite proteger una función o variable de clase dependiendo
su función en el programa así evitar errores y que haya consistencia y sea más legible un código. La encapsulación es una técnica de
programación orientada a objetos que se utiliza para ocultar la complejidad de una clase y proteger sus datos y métodos del acceso no
autorizado.
Los modificadores de acceso se les llama a que tipo de acceso tiene una función o variable ya sea private, public, protected, internal,
private protected y protected internal.*/

using System;

/*Tip para que recuerdes bien: Este namespace llamdado Encapsulacion tiene tres clases: HelloWorld, persona y conversion lo cual si 
quieres acceder a funciones y variables publicas de una de esas clases en otro archivo C# solo hace que pongas 'using Encapsulacion'
en el otro archivo y por ejemplo si quieres acceder a la función publica 'cambiar_precio' de la clase 'conversion' solo hace falta
que pongas 'conversion.cambiar_precio(argumento)'*/
namespace Encapsulacion
{
    
    class HelloWorld 
    {
      static void Main() 
      {
        /*Hay que señalar que no se crea una clase persona ya que aunque se puede no tiene caso ya que su función y atributo son privados,
        por lo que no tendríamos nada que hacer.
        Pero en la clase conversión' hay una función pública por lo que creamos un objeto de esa clase´:*/
        conversion obj = new conversion();
        
        //Mediante una función de acceso cambiamos el valor de la variable privada la cual por sí sola no se puede llamar ni cambiar para el objeto
        obj.cambiar_precio(25);
        //Ve a las clases de abajo lo cual explica la creación de este objeto llamdado 'obj'
      }
    }
    
    class persona
    {
        /*Al poner una variable de clase en privada, si creamos un objeto basado en esta clase 'persona' no podremos acceder a la variable
        'edad' ni modificarla ya que al ponerla en privado solo puede ser accesible dentro de su ambito, es decir, dentro de su misma clase
        y fuera de ella como al crear una clase no se puede ver ni modificar como ya se dijo*/
        private int edad = 15; 
        
        /*El siguiente metodo tampoco se puede acceder a él más que solamente dentro de su ambito, es decir, su misma clase donde se 
        declaró, por lo que podremos crear una clase de 'persona' pero no acceder a sus atributos y funciones porque son privadas*/
        private void mensaje()
        {
            Console.WriteLine("Este mensaje está en un metodo privado");
        }
    }
    
    class conversion
    {
        /*Creamos una variable de clase con acceso privado la cual no puede ser modificada fuera de la clase ya que es privada pero en la función verememos
        como hacer para cambiar su valor aunque sea privada*/
        private int precio_dolar = 17;
        
        /*Aunque se puede volver public la variable precio_dolar, la diferencia está a traves de un metodo de acceso se pueden
        poner condicionales si se quiere cambiar el valor privado de una variable de clase. 
        La siguiente función de acceso tomará un argumento el cual será el nuevo precio del dolar e imprimirá sus precios antes y después*/
        public void cambiar_precio(int nuevo_precio)
        {
            //Se puede acceder a la variable privada ya que la funcion pertenece a la misma clase de la variable privada
            Console.WriteLine($"El precio de antes era: {precio_dolar}");
            
            //Cambiamos el precio de la variable privada:
            precio_dolar = nuevo_precio;
            
            Console.WriteLine($"El nuevo precio del dolar es: {precio_dolar}");
        }
        
    }
}
/*Por si preguntabas, si no se especifica el acceso de una función o variable se toma por predeterminado private*/
