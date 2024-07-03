package Ejercicio3;

public class PanelExterno {
    private Ascensor ascensor; // referencia al ascensor

    public PanelExterno(Ascensor ascensor) {
        this.ascensor = ascensor;
    }
    // llamar al ascensor
    public void llamarAscensor() {
        System.out.println("PANEL EXTERNO: el ascensor viene en camino");
        while (!ascensor.isParado()) {
            System.out.println("PANEL EXTERNO: el ascensor se esta moviendo ahora mismo");
        }
        System.out.println("PANEL EXTERNO: el ascensor ha llegado al piso " + ascensor.getPisoActual());
    }
}