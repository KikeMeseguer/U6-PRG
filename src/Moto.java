public class Moto extends Vehiculo implements Caracteristicas {
    private int cc;

    public Moto(int cc) {
        this.cc = cc;
        ruedas = 2;
    }

    public boolean tipo() {
        return cc >= 125;
    }

    protected boolean arrancar() {
        return aceleracion > 0;
    }

    @Override
    public void conducir() {
        System.out.println("Velocidad: " + velocidad);
    }

    @Override
    public void frenar() {
        velocidad = 0;
    }
}
