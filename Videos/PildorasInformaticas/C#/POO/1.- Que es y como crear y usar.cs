/*System es un namespace el cual contiene varias clases, entre ellas Console el cual dentro de las funciones de la clase
Console está WriteLine y ReadLine los cuales son output e input respectivamente*/
using System;

class HelloWorld 
{
  static void Main() 
  {
    //Se crea la variable de tipo clase Carro mediante 'Carro mi_carro1' y se instancia con esa clase Carro mediante '= new Carro()':
    Carro mi_carro1 = new Carro();
    /*Cabe aclarar que al igual que las variables con datos primitivos se puede primero declarar la variable de tipo Objeto primero mediante:
    Carro mi_carro1;
    
    y luego instanciar esa variable con una clase mediante:
    mi_carro1 = new Carro();
    
    Pero yo lo hice todo en una sola línea*/
    
    /*Vamos a explicar terminos dichos en los comentarios anteriores:
    Una variable de tipo objeto es una variable que hace referencia a un objeto en la memoria. En la programación orientada a 
    objetos, los objetos son instancias de una clase y contienen datos y métodos que se definen en la clase. Las variables de
    tipo objeto se utilizan para hacer referencia a estos objetos y acceder a sus datos y métodos. Cuando se crea un objeto, se 
    reserva un espacio en la memoria para almacenar los datos del objeto. La variable de tipo objeto no almacena los datos del 
    objeto en sí, sino que almacena una referencia a la ubicación en la memoria donde se encuentra el objeto. Esto permite que
    varias variables de tipo objeto hagan referencia al mismo objeto en la memoria */
    
    //Se escribe el valor de la variable 'color' de la clase Carro en su instancia mi_carro1:
    Console.WriteLine($"El color del carro 1 es: {mi_carro1.color}");
    
    //Se llama a la función avanzar de la clase:
    mi_carro1.avaznar();
  }
}

//Se crea la clase Carro:
class Carro 
{
    public string color = "rojo"; //Se crea una variable de clase publica con un valor ya asigando
    
    //Se crea una función publica, es decir, que puede ser accedido por otras clases y lo que hará es escribir un mensaje
    public void avaznar()
    {
        Console.WriteLine("El carro está avanzando");
    }
}

/*Otra cosa que puedes tener la duda es, ¿Qué pasa si creas una variable de tipo objeto de una clase predeterminada y la 
instancias con otra clase diferente a la que creó?

Si creas una variable de tipo objeto de una clase y la instancias con otra clase, la variable de tipo objeto hará referencia a 
un objeto de la clase con la que se instanció. En otras palabras, la variable de tipo objeto se convierte en una instancia de la
clase con la que se instanció. Por ejemplo, si tienes una clase llamada Carro y otra clase llamada Moto, y creas una variable de
tipo objeto llamada vehiculo que hace referencia a un objeto de la clase Carro, pero luego la instancias con la clase Moto, la 
variable de tipo objeto vehiculo ahora hará referencia a un objeto de la clase Moto. Esto puede ser útil en algunos casos, pero 
también puede ser confuso si no se maneja correctamente. */
