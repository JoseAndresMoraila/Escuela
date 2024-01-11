/*Suponiendo que ya sabes lo basico en terminos generales de la programación como variables, bucles, condicionales y ese tipo de 
cosas, este segemento se hablará de terminos de C# el cual es muy parecido a Java pero con algunas variaciones*/

using System; /*using significa que importamos todas las clases de un namespace y esto es util ya que un namespace
evita las clases, funciones o variables aunque tengan el mismo nombre en un proyecto se usen llamando a la clase de
ese namespace sin que haya un error de nombres.

En otras palabras, un namespace es como una caja que contiene muchas clases relacionadas. Puede pensar en un namespace como una 
forma de agrupar clases relacionadas juntas. Cuando se crea una clase dentro de un namespace, se puede acceder a ella desde
cualquier lugar del código que tenga acceso al namespace. Para usar una clase de un namespace en otro archivo o proyecto, 
simplemente importe el namespace en el archivo o proyecto donde desea usar la clase.*/

//Creamos un namespace del cual habrán solamente una clase en el que explicaremos un try y catch
namespace tryCatch
{
    //La clase principal la cual contendrá la función principal
    class HelloWorld
    {
        //La función principal Main la cual todo codigo que esté dentro de aquí se ejecutará
        static void Main()
        {
        
            //Console es una clase del namespace System el cual se importó al principio de la clase y Write es una función de Console
            Console.Write("Ingrese un número: ");
            
            //Usamos try el cual primero intenta hacer algo y en caso que haya un error se pasa al catch
            try
            {
                /*En la siguiente línea usaremos ReadLine la cual recoge un input del usuario pero esta solamente toma input en forma de
                string, por lo que se le pone int.Parse() lo cual quiere decir que se pasa a entero lo puesto por el usuario y se guadra
                en la variable Num1*/
                int Num1 = int.Parse(Console.ReadLine());
                Console.WriteLine($"El mensaje que pusiste fue: {Num1}");
                /*Ese $ y {} son format strings lo cual no hace falta concatenar mediante '+' sino que dentro del mismo mensaje se
                puede poner el valor de una variable*/
            }
            /*Si el usuario no pone un número arroja un error de tipo FormatException el cual no se puso aquí donde solamente
            se puso Exception el cual es un manejador de errores más general pero se puede poner el error de Format y se puso ex
            (que puedes ponerle otro nombre )el cual es un objeto de tipo Exception el cual es opcional y es generado por el
            error que se puede declarar y puede servir para mediante su función Message decir que error hubo*/
            catch(Exception ex)
            {
                Console.WriteLine($"Eso no es un número, tipo de error: {ex.Message}");
            }
            //Finally pase lo que pase siempre se ejecutará en un try-catch
            finally
            {
                Console.WriteLine("Este mensaje haya un error o no siempre se ejecutará");
            }
        
        }
    }
}
