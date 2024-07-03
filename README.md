## Estructura de Carpetas 📂

El espacio de trabajo contiene las siguientes carpetas y archivos:

- `src/`: Contiene los archivos fuente del proyecto 🗂️
- `lib/`: Mantenimiento de las dependencias externas 📚
- `bin/`: Carpeta por defecto para los archivos compilados y generados 🚀

# Monitoreo de Condiciones Ambientales en Jardín 🌿🌞

## Clase Sensor

La clase `Sensor` representa un sensor individual que monitorea una medida específica (como la temperatura, humedad, etc.) y puede estar conectado o desconectado. Aquí está su funcionalidad:

### Atributos:

- `conectado`: Indica si el sensor está conectado o no.
- `valorUmbral`: Define el umbral predefinido para activar una alarma.
- `valorActual`: Guarda la medida actual del sensor.

### Métodos:

- `Sensor(valorUmbral)`: Constructor que inicializa el sensor con un valor de umbral.
- `isConectado()`: Devuelve true si el sensor está conectado.
- `conectar()`: Conecta el sensor.
- `getValorActual()`: Devuelve el valor actual del sensor.
- `setValorActual(valorActual)`: Establece el valor actual del sensor.
- `detectar()`: Verifica si el valor actual del sensor supera el umbral.

## Clase SensorCompuesto

La clase `SensorCompuesto` es una subclase de `Sensor` que permite agrupar varios sensores individuales en un arreglo para evaluar su estado de manera conjunta. Aquí está su funcionalidad:

### Atributos:

- `sensores`: ArrayList que contiene los sensores individuales que componen este sensor compuesto.

### Métodos:

- `SensorCompuesto(valorUmbral)`: Constructor que inicializa el sensor compuesto con un valor de umbral.
- `agregarSensor(sensor)`: Agrega un sensor individual al arreglo.
- `calcularValorMedio()`: Calcula el valor medio de las medidas de los sensores individuales conectados.
- `detectar()`: Sobrescribe el método de la clase base `Sensor` para verificar si el valor medio de los sensores individuales supera el umbral.

## Clase SistemaAlarma

La clase `SistemaAlarma` administra el monitoreo continuo de los sensores individuales y compuestos para detectar condiciones anómalas y disparar una alarma si es necesario.

### Atributos:

- `sensores`: Arreglo que contiene tanto sensores individuales como compuestos.

### Métodos:

- `agregarSensor(sensor)`: Añade un sensor al sistema de alarma.
- `dispararAlarma()`: Verifica cada sensor en el sistema y dispara una alarma si se supera el umbral, mostrando el nombre del sensor.

# Simulación de Ascensor en Java 🏢🔼

Este proyecto simula el funcionamiento de un ascensor para la tala y mejora de árboles sin memoria dentro de las instalaciones de Green Garden. El sistema incluye diferentes tipos de paneles para controlar el ascensor desde distintas ubicaciones.

## Clases Principales 🛠️

### Clase Ascensor

La clase `Ascensor` modela el ascensor con los siguientes atributos:

- `parado`: indica si el ascensor está parado o en movimiento.
- `pisoActual`: número entero que representa el piso actual del ascensor.

#### Métodos

- `moverA(piso)`: simula el movimiento del ascensor al piso especificado.

### Clase PanelInterno

El `PanelInterno` permite controlar el ascensor desde dentro con botones para cada piso.

#### Métodos

- `moverA(piso)`: llama al ascensor y muestra el piso actual.

### Clase PanelExterno

El `PanelExterno` está ubicado en cada piso y permite llamar al ascensor y ver su estado.

#### Métodos

- `llamarAscensor()`: llama al ascensor y muestra cuando ha llegado al piso.

### Clase PanelControl

El `PanelControl` está fuera del ascensor y permite llamarlo desde cualquier piso.

#### Métodos

- `llamarAscensor(piso)`: llama al ascensor y muestra el piso actual.

## Uso de la Aplicación 🚀

La clase `Aplicacion` simula el funcionamiento del sistema:

- Se crea un ascensor y diferentes instancias de paneles internos, externos y de control.
- Se simulan llamadas y movimientos del ascensor mediante métodos de los paneles.

Este proyecto demuestra cómo implementar un sistema básico de ascensor en Java utilizando diferentes tipos de paneles para controlar su funcionamiento dentro de un edificio.

