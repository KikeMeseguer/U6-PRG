//Que hereda
//Públicos y protegidos
//Puede añadir miembros
//Puede sobreescribir métodos
//super para acceder a método o atributo de la clase base oculto para clase derivada
//final para evitar que un método de la clase base sea modificado en la clase derivada

public class Main {
    public static void tipo(Vehiculo vehiculo) {
        if(vehiculo.ruedas == 2)
            System.out.println("Moto");
        else
            System.out.println("Coche");
    }

    public static void main(String[] args) {
//        Vehiculo vehiculo1 = new Vehiculo(80,10);
        Coche vehiculo1 = new Coche(3,4,4);
        Sedan vehiculo2 = new Sedan(100, 6, 4, "Opel" );
        Moto vehiculo3 = new Moto(1000);

        //Coche
        System.out.println("\nMetodo movimiento de la clase Vehiculo usado en la clase Coche (heredado)");
        vehiculo1.movimiento(60);

        System.out.println("\nMetodo bocina de la clase Coche");
        vehiculo1.bocina();

        //Sedan
        System.out.println("\n\nMetodo movimiento de la clase Sedan (sobrecargado)");
        vehiculo2.movimiento(60, 1000);

        System.out.println("\nMétodo bocina de la clase Sedan (sobrescrito)");
        vehiculo2.bocina();

        System.out.println("\nMétodo datos de la clase Sedan");
        vehiculo2.datos();

        System.out.println("\n\nMétodo estático para un objeto de clase Vehiculo");
        tipo(vehiculo2);    //Tipo de objeto de parámetro

        System.out.println("\n\nDownCasting");
        vehiculo1 = new Sedan(120, 8, 5, "Ford");
        if (vehiculo1 instanceof Sedan) {   //Comprueba que las clases sean de tipos compatibles
            ((Sedan)vehiculo1).datos(); //DownCasting
        }

        System.out.println("\n\nMétodos de la interface");
        vehiculo3.frenar();
        vehiculo3.conducir();

        System.out.println("\n\nPolimorfismo");
        Caracteristicas[] array = new Caracteristicas[3];
        array[0] = new Coche(3);
        array[1] = new Moto(45);
        array[2] = new Sedan(140, 12, 4, "Audi");

        for (int i = 0; i < 3; i++) {
            array[i].conducir();
            System.out.println();
        }
    }
}