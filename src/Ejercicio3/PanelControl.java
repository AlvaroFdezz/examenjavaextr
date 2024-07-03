package Ejercicio3;

public class PanelControl {
    private Ascensor ascensor;

    public PanelControl(Ascensor ascensor) {
        this.ascensor = ascensor;
    }
    // llamar al ascensor
    public void llamarAscensor(int piso) {
        ascensor.moverA(piso);
        System.out.println("PANEL DE CONTROL: ascensor se encuentra en el piso " + ascensor.getPisoActual());
    }
}