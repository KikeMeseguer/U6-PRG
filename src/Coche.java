public class Coche extends Vehiculo implements Caracteristicas {
    private int puertas;

    public Coche(int puertas) {
        this.puertas = puertas;
        ruedas = 4;
    }

    public Coche(float velocidad, float aceleracion, int puertas) {
        super(velocidad, aceleracion);  //Constructor padre
        this.puertas = puertas;
        ruedas = 4;
    }

    public void bocina() {
        System.out.println("Beep, beep!");
    }

    @Override
    protected boolean arrancar() {
        return velocidad != 0;
    }

    @Override
    public void conducir() {
        System.out.println("Velocidad: " + velocidad + "\nConsumo: " + consumo);
    }

    @Override
    public void frenar() {
        velocidad = 0;
    }
}
