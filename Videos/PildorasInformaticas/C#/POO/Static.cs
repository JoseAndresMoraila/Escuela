/*Static se usa para declarar una función o variable la cual no pertenece a un objeto en sí, sino a la clase ¿Qué quiere decir eso?... Cuando creas 
un objeto este hereda todos sus atributos y funciones de la clase que se creó los cuales al menos las variables toman una copia del valor predeterminado de un atributo 
de clase y se puede modificar su valor sin afectar el valor predeterminado de el atributo de la clase. Es decir que en vez de 
crear un objeto para acceder a una función o atributo estático solo hace falta primero poner el nombre de la clase seguido de un
punto y la función a llamar o el atributo el cual se va a cambiar o imprimir. Ejemplo: NombreClase.Funcion() o NombreClase.Atributo.
Y al cambiar un atributo estatico este cambia también su valor para todos los objetos en el cual se creó basado en la clase si es que 
se creó un objeto de la clase donde está la función estática pero como se dijo no se puede acceder a ella a través del objeto sino de la clase en sí.*/
using System;

class HelloWorld 
{
  static void Main() 
  {
    /*Queremos ver el valor de el campo estatico 'edad' el cual se consigue a través de una función getter estatica llamada
    'static_get_edad', esto quiere decir que al ser una función estática no hace falta crear un objeto para llamarlo porque de otro modo
    si se quiere crear un objeto para llamarlo obtendremos un error porque como se dijo algo estatico no pertenece a ninguna instancia/objeto
    sino a la clase en sí*/
    Console.WriteLine("Llamado a través de una función static: " + humano.static_get_edad());
    
    /*Creamos un objeto basado en la clase 'humano' para acceder al método getter NO estático llamado 'normal_get_edad' para poder
    ver su valor. Al ser un método NO estático y queremos llamarlo a través de la clase en la que se creó saldrá un error*/
    humano persona1 = new humano();
    Console.WriteLine("Llamado a través de un objeto creado: " + persona1.normal_get_edad());
    
    //Imprimimos y llamamos al método estatico getter llamado 'get_humanos' para obtener o ver el valor de el campo privado estatico 'contador'
    Console.WriteLine("Objetos humano creados: " + humano.get_humanos()); //Saldrá 1 ya que solamente hemos creado un objeto de tipo 'humano'
    
  }
}

//RECUERDA VER ESTO DE ABAJO PRIMERO PARA ENTENDER LO DE ARRIBA

class humano
{
    //Declaramos una variable privada estática, quiere decir que para acceder a ella no hace falta crear un objeto de tipo 'humano' porque nos dará un error
    private static int edad = 20;
    
    //Creamos una función estática para acceder al valor de edad sin tener que crear un objeto para llamarlo sino llamarlo directamente de la clase
    public static int static_get_edad() => edad;/*Si te fijas ese '=>' significa que es una función lambda, es decir, anónima y se
    usa en contextos donde solo se requiere una sola instrucción para hacer algo; en este caso solo se quiere retornar 'edad' por 
    lo que al ser anónima no hace falta poner return y es lo mismo que la función siguiente 'normal_get_edad' pero más corto*/
    
    //Debido que está función no es estática se tiene que crear un objeto para llamarlo
    public int normal_get_edad()
    {
        return edad;
    }
    
    /*A continuación creamos un campo privado estático en 0 el cual se irá aumentando en uno cada vez que se cree un objeto de tipo
    'humano' ya que al instanciar se llamará al constructor el cual aumentará el valor de 'contador'*/
    
    /*Al ser estática esta variable al crear un objeto no tomará una copia de 0 ya que por ser estatico no se hace una copia al objeto
    creado sino que 'contador' pertenece a la misma clase por lo que si aumenta su valor será un aumento que se verá reflejado en la clase.
    Es decir, con el ejemplo que se puso sirve por ejemplo para contar cuantos objetos de esta clase se han instanciado.*/
    private static int contador = 0;
    
    public humano()
    {
        contador++;
    }
    
    //Una función estática la cual se llamará para ver el valor de el campo estático 'contador'
    public static int get_humanos() => contador;
}
