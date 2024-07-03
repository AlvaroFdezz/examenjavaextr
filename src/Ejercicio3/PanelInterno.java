package Ejercicio3;

public class PanelInterno {
    private Ascensor ascensor; // referencia al ascensor

    public PanelInterno(Ascensor ascensor) {
        this.ascensor = ascensor;
    }
    // mover el ascensor
    public void moverA(int piso) {
        ascensor.moverA(piso);
        System.out.println("PANEL INTERNO: ascensor ahora en el piso " + ascensor.getPisoActual());
    }
}