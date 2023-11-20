// 'CopiarObjetos.java' (Principal) & 'CopiarCarroObjeto' TRABAJAN JUNTOS
public class CopiarObjetos {
    public static void main(String[] args){
        /*Vamos a usar los codigos que se usaron en la carpeta de encapsulacion.

         En este caso se pueden copiar objetos si le ponemos por ejemplo Carro1 = Carro2 pero esto lo que hace es que copia su dirección de memoria y lo que queremos es
         que tengan los mismos valores pero diferente dirección de memoria */

        CopiarCarroObjeto Carro1 = new CopiarCarroObjeto("Volswagen", "Vento", 2019); //SI tienes un IDE te puedes fijar que cuando se usa encapsulación no sale en que variable estás guardando los datos al crear un objeto como si pasa cuando no hay encapsulación
        CopiarCarroObjeto Carro2 = new CopiarCarroObjeto("Nissan", "Sentra", 2016); //Le vamos a cambiar los datos

        Carro2.Copiar(Carro1);

        System.out.println("La dirección de memoria del objeto 'Carro1' es: " + Carro1 + "\nY sus atributos son:");
        System.out.println("Marca: " + Carro1.getMarca() + "\nModelo: " + Carro1.getModelo() + "\nY su año: " + Carro1.getYear());
        System.out.println();
        System.out.println("La dirección de memoria del objeto 'Carro2' es: " + Carro2 + "\nY sus atributos son:");
        System.out.println("Marca: " + Carro2.getMarca() + "\nModelo: " + Carro2.getModelo() + "\nY su año: " + Carro2.getYear());
        System.out.println();

        //Tambien se puede poner como parametro de un constructor multiple el objeto que queremos copiar sin necesidad de hacer lo que se hizo en la línea 10 y 12, así hacerlo directamente al crear un objeto:
        CopiarCarroObjeto Carro3 = new CopiarCarroObjeto(Carro1);

        System.out.println("La dirección de memoria del objeto 'Carro3' es: " + Carro3 + "\nY sus atributos son:");
        System.out.println("Marca: " + Carro3.getMarca() + "\nModelo: " + Carro3.getModelo() + "\nY su año: " + Carro3.getYear());
    }
}
