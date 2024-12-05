public abstract class Vehiculo {
    protected float velocidad;
    protected float aceleracion;
    protected int ruedas;

    protected Vehiculo() {
    }

    protected Vehiculo(float velocidad, float aceleracion) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
    }

    protected void movimiento(int tiempo) {
        velocidad += aceleracion * tiempo;
        System.out.println("Velocidad: " + velocidad);
    }

    protected abstract boolean arrancar();  //Método abstracto
}