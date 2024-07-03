package Ejercicio1;

import java.util.ArrayList; //importo la clase ArrayList

//clase sensor compuesto hereda de la clase sensor
public class SensorCompuesto extends Sensor{
    private ArrayList<Sensor> sensores;

    public SensorCompuesto(double valorUmbral) {
        super(valorUmbral);
        this.sensores = new ArrayList<>(); //inicializar la lista de sensores
    }
    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }
    //calcular el valor medio de los sensores conectados
    public double calcularValorMedio() {
        double suma = 0;
        int count = 0;
        for (Sensor sensor : sensores) {
            if (sensor.isConectado()) {
                suma += sensor.getValorActual();
                count++;
            }
        }
        return count > 0 ? suma / count : 0;
    }

    //verificar si el valor medio supera el umbral
    @Override
    public boolean detectar() {
        return calcularValorMedio() > getValorUmbral();
    }

    //verificar si el valor del sensor supera el umbral
    private double getValorUmbral() {
        return super.detectar() ? calcularValorMedio() : 0;
    }
}
