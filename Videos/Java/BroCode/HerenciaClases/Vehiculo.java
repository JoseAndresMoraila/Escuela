//DEBIDO A QUE ES HERENCIA VARIOS ARCHIVOS DEBEN ESTAR JUNTOS, EN ESTE CASO DEBEN ESTAR JUNTOS: 'HerenciaCLases.java'(Principal), 'Vehiculo.java', 'Bicicleta.java' & 'Carro.java' para funcionar
public class Vehiculo {
    double Velocidad;

    void Avanzar(){
        System.out.println("Este vehículo se está moviendo");
    }

    void Parar(){
        System.out.println("Este vehículo se ha parado");
    }
}
