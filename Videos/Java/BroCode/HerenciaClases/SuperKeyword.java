public class SuperKeyword {
    /* 'Super' se utiliza para referirse a miembros (variables o métodos) de la clase padre (superclase) desde una clase hija (subclase). Es decir, 'super' se usa en
    clases hijos para usar métodos o variables de su clase padre sin tener que copiar codigo*/

    public static void main(String[] args){
        Heroe Heroe1 = new Heroe("Batman", 50, "Dinero");

        System.out.println(Heroe1.Nombre);
        System.out.println(Heroe1.Edad);
        System.out.println(Heroe1.Poder);
        Heroe1.ImparteJusticia(); //Se está llamando a un metodo referenical en la clase 'Heroe' que en su interior hace referencia al metodo original que pertenece a la clase 'Persona' . Ir a línea 51
    }

    //PARA QUE NO SEAN VARIOS ARCHIVOS VAMOS A PONER TODAS LAS CLASES EN EL PRINCIPAL:

    //SUPERCLASE:
    static public class Persona{
        String Nombre;
        int Edad;

        Persona(String Nombre, int Edad){//Se hace un constructor el cual es para que al crear un objeto agregarle un valor diferente en cada uno
            this.Nombre = Nombre;
            this.Edad = Edad;
        }
        void Pelea(){ //Se crea un método para la superclase 'Persona'
            System.out.println("Esta persona pelea");
        }
    }

    //SUBCLASE:
    static public class Heroe extends Persona{
        String Poder;

        Heroe(String Nombrer, int Edad, String Poder){//Se hace un constructor
            super(Nombrer, Edad); /* La palabra clave 'super' se utiliza en el constructor de la clase 'Heroe' para llamar al constructor de la superclase 'Persona'.
            La llamada a 'super(Nombre, Edad)' se utiliza para inicializar los campos 'Nombre' y 'Edad' de la clase 'Persona'.

            Cuando una clase extiende otra (como 'Heroe' que extiende 'Persona'), la clase hija puede invocar el constructor de la clase padre utilizando super.
            Esto es útil para inicializar los campos heredados de la clase padre. */
            this.Poder = Poder;

            /* La palabra clave 'super' en Java puede usarse tanto para acceder a variables de superclase, metodos y para invocar el constructor de la superclase en una
            subclase. Te marcará error si por ejemplo cambias el tipo de dato de String a int en 'Nombre' en la superclase y en el constructor de la subclase está configurado
            para que 'Nombre' reciba un String por parte de 'Nombre' de la superclase.

            También marcará error si cambias el orden al poner 'Super' de como fueron declarados las variables en la superclase. Es decir, en la superclase 'Persona' está declarado primero
            'Nombre' como String y después 'Edad' como int, al usar 'super' en el constructor de la subclase 'Hereo' y primero pones 'Edad' te marcará el error de conversión de
            dato que int no ṕuede ser convertido a String debido a los parametros del constructor de la subclase*/

        }
        void ImparteJusticia(){//Se crea un método para la subclase 'Heroe'
            super.Pelea(); //Se usa 'super' seguido de esta vez un punto para referirse a un método llamado 'Pelea' que es originalmente de la superclase 'Persona'

            /* En la línea 11 se usó al objeto 'Heroe1' que está basado en esta subclase 'Heroe', y se llamó al metodo 'ImparteJusticia' que está llamando a su vez
            mediante 'super' al metodo 'Pelea' de la superclase 'Persona'*/
        }
    }
}