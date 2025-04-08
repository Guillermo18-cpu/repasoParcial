package repasoparcial;

public class VehiculoAcuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("Viento muy fuerte, no se recomienda navegar.");
            velocidadActual = 0;
        } else if (velocidadViento < 10) {
            System.out.println("Viento muy débil, no se recomienda navegar.");
        } else {
            System.out.println("Viento adecuado para navegar.");
        }
    }
}
