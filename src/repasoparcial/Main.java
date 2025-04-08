package repasoparcial;
public class Main {
    public static void main(String[] args) {
        VehiculoTerrestre camioneta = new VehiculoTerrestre(20, 120, 4, "civil");
        camioneta.acelerar(50);
        camioneta.frenar(10);
        camioneta.imprimir();
        System.out.println("Revoluciones motor: " + camioneta.calcularRevolucionesMotor(5, 3));

        System.out.println("-----");

        VehiculoAcuatico motoAcuatica = new VehiculoAcuatico(10, 80, "superficie", 2);
        motoAcuatica.acelerar(30);
        motoAcuatica.recomendarVelocidad(90); // Viento fuerte
        motoAcuatica.imprimir();
    }
}
