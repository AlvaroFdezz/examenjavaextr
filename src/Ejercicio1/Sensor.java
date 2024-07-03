package Ejercicio1;

public class Sensor {
    private boolean conectado;
    private double valor_umbral;
    private double valor_actual;
    //para inicialiar el valor del umbral
    public Sensor( double valor_umbral) {
        this.conectado = false; //por defecto el sensor esta desconectado
        this.valor_umbral = valor_umbral;
    }
    //verificar si el sensor esta conectado o desconectado
    public boolean isConectado() {
        return conectado;
    }
    public void conectar() {
        this.conectado = true;
    }
    //obtener el valor actual del sensor
    public double getValorActual() {
        return  valor_actual;
    }
    public void setValor_actual(double valor_actual) {
        this.valor_actual = valor_actual;
    }
    //verificar si el valor del sensor supera el umbral
    public boolean detectar() {
        return conectado && valor_actual > valor_umbral;
    }
}
