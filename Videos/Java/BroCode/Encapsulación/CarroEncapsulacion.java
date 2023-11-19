// 'Encapsulacion.java' & 'CarroEncapsulacion.java' TRABAJAN JUNTAS
public class CarroEncapsulacion {
    private String Marca; // Solo esta clase puede acceder a estas variables
    private String Modelo;
    private int Year;

    //Hacemos un costructor:
    CarroEncapsulacion(String Marca, String Modelo, int Year){
        this.setMarca(Marca);
        this.setModelo(Modelo);
        this.setYear(Year); /* Ya no hace falta poner 'this.Year = Year' sino que se usa el método setter y se le pasa como parametro el parametro del constructor
                                 para que en el metodo setter este lo defina como valor de la variable privada (En este caso ve a la línea 38 para ver como funciona)*/
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