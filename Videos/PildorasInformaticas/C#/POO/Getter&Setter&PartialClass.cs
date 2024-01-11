/*Getter y Setter son funciones de clases las cuales esas funciones nos permite establecer valores a sus atributos mediante la función
setter y obtener los valores de las variables/atributos mediante getter.
Un setter solo cambia el valor del atributo para el objeto al que se llama, no para otros objetos de la misma clase. Por lo tanto, 
si se desea cambiar el valor de un atributo para todos los objetos de la misma clase, se debe llamar al setter para cada objeto 
individualmente.

Hay que recordar que un setter se puede diferenciar de un constructor el cual el constructor establece valores de atributos iniciales al crear
un objeto mientras que un setter sirve para poder cambiarselos después al llamarlo*/

using System;

namespace Getter_Setter
{
    class Principal
    {
      static void Main()
      {
        //Creamos una variable de tipo objeto que es una instancia de la clase 'humano'
        humano persona1 = new humano();
        
        //Le asignamos valores mediante la función setter
        persona1.setHumano("Cafés", false, "Brasileño");
        
        //Ahora mediante un WriteLine podremos ver lo que la función getter nos da
        Console.WriteLine(persona1.getHumano());
      }
    }
    
    //PRIMERO VE ESTA CLASE PARA ENTENDER LA FUNCIÓN PRINCIPAL
     partial class humano
    {
        //Creamos las variables/atributos de clase sin ningún valor los cuales serán puestos un valor en la función setter
        private string color_ojos; //Es recomendable poner los accesos de los atributos en private y si se quiere modificar su valor que sea mediante un setter
        private bool vivo;
        private string nacionalidad;
        
        //Ahora creamos un método setter el cual se llamará después de crear un objeto de tipo 'humano' y se le pondrán sus valores correspondientes
        public void setHumano(string color_ojos, bool vivo, string nacionalidad)
        {
            //Como ya vimos en constructores el .this sirve para referirse a la variable de clase que tomará el mismo valor que el constructor
            this.color_ojos = color_ojos;
            this.vivo = vivo;
            this.nacionalidad = nacionalidad;
        }
    }
//---------------------------------------------------------------------------------------------------------------------------
/*El uso de partial class se debe a que se puede dividir una clase en trozos así no todas las funciones y atributos estan dentro
de un mismo pedazo. (Recuerda que los trozos deben tener el mismo nombre de clase pero antes va un partial)
Y funciona de la siguiente manera:

partial class Clase
{
    Primera parte de la clase
}

partial class Clase
{
    Segunda parte de la clase y pueden haber muchos más
}                                                                */
    partial class humano
    {
        
        //Creamos un getter el cual retornará un string con un mensaje indicando los valores:
        public string getHumano()
        {
            return $"Valores de atributos de este objeto:\nColor de ojos: {color_ojos}.\nEstá vivo: {vivo}.\nNacionalidad: {nacionalidad}.";
        }
    }
}

/*Si no le pones valores a un atributo que no tiene valor en un setter y primero llamas a un getter para ver sus valores obtendrás un
false en un bool ya que ese es su valor predeterminado, un "" es decir una cadena vacia en un string y un 0 en un entero ya que esos
son sus valores predeterminados si no se les ponen valores mediante un setter o un constructor.
Y como vivos en un setter es recomendable ponerle setNombreClase y getNombreClase a los setters y getter para saber que hacen*/
