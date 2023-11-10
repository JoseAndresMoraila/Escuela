public class MetodosSobrecargados{
    public static void main(String[] args){
        /* Los metodos sobrecargados son aquellos metodos los cuales comparten el mismo nombre pero diferente parametros y eso los
         diferencia uno de otros */

        int Metodo1 = Suma(2, 2), Metodo2 = Suma(2, 2, 2), Metodo3 = Suma(2, 2, 2, 2);
        double Metodo4 = Suma(2.0, 2.0); //Para que sea reconocido como el metodo #4 se tiene que pasar parametros del tipo que se configuró debe obtener

        System.out.println(Metodo1);
        System.out.println(Metodo2);
        System.out.println(Metodo3);
        System.out.println(Metodo4);
    }
    static int Suma(int Num1, int Num2){
        System.out.println("Este es el metodo #1 el cual es 2+2");
        return Num1 + Num2;
    }

    static int Suma(int Num1, int Num2, int Num3){
        System.out.println("Este es el metodo #2 el cual es 2+2+2");
        return Num1 + Num2 + Num3;
    }

    static int Suma(int Num1, int Num2, int Num3, int Num4){
        System.out.println("Este es el metodo #3 el cual es 2+2+2+2");
        return Num1 + Num2 + Num3 + Num4;
    }

    static double Suma(double Num1, double Num2){ //Se cambió el tipo de retorno a double
        System.out.println("Este es el metodo #4 el cual es 2.0 + 2.0");
        return Num1 + Num2;
    }
}