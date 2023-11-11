public class StaticKeyword{
    public static void main(String[] args){
        /* La palabra clase 'static' sirve para señalar que solo hay una copia de una variable o metodo y que puede ser compartida sin
         que haya varias copias de esa variable de clase sino que interactue como una sola cuando se cree un nuevo objeto basado en la clase.
         Si no entiendes aquí te explico:*/

        Amigos Compa1 = new Amigos("Gael"); //Dentro del constructor pusimos que 'NumeroDeAmigos' se incremente de uno en uno al crear un nuevo objeto basado en esa clase
        Amigos Compa2 = new Amigos("Bryan"); //Al crear otro objeto 'NumeroDeAmigos' ahora vale 2. Todo eso se logra poniendo 'static' antes del tipo de dato.
        Amigos Compa3 = new Amigos("Rigoberto");//Si no tuviera 'static' la variable no se compartiría en cada nuevo objeto creado, sino que siempre sería uno porque solo lo reconocería como un solo objeto.

        System.out.println(Amigos.NumeroDeAmigos); /*Si queremos ver el valor de la variable imprimimos y ponemos el nombre de la clase que en este caso es 'Amigos' seguido de
        un punto y el nombre de la variable de la cual queremos ser su valor*/

        Amigos.MostrarNumeroAmigos(); /* Se pone el nombre de la clase de la cual queremos llamar a un método */
    }

    static public class Amigos{
        String Nombre;
        static int NumeroDeAmigos; //Es decir 'NumeroDeAmigos' actuará como una variable compartida cada que se cree un nuevo objeto
        Amigos(String Nombre){
            this.Nombre = Nombre;
            NumeroDeAmigos++;
        }

        static void MostrarNumeroAmigos(){ /* A los métodos también se les puede poner 'static' y se usan en estos casos:

        - Pertenencia a la Clase: Un método estático pertenece a la clase en lugar de a los objetos individuales de la clase.

        - Acceso Directo: Puedes llamar a un método estático directamente desde la clase sin necesidad de crear una instancia de la clase. Ejemplo: 'Math.round()'

        - Acceso a Variables Estáticas: Puede acceder directamente a variables estáticas de la clase, pero no a variables de instancia.

        Ejemplo:
        public class Ejemplo {
        static int contador = 0;

        static void incrementarContador() {
        contador++;
            }
        }
        Ejemplo.incrementarContador(); */

            System.out.println("Este mensaje es a través de un método y tienes " + NumeroDeAmigos + " amigos"); /* Al llamarse a este metodo se hará la acción de imprimir este mensaje */
        }
    }
}
/* No hay que olvidarnos de las 'static' clases, aquí están los casos que se pueden usar además de cuando se crea en el mismo archivo principal:

- Pertenencia a la Clase: Una clase estática es una clase que no puede instanciarse. Todos sus miembros deben ser estáticos. (Es decir, no se pueden crear objetos de esa clase): Cuando se habla de que una clase
 es estática, se refiere a una clase interna estática, es decir, una clase estática dentro de otra clase. Si una clase estática está dentro del archivo principal (por ejemplo, dentro de la clase Main), sí se
 pueden crear instancias de esa clase estática incluso si es interna. Sin embargo, si la clase estática está fuera del archivo principal y está anidada en otra clase, no se puede instanciar directamente.

- No se Pueden Crear Instancias: No puedes crear objetos de una clase estática utilizando el operador 'new'.

- Acceso a Métodos y Variables Estáticas: Puedes acceder directamente a los métodos y variables estáticas de una clase estática sin necesidad de crear una instancia.

Ejemplo:
public class Utilidades {

    static class Matematicas {
        static int sumar(int a, int b) {
            return a + b;
        }
    }
}
int resultado = Utilidades.Matematicas.sumar(5, 3); */