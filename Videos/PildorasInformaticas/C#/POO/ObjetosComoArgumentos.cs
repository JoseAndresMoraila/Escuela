/*A las funciones y constructores se les puede pasar además de datos primitivos como int, bool y otros tambien datos de tipo objeto
dentro de la función o constructor y si quieremos acceder/usar un atributo o función del parametro de tipo objeto pasado se puede.
En este ejemplo solo pasaremos argmentos de tipo objeto a funciones.*/

using System;

class HelloWorld 
{
  static void Main() 
  {
    //Creamos un objeto llamado 'persona1' basado en la clase 'humano'
    humano persona1 = new humano("Cafés", false, "Brasileño", 24);
    
    //Creamos un objeto de tipo 'clase_imprimir'
    clase_imprimir obj = new clase_imprimir();
    
    /*Accedemos a la función 'imprimir_info' de la clase mediante su objeto y le pasamos una variable de tipo objeto la cual se
    configuró que será de tipo 'humano', es decir, se le pasa como argumento un objeto de la clase 'humano'*/
    obj.imprimir_info(persona1);
    
    
    //Ahora pasaremos a persona1 como argumento a una función de la misma clase con la que se creó:
    persona1.mostrar_informacion(persona1);
  }
}

//RECUERDA LEER ESTO DE ABAJO PARA ENTENDER LO DE ARRIBA

class humano
{
    private string color_ojos;
    private bool vivo;
    private string nacionalidad;
    private int edad;
    
    //Suponiendo que ya has visto y sabes de constructores no daré una explicación de esto
    public humano(string color_ojos, bool vivo, string nacionalidad, int edad)
    {
        this.color_ojos = color_ojos;
        this.vivo = vivo;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    
    //Esta función getter get_info se hace para que sea llamada para acceder a los atributos del objeto basado en esta clase
    public void get_info()
    {
        Console.WriteLine($"Esto es mostrado desde el getter:\nColor de ojos: {color_ojos}.\nEstá vivo: {vivo}.\nNacionalidad: {nacionalidad}.\nEdad: {edad}");
    }
    
    
    /*Ahora creamos una función que también imprimirá un mensaje pero sin crear un método getter como el de antes, sino que 
    tomará un argumento de tipo objeto 'humano', es decir, la función tomará una variable de tipo objeto basado en la misma clase en
    la que está declarada la siguiente función, es decir, la 'humano'*/
    public void mostrar_informacion(humano Persona)
    {
        Console.WriteLine($"\nEsto es mostrado desde la función de la misma clase en la que se pasó el objeto como parámetro:\nColor de ojos: {this.color_ojos}");
    }   /*Podrá sonar confuso pero está función 'mostrar_informacion' recibe como argumento un objeto de tipo 'humano' y tanto esta
    función como el argumento pertenecen a la misma clase entonces no hace falta que sea un método getter ya que se puede usar this.
    para acceder a una variable/atributo del objeto pasado como argumento. 
    
    En cambio el método 'get_info' el cual también toma como argumento un objeto basado en esta clase pero 
    la diferencia está en que esa función está en otra clase y por eso ocupa un getter para acceder a sus atributos y funciones.*/
}

//Creamos una clase la cual
class clase_imprimir
{
    //Esta función tomará como argumento un dato de tipo 'humano', es decir, de tipo objeto basado en la clase homónima
    public void imprimir_info(humano Persona)
    {
        /*El argumento al ser de tipo objeto basado en la clase 'humano' se puede acceder a todas sus funciones y ámbitos/atributos
        públicas y get_info es una función de la clase humano*/
        Persona.get_info();
    }
}
