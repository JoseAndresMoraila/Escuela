public class CopiarCarroObjeto {
    private String Marca; // Solo esta clase puede acceder a estas variables
    private String Modelo;
    private int Year;

    //Hacemos un costructor:
    CopiarCarroObjeto(String Marca, String Modelo, int Year){
        this.setMarca(Marca);
        this.setModelo(Modelo);
        this.setYear(Year); /* Ya no hace falta poner 'this.Year = Year' sino que se usa el método setter y se le pasa como parametro el parametro del constructor
                                 para que en el metodo setter este lo defina como valor de la variable privada (En este caso ve a la línea 38 para ver como funciona)*/
    }

    // CREAMOS OTRO CONSTRUCTOR EN EL CUAL AL CREAR UNA INSTANCIA BASADO EN ESTA CLASE COMO TENDRÁ UN SOLO PARAMETRO SI SE LE PASA UN SOLO VALOR COMO PARAMETRO LO RECONOCERÁ EN ESTE PARAMETRO Y LO CREARÁ A PARTIR DE ESTE:
    CopiarCarroObjeto(CopiarCarroObjeto Objeto) {
        // EL TIPO DE DATO A RECOGER COMO PARÁMETRO SERÁ DE CLASE BASADA EN ESTA MISMA CLASE Y SE NOMBRÓ AL PARÁMETRO 'Objeto'

        this.Copiar(Objeto);
    /* AL CREARSE UN OBJETO NUEVO DONDE SE LE PONE UN SOLO PARÁMETRO, ESE PARÁMETRO, COMO SE DIJO, SERÁ UN OBJETO BASADO EN ESTA MISMA CLASE. LUEGO SE USA 'this.' PARA
       USAR EL MÉTODO 'Copiar' Y PASARLE COMO PARÁMETRO EL OBJETO QUE QUEREMOS COPIAR. EL MÉTODO 'Copiar' SE EXPLICA COMO FUNCIONA EN LA LÍNEA 50 */
    }



    // VAMOS A USAR GATTERS LOS CUALES HARÁN QUE AUNQUE LAS VARIABLES DE CLASE SEAN PRIVADAS USAREMOS UN GATTER PARA COMO TAL LA VARIABLE NO SEA VISIBLE SINO SU GATTER MEDIANTE UN MÉTODO:
    public String getMarca(){ //Devuelve el valor con el que se declaró el objeto en ese parametro sin mostrar como tal la variable privada de clase
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getYear(){ //Devuelve el valor con el que se declaró el objeto en ese parametro sin mostrar como tal la variable privada de clase
        return Year;
    }

    // VAMOS A CREAR UN 'SETTER' PARA CAMBIAR EL VALOR DE UNA VARIABLE MEDIANTE UN METODO VOID:
    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    public void setYear(int Year){ /* En la línea 11 se le pasó como parametro a este método SETTER lo que se pone como parametro en el constructor para posteriormente
                                           en este método hacer que lo que se le pasó como parametro convertirlo en el valor de la variable privada*/
        this.Year = Year;
    }

    //VAMOS A CREAR UN MÉTODO QUE COPIE LOS VALORES DE UN OBJETO Y LOS PEGUE EN OTRO:
    public void Copiar(CopiarCarroObjeto Objeto){ /*El método recibirá parametros del tipo de dato clase que será esta misma ya que el objeto pasado como parametro está basado en esta misma clase, es decir
    se pone en tipo de dato a recibir la clase en el que está basado el objeto que queremos copiar y como nombre al parametro le pusimos 'Objeto' */

        this.setMarca(Objeto.getMarca());/* Ve a línea 28 para ver como trabaja el método 'setMarca'. El metodo 'setMarca' recibe como parametro un String para ponerselo al
        a la variable del objeto 'Marca' pero en este caso funciona de esta manera:

        1.- Objeto.getMarca(): Este llamado al método 'getMarca()' obtiene el valor de la propiedad 'Marca' del parametro 'Objeto' el cual se le pasó un objeto basado en esta misma clase
        con multiples valores. (Ver línea 15)

        2.- this.setMarca(Objeto.getMarca()): Utiliza el método setter 'setMarca(String Marca)' de la instancia actual (representada por 'this') para establecer la propiedad
        'Marca' con el valor obtenido del parametro 'Objeto' el cual como ya se dijo se le pasa como parametro un objeto basado en esta misma clase. (Ver línea 28) */

        //Aplica tambien para estos en sus respectivos metodos
        this.setModelo(Objeto.getModelo());
        setYear(Objeto.getYear());//realmente no hace falta poner this

        /*En conclusión es que si queremos copiar los datos del carro1 en el carro2 se pone en el main 'Carro2.Copiar(Carro1)' donde en el metodo copiar lo que hará será
         conseguir el valor de 'Marca', 'Modelo' y 'Year' del carro1(El que se pasó como parametro y que queremos copiar) para posteriormente
         'this.setMarca/Modelo/Year' se utiliza para indicar que estamos llamando al método 'setMarca/Modelo/Year' de la clase actual (Carro2) (el objeto en el que se está
         ejecutando el método 'Copiar' el cual es Carro2 que es donde queremos que los valores se peguen).*/
    }
}
