// 'Encapsulacion.java' & 'CarroEncapsulacion.java' TRABAJAN JUNTAS
public class Encapsulacion {
    public static void main(String[] args){
        /* La encapsulación se refiere a la idea de ocultar los detalles internos de la implementación de un objeto y exponer solo lo que es necesario para interactuar
        con él. Esto se logra mediante el uso de modificadores de acceso (como private, public, protected, entre otros) y la creación de métodos de acceso (getters los cuales
         son metodos y funcionan para mostrar el valor de una variable privada sin mostrar la variable en si & los setters los cuales modifican el valor de una variable privada).*/

        CarroEncapsulacion Carro1 = new CarroEncapsulacion("Chevrolet", "Camaro", 2020); //Se crea un objeto/instancia
        // System.out.println(Carro1.Marca); Debido a que sus variable son privadas y no se pueden ver desde fuera no podremos usarlas

        //En vez de eso llamaremos a un método gatter que se declaró en la línea 15 en la clase 'Carro.java':
        System.out.println("La marca del carro es: " + Carro1.getMarca()); // Se imprime lo que se puso en el metodo 'getMarca' que hay en la clase 'CarroEncapsulacion'

        System.out.println("El carro es un modelo: " + Carro1.getModelo()); // Se imprime lo que se puso en el metodo 'getModelo' que hay en la clase 'CarroEncapsulacion'

        System.out.println("Su año de lanzamiento es: " + Carro1.getYear()); // Se imprime lo que se puso en el metodo 'getYear' que hay en la clase 'CarroEncapsulacion'

        Carro1.setYear(2000); /* Se cambió el valor de la variable privada de este objeto.
        Lo que se hizo fue que se pasó como parametro el valor int '2000' al método SETTER llamado 'setYear' y lo que este metodo hace adentro es que el parametro que se le
        pasó lo define que es igual a la variable privada que se declaró en la clase (Para comprender mejor ve a la clase 'CarroENcapsulacion')
        (CABE ACLARAR QUE UN SETTER SOLAMENTE SIRVE PARA ACTUALIZAR EL VALOR DE UNA VARIABLE PRIVADA, NO PARA DECLARAR UN VALOR YA QUE ESO YA SE HIZO AL CREAR EL OBJETO)*/

        System.out.println("Ahora el año del Mustang es del año: " + Carro1.getYear());
    }
}
