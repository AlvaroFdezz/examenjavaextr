package Ejercicio1;

import java.util.ArrayList;

public class SistemaAlarma {
    private ArrayList<Sensor> sensores;

    public SistemaAlarma() {
        //Inicializar la lista de sensores
        this.sensores = new ArrayList<>();
    }
    //agregar un sensor
    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }
    //verificar si el valor del sensor supera el umbral
    public void dispararAlarma() {
        for (Sensor sensor : sensores)
            if (sensor.detectar()) {
            System.out.println("PRECAUCION! SE SUPERO EL UMBRAL: " + sensor.getValorActual());
            break; //paramos la verificación de los sensores si se activa la alarma
        }
    }
}