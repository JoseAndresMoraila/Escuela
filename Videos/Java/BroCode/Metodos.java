public class Metodos {
    public static void main(String[] args){
        // Los metodos sabemos que son bloques de código que son ejecutados hasta que son llamados

        String Name = "Gael"; //Creamos una variable de cadena de caracteres para pasarselo al metodo como parametro
        int Edad = 20;
        Saludo(Name, Edad); //Se le pudo poner directamente pero decidimos ponerlo en variable

        System.out.println("Aquí un ejemplo de suma, el primer parametro lo pondremos como 10 y el segundo como 15 y al compilar este será el resultado: ");
        int ResultadoSuma = MetodoSuma(10, 15); //El valor de retorno será guardado en una variable en 'main'
        System.out.println("La suma es igual a = "+ ResultadoSuma);
    }

    // AQUI ABAJO SE DECLARARON LOS METODOS LOS CUALES QUEDARON DENTRO DE LA CLASE PRINCIAPAL 'Metodos' PERO FUERA DEL METODO PRINCIPAL 'main'
    static void Saludo(String Nombre, int Age){ /* Se le tiene que poner static debido a que se esta llamando al metodo desde un metodo static el cual es
    'main' */
        System.out.println("Hola, buenas tardes "+ Nombre + " tienes "+ Age + " años.");

        /* Al configurar los parametros que recibirá nuestro metodo le tenemos que poner de que tipo y el nombre que nosotros queramos,
         no necesariamente tiene que ser el mismo nombre que la variable en el metodo 'main' */
    }

    //Creamos otro metodo pero que si retorne un valor y en este caso será un valor entero
    static int MetodoSuma(int Num1, int Num2){
        int Resultado;
        Resultado = Num1 + Num2;
        return Resultado; //Se retorna al metodo main o donde sea que se llame el metodo 'MetodoSuma' el valor al que le pusimos 'return' que en este caso es 'Resultado'
    }
}