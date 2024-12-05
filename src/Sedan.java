public class Sedan extends Coche{     //final hace que la clase Sedan no pueda heredar a otra
    private String marca;

    public Sedan(float velocidad, float aceleracion, int puertas, String marca) {
        super(velocidad, aceleracion, puertas); //Constructor padre
        this.marca = marca;
    }

    public void bocina() {
        System.out.println("piiiii!");
    }

    public void movimiento(int tiempo, float posIni) {
        System.out.println("Desplazamiento: " + (posIni + velocidad * tiempo + (aceleracion * tiempo * tiempo)/2));
    }

    public void datos() {
        System.out.println("Marca: " + marca + "\nPuertas: " + 4 + "\nVelocidad: " + super.velocidad + "\nAceleración: " + super.aceleracion);
    }
}
