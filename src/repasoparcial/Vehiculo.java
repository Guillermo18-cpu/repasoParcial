
package repasoparcial;


public abstract class Vehiculo {
    
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void imprimir(){
        
    }
    
    public abstract void acelerar (int velocidad);
        
    public abstract void frenar (int velocidad);
    
}
        

