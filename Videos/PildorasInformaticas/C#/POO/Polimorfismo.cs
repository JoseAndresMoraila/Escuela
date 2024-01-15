/*Polimordismo en programación orientada a objetos es la manera en que un atributo o una función se adapta a la clase en que se está llamando.
Se usa 'virtual' en la función en la superclase la cual se va a adaptar a las funciones con el mismo nombre y mismo número de parametros
pero en la función de las clases subclases las cuales tendrán que ponerles 'override' lo cual hace que al compilar y se llame a la función
se ejecute la función de la clase hijo la cual como se dijo comparte nombre con la función pero de la superclase la cual puede hacer otra cosa.*/
using System;
class HelloWorld
{
  static void Main()
  {
    //Creamos un objeto por cada clase
    Mamifero ser_vivo = new Mamifero();
    Humamo Jose = new Humamo();
    Perro Firulais = new Perro();
    
    /*Creamos un arreglo de tipo Mamifero llamado 'arreglo_mamiferos' el cual un arreglo es considerado tambien un objeto, por eso se le
    pone 'new' y luego otra vez de que tipo (Los corchetes significa que creamos un arreglo) y seguido de llaves las cuales en este caso
    ponemos los valores ya predefinidos dentro del arreglo*/
    Mamifero[] arreglo_mamiferos = new Mamifero[]{ser_vivo, Jose, Firulais};
    
    /*'foreach' sirve para iterar por un arreglo el cual a diferencia de un for en el for pones hasta cuando el cual si no calculas bien
    cuantos espacios tiene el arreglo saldrá un error index out of range y foreach sirve para iterar por todos los elementos dentro del arreglo
    sin tener que especificar de cuantos espacios es.*/
    foreach(Mamifero i in arreglo_mamiferos)
    {
        //La i representa cada elemento por que se itera a cada vuelta seguido de un punto y la función 'lactancia' de cada objeto
        i.lactancia();
        /*Como vemos en los parentesis del foreach ponemos de que tipo queremos iterar y ponemos de una variable de tipo 'Mamifero' seguido de la i
        el cual es el iterador el cual tomará por cada vuelta el valor de un elemento del arreglo y luego 'in' seguido del arreglo que queremos iterar*/
    }
  }
}

/*EN LAS SIGUIENTES CLASES CREAMOS LA SUPERCLASE 'Mamifero' Y SUS SUBCLASES 'Humamo' Y 'Perro' LOS CUALES TODOS TIENEN EN COMÚN QUE TIENEN
UNA FUNCIÓN LLAMADA 'lactancia' LA CUAL ES DIFERENTE A LAS DEMÁS*/

class Mamifero
{
    //El 'virtual' quiere decir que se desea que se reemplaze esa función si se creó una función si tiene el mismo nombre en una clase hija  
    public virtual void lactancia()
    {
        Console.WriteLine("El mamifero es capaz de dar lactancia a sus críaz");
    }
}

class Humamo : Mamifero
{
    //El 'override' significa que sobreescribe a la función con el mismo nombre pero de la claase padre 'Mamifero'
    public override void lactancia()
    {
        Console.WriteLine("El humano solo tiene dos pechos");
    }
}

class Perro : Mamifero
{
    public override void lactancia()
    {
        Console.WriteLine("El perro tiene varios pechos");
    }
}
