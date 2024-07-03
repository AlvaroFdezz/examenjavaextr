package Ejercicio3;

public class Ascensor {
    private boolean parado; // Indica si el ascensor se encuentra parado
    private int pisoActual; // Indica el piso actual

    public Ascensor() {
        this.parado = true; // el ascensor se encuentra parado en primera instancia
        this.pisoActual = 0; // suponiendo que el piso 0 es la planta baja o priera planta
    }

    public boolean isParado() {
        return parado; // devuelve el valor de la variable parado
    }

    public int getPisoActual() { // devuelve el valor de la variable pisoActual
        return pisoActual;
    }

    public void moverA(int piso) {
        parado = false;
        System.out.println("el ascensor se mueve al piso " + piso);
        // se simula el tiempo que tarda en moverse de un piso a otro
        try {
            Thread.sleep(Math.abs(piso - pisoActual) * 1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pisoActual = piso;
        parado = true;
        System.out.println("el ascensor llego al piso " + pisoActual);
    }
}
