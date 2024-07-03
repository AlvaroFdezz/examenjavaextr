package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        PanelInterno panelInterno = new PanelInterno(ascensor);
        PanelExterno[] panelesExternos = new PanelExterno[10]; // Suponiendo 10 pisos
        PanelControl panelControl = new PanelControl(ascensor);

        // inicializar paneles externos
        for (int i = 0; i < panelesExternos.length; i++) {
            panelesExternos[i] = new PanelExterno(ascensor);
        }

        // simulacion del ascensor
        panelInterno.moverA(3); // se presiona el boton para mover el ascensor al piso 3
        panelesExternos[2].llamarAscensor(); // el usuario en el piso 3 llama al ascensor
        panelControl.llamarAscensor(1); // el usuario en el panel de control llama al ascensor al piso 1
    }
}
