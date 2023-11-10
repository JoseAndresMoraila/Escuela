import java.util.Random;
public class DadoVariableScope { //'DadoVariableScope.java' SE USA EN EL ARCHIVO 'VariableScope.java'

    Random Aleatorio; //Declaramos una variable llamada 'Aleatorio' de tipo 'Random'
    int Numero; //Se declararon estas variables fueras del constructor que es reconocido como metodo para que las variables puedan ser usadas en toda la clase
    DadoVariableScope(){ //Creamos el constructor con el mismo nombre que la clase (Los constructores son tomados como metodos)
        Aleatorio = new Random(); /*Lo que se hace es que primero se crea la variable tipo 'Random' en la línea 4 y en esta línea se le asigna un valor
        creando un objeto reservando espacio en memoria*/
        Girar(); //Hace que el metodo 'Girar()' se ejecute automaticamente cuando se declare un objeto de esta clase
    }

    void Girar(){ //Creamos un metodo que va a girar el dado
        Numero = Aleatorio.nextInt(6)+1; /* Del objeto 'Aleatorio' que está basado en la clase 'Random' se llama al método
        '.nextInt' que generará un número aleatorio del 0 al 5, pero se le pone '+1' para que se recorra un lugar y sea del 1 al 6.
         Luego ese número generado se guarda en la variable global 'Numero'*/

        System.out.println(Numero); //Se imprime el número generado
    }
}