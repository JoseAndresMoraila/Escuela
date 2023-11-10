public class ForEach{
    public static void main(String[] args){
        /* For-each  facilita la iteración a través de una colección de elementos, como un array, una lista o una estructura de datos
         iterable. La principal ventaja del bucle "for-each" es que simplifica la sintaxis y reduce la probabilidad de errores al
          recorrer una colección.
        En Java, el bucle "for-each" se utiliza para iterar a través de elementos de una colección sin necesidad de un índice y
        proporciona una forma más limpia y concisa de recorrer una lista de elementos. */

        String[] Animales = {"Perro", "Gato", "Pajaro", "Chango"};

        for(String i : Animales){
            System.out.println(i);
            /* -La parte String i declara una variable llamada "i" de tipo String. Esto significa que "i" tomará el valor de cada
            elemento del array "Animales" en cada iteración.

            -La parte : Animales indica que estás iterando a través del array "Animales". En cada iteración, "i" toma el valor del
            siguiente elemento en el array. */
        }
    }
}