import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        //PRIMER EJEMPLO:
        System.out.println("PRIMER EJEMPLO:");
        String[] Carros = {"Matiz", "Mustang", "Chevy"}; /* Para crear un arreglo con los datos ya hechos se hace de esa manera:
         se pone el tipo de dato seguido de unos corchetes para indicar que será un arreglo, luego el nombre del arreglo y con llaves los valores*/
        System.out.println(Carros[1]+"\n");

        //SEGUNDO EJEMPLO:
        System.out.println("SEGUNDO EJEMPLO:");
        //Pero si queremos asignarle un espacio ya definido lo hacemos de la siguiente manera:
        int[] Numeros = new int[4]; /* Declaramos primero el tipo de dato seguido de corchetes lo cual significa que será un arreglo y
         luego el nombre, después new que significa que vamos a crear una nueva instancia de una clase, y por último el tipo de dato
         otra vez y el número de espacios*/
        Numeros[0]=5;
        Numeros[1]=10;
        Numeros[2]=15;
        Numeros[3]=20;
        for(int i=0; i<Numeros.length; i++){
            System.out.println(Numeros[i]);
        }
        System.out.println("\n");

        //TERCER EJEMPLO:
        System.out.println("TERCER EJEMPLO:");
        //Ahora le pediremos al usuario que diga de cuantos espacios quiere el arreglo y el valor en cada espacio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cuantos espacios quieres el arreglo: ");
        int Tamano=scanner.nextInt();
        scanner.nextLine(); /* scanner leerá toda la línea incluyendo el de nueva linea por lo que si por ejemplo pones 3, como nextInt
        solo lee números el de nueva linea "\n" cuenta como caracter por lo que saldrá sobrando y será enviado a un scanner que acepte
        caracteres y aunque no quieras no te dejará escribir porque esa variable ya tiene valor de salto de linea, por lo que para evitar
        eso pondremos un scanner que acepte Strings y que no se guarde en ningun lado*/

        System.out.println("Ingrese " + Tamano + " palabras:");

        String[] Palabras=new String[Tamano];

        for (int j = 0; j < Tamano; j++) {
            Palabras[j]=scanner.nextLine();
        }
        System.out.println("Lo que pusiste fue: ");
        for (int k = 0; k < Tamano; k++) {
            System.out.println("Valor " + k + ": " + Palabras[k]);
        }
    }
}