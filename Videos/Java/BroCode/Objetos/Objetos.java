public class Objetos { //EL ARCHIVO 'Carros.java' ES IMPORTANTE PARA QUE ESTE FUNCIONE
    public static void main(String[] args){
        /* Java es un lenguaje encaminado a programación orientada objetos desde que para ejecutar el programa se tiene que llevar a
         cabo crear la clase y metodo principal

         Hay que recordar que al crear una clase es como crear los planos de una casa, puedes ponerle que acciones hará y que caracteristicas
         tendrá, en otras palabras piensa en un objeto de la vida real como un carro, además de tener caracteristicas como el color, modelo,
         año; también tiene funcionalidades como avanzar, pararse, retroceder. De eso trata la programación orienrada a objetos
         Una clase puede tener muchos metodos que serían las acciones que tendrá el objeto creado a traves de la clase cuando se llegue a llamar.
         Y además tiene atributos que serían sus caracteristicas. */

        //Debido a que esta en la misma carpeta la otra clase no hace falta poner package ni import

        Carros miCarro1 = new Carros(); /* En 'new Carros()' esta parte crea una nueva instancia (objeto) de la clase Carros. Cuando
        utilizas la palabra clave 'new', estás solicitando a Java que reserve memoria y cree un nuevo objeto de la clase especificada.

        En 'Carros miCarro' defines una variable llamada miCarro de tipo Carros que se utilizará para hacer referencia al objeto que se
         crea en el paso anterior.

         El operador de asignación ( = ) se utiliza para asignar el objeto recién creado a la variable miCarro.
        */

        System.out.println(miCarro1.Marca); /*Imprimimos del objeto creado que se llama 'miCarro' lo que hay en su atributo 'Marca' el
        cual se pone "Nissan" que es como está configurado y para hacer eso ponemos primero el nombre del objeto seguido de un punto y el
         nombre del atributo. */

        System.out.println(miCarro1.Modelo);

        miCarro1.Frenar(); //Como esa acción ya tiene impresión de mensaje solo hace falta poner el nombre del objeto y el metodo

        //Tambien podemos crear más objetos a partir de la misma clase:
        Carros miCarro2 = new Carros();

        miCarro2.Conducir();
        //Aunque no queremos que todos los carros sean iguales por lo que en otro archivo veremos como se hace un carro unico que son llamados constructores
        }
    }
/* Recuerda que se puede hacer una clase fuera de la clase principal o se puede importar de otro archivo.
 En este caso importaremos de una clase llamada 'Carros'*/