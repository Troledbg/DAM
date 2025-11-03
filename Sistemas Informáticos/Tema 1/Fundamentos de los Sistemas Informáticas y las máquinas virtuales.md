# Placa Base

Es el circuito principal de todo el Sistema Informático. Conecta todos los componentes hardware
Estos componentes pueden estar:
- Integrados:
	- Chipset
	- BIOS
	- Wifi
	- Tarjeta de Sonido
	- ...
- Conectados Mediante:
	- Sockets (CPU)
	- Slots (RAM)
	- Buses de expansión (Tarjeta Gráfica)
	- Conectores Internos (Disco SSD)
	- Conectores Externos (Pendrive)
	- ...

Las Placas Base se rigen por factores de forma estandarizados a nivel mundial, que determinan las medidas y la disposición de sus componenets (conectores, buses de expansión,...)

|                                                                                  E-ATX                                                                                  |                                                                        SSI CEB                                                                         |                                                SSI EEB                                                 |
| :---------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------: |
| Es común en placas base de escritorio, también se utiliza en servidores de alta gama. Ofrece espacio adicional para características avanzadas y componentes adicionales | Es específico para servidores y más grande que el ATX estándar. Proporciona espacio adicional para múltiples CPU, memoria y unidades de almacenamiento | Similar a SSI CEB pero más grande. Se utiliza en servidores de alto rendimiento y torres de servidores |

# Chipset

Principal circuito integrado y encapsulado (microchip) en la placa base, cuya función principal es la de gestionar ciertos componentes en la placa base.
Interviene en la mayoría de los procesos del sistema y determina:
- El procesador que se puede instalar
- La memoria RAM
- La cantidad de buses disponibles para ranuras de expansión
- Puertos USB
- La cantidad y tipos de conectores internos y externos
- La capacidad de overclocking
- ...

> [!NOTE] Principales funciones
> - Coordinar la asociación entre los componentes de gran capacidad de transferencia de información o procesamiento, como procesador, memoria o buses PCI Express
> - Actuar de concentrador de componentes de entrada y salida, así como de dispositivos de baja velocidad

# SOCKET (Zócalo PROCESADOR)

Es el lugar donde se instala del procesador en la placa base. Existen principalmente dos tipos:
- **ZIF (Zero Insertion Force)**: Consiste en una estructura de plástico con pequeños agujeros (conectores), donde se insertan las patillas del procesador. Gracias a un sistema mecánico permite introducir el procesador sin necesidad de fuerza alguna, por medio una palanca en el lateral
  
- **LGA (Land Grid Array)**: Dispone de una base con contactos que se comunican con la placa base, sobre la que cierra una estructura de metal con forma de ventana. El procesador dispone de contactos y no patillas, por lo que establece la comunicación por presión gracias a dicha estructura. La instalación en este socket es sencilla, con mucho menos riesgo de dañar el microprocesador. Permite mayor cantidad de contactos

# SLOTS (Ranuras MEMORIA RAM)

Son los espacios destinados a alojar los módulos de memoria RAM. Disponen de una marca para alinear el módulo correctamente, así como retenedores laterales para aumentar la sujeción.
Las Placas Base disponen de tecnología Dual, Triple, o Quad Channel, de esta manera se consigue acceder a varios módulos simultáneamente, mejorando la velocidad de acceso a la RAM.
Para un óptimo rendimiento se deben instalar los módulos de memoria de idénticas características, sino, el controlador de memoria se ajusta a las velocidades, latencias o capacidades más bajas

# BUSES (Ranuras EXPANSIÓN)

### PCIe
Son los encargados de alojar las tarjetas de expansión para ampliar las características del equipo.
Existen diferentes tamaños atendiendo al número de lanes (x1, x4, x8, x16)
Cuanto mayor sea la versión del bus, mayor será la velocidad de transferencia (ancho de banda).
PCIe se implementa hasta con 16 lanes de datos. Cada línea despone de un ancho de banda de 2GB/s en su versión 4.0
![[Pasted image 20250915190624.png]]
Velocidades de transferencia atendiendo a la versión y carril
![[Pasted image 20250915190715.png]]
PCIe es compatible en todas sus versiones y lanes quedando limitado el ancho de banda a la versión inferior
Ejemplo: Podemos conectar una tarjeta PCIe x4 v3.0, en slot dedicado para
PCIe x16 v2.0. Su velocidad de transferencia será igual a la velocidad de la
versión 2.0, multiplicada por 4 (nº de lanes):

### M2
Son utilizados para ampliar o mejorar funciones dentro de un sistema informático, principalmente almacenamiento y comunicaciones de red
No tiene estándar de comunicaciones con la CPU o chipset propio, por tanto utiliza dependiendo del modelo de placa base, distintos estándares para comunicarse.
Actualmente, existen 3 tipos de estándares para conectores M.2:
- SATA
- PCI-Express
- USB
La velocidad dependerá de la comunicación que permita la placa base a través del chipset
Tipos de slots más comunes para M.2
- Tipo M: normalmente dedicado a dispositivos SSD con estándar PCIe x4
- Tipo M+B: dedicado a dispositivos SSD con estándar SATA III
- Tipo A+E: empleado en dispositivos para dispositivos de comunicaciones. Pueden utilizar los estándares PCIe x1, USB

> [!NOTE] Importante
> Aumentan las capacidades del equipo

# Conectores internos

Los conectores internos son puestos dedicados principalmente para:
- Conectar dispositivos de almacenamiento (discos duros, lectores de tarjetas, usb...)
- Conector la alimentación, que sirve para ofrecer diferentes niveles de tensión a los componentes de la placa para su correcto funcionamiento
- Conectar la refrigeración, encendido, reset, indicadores led...

**Interfaz SATA (Serial Advanced Technology Attachment)**
Es una interfaz de transferencia de datos en serie entre la placa base y algunos dispositivos de almacenamiento, como discos duros, lectores y grabadoras de CD/DVD, unidades de estado sólido u otros dispositivos de altas prestaciones

**Panel frontal**
La caja del equipo dispone de varios botones e indicadores led que se conectan a esstos conectores para transmitir acciones. Se suelen presentar por colores, detallando en la placa base la correspondencia con cada conector

**Ventilador CPU**
Estos conectores disponen de 4 pines para conectar el ventilador encargado de disipar el calor que produce el procesador durante su funcionamiento. La tensión que ofrece variará dependiendo la pendiente de temperatura generada

**Conectores USB Internos**
Encargados de conectar a través de un cable, los conectores USB distribuidos en la parte frontal o trasera de la caja de los equipos. Podemos encontrar diferentes velocidades de transferencia dependiendo de la versión del USB

**Conector 24 pines (ATX)**
Conector de la fuente de alimentación principal normalmente ubicado a lo largo del borde inferior derecho de la placa

**Conector 8 pines (EPS 8-pin)**
Conector que alimenta al procesador. El voltaje de alimentación de 12V, siendo el VRM el encargado de regular las diferentes tensiones del funcionamiento para los componentes.

**Conector 6 pines (ATX)**
Proporciona alimentación a las ranuras PCIe, en lugar de extraerlo todo de la red principal de 24 pines. Utilizado también para aplicaciones SLI

# Conectores externos

La conexión entre los periféricos del sistema con el propio equipo se realiza principalmente, a través de conectores de comunicación externos anclados a la placa base. Estos conectores emplean diferentes buses de comunicación hacia el chipset.
Principales conectores externos:
- eSATA: conecta dispositivos de almacenamiento externo
![[Pasted image 20250917184251.png]]
- Thunderbolt: empleado para conectar periféricos de almacenamiento o para transmitir vídeo a periféricos. 
![[Pasted image 20250917184304.png]]
- USB: conector empleado para conectar periféricos (hardware)
- Conectores de vídeo: transmiten señales de vídeo a monitores. Los más usados son VGA, DVI, Displayport y HDMI (estos dos últimos también transmiten audio)
![[Pasted image 20250917184517.png]]
- Conector Ethernet LAN: también llamada RJ45, empleado para comunicarse por cable de par trenzado en una red de ordenadores
- Conectores de audio Jack y S/PDIF: capaces de transmitir sonido analógico y digital, respectivamente
- Conectores PS/2: utilizados para conectar teclados y ratones


![[Pasted image 20250919164709.png]]

# BIOS

Es un conjunto de programas muy elementales, grabados en un chip de la placa base denominado ROM BIOS, que se encarga de realizar las funciones necesarias para que el ordenador arranque
Este conjunto de programas se denomina firmware y es el primer programa que se ejecuta al arrancar el ordenador
El **objetivo principal** es comprobar el estado del hardware, asignar direcciones e interrupciones de proceso, y cargar el sistema operativo o gestor de arranque
Dispone de una GUI (Interfaz Gráfica de Usuario) en forma de menú que nos permite visualizar o configurar parámetros del sistema
Los parámetros de configuración son almacenados en una memoria volátil denominada CMOS
**CMOS**: término empleado para describir aquella porción de memoria en la placa base de un ordenador destinada a almacenar configuraciones de BIOS.
Para mantener la información en la memoria BIOS se hace uso de una pila de botón normalmente del tipo CR2032 que mantiene los datos de configuración en la memoria. Cuando esta pila se agota es necesario reemplazarla. El sistema avisa cuando la pila está sin carga, obligando al usuario decidir sobre como continuar (cargar configuración por defecto, o entrar a los ajustes BIOS)

![[Pasted image 20250917185530.png]]

# Electrónica Digital

Un sistema Informático maneja datos o señales digitales: código binario
Estos datos son señales eléctricas que corresponden a un valor concreto de tensión

| Decimal | Binario |
| ------- | ------- |
| 0       | 00      |
| 1       | 01      |
| 2       | 10      |
| 3       | 11      |
##### Reloj
Circuito electrónico encargado de emitir un ritmo constante de impulsos eléctricos. Es expresada en Hz (ciclos/s)
La frecuencia indica la velocidad que pueden funcionar los transistores que forman el procesador
Un procesador actual trabaja con 3,6 GHz, es decir, realiza 3.600.000.000 ciclos

##### Transistores
El procesador está formado por millones de transistores. En la actualidad 20.000 millones aproximadamente. 
El tamaño de los transistores se expresa en nanómetros (nm). Al reducir el tamaño de los transistores, aumenta el rendimiento del procesador. Actualmente se trabaja con 7nm

# Procesador 

Circuito integrado que interpreta y ejecuta las intrucciones de los programas almacenados en memoria, y además toma los datos de la unidades de entrada, los procesa y los envía a las unidades de salida
Encargado de:
- Dirigir y controlar todos los componentes
- Realizar todas las operaciones matemáticas y lógicas
- Decodificar y ejecutar las instrucciones de los programas cargado en la memoria
**Características:**
==Velocidad o frecuencia==: medida en gigahercios (GHz), hace referencia al número de ciclos que tienen que transcurrir para ejecutar una instrucción o parte de ella en cada CPU. A mayor frecuencia, mayor velocidad de procesamiento
==Número de núcleos==: Es el número de procesadores integrados en un solo chip funcionando en paralelo (2, 4, 6, 8... núcleos)
==Número de hilos==: Los procesadores pueden ejecutar hilos de procesamiento, es decir, tareas como parte de un mismo proceso. También se denominan <u>procesadores lógicos</u>
==Memoria caché==: destinada para almacenar las últimas instrucciones procesadas o las futuras a procesar
==Nivel de integración (litografía)==: medida en nanómetros (nm) de los transistores empleados para la fabricación del procesador
==Consumo (W)==: Potencia que necesita el procesador para funcionar
==Potencia de disipación térmica (TDP)==: indica la cantidad de calor que es necesaria disipar para que el procesador quede bien refrigerado
##### Unidad de Control
Busca las instrucciones del programa que se está ejecutando en la memoria principal (RAM), para decodificarlas y ejecutarlas
Atiende y decide sobre posibles interrupciones que se pueden producir en el proceso, por ejemplo, pulsar una tecla, cuando conectamos un Pendrive, si la impresora se queda sin papel...
Envía al resto de componentes señales de control, estado o situación para la correcta automatización de las diferentes funciones del sistema de manera sincronizada
##### Decodificador
Se encarga de extraer el código de operación de la instrución en curso, o la dirección (posición) de memoria a la que la Unidad de Control debe acceder para leer o escribir en ella
##### ALU/UAL (Unidad Aritmético-Lógica)
Operaciones con números enteros y datos booleanos
Recibe los datos sobre los que efectúa operaciones de cálculo y comparaciones y toma decisiones lógicas (determina si una comparación es verdadera o falsa). Todo ello bajo la supervisión de la unidad de control
##### Unidad de coma flotante (FPU, Floating Point Unit)
Operaciones con números reales
Conocida como coprocesador matemático. Realiza las operaciones de cálculo en coma flotante
Las operaciones básicas que realiza son la suma y la multiplicación
Algunos sistemas más complejos realizan cálculos trigonométricos o exponenciales
##### Caché
- **Memoria caché Nivel 1/L1**
	- Integrada en el propio núcleo de procesador, que trabaja a la misma velocidad
	- Su función es almacenar los datos más frecuentes para una mayor rapidez de localización y ejecución de estos
- **Memoria caché Nivel 2/L2**
	- Integrada en el procesador, pero no directamente en el núcleo de este
	- La finalidad es la misma que la caché L1, pero a una velocidad más lenta
- **Memoria caché Nivel 3/L3**
	- Suele estar situada fuera de los núcleos, pero compartirla por todos ellos. Este nivel recibe o entrega instrucciones y datos a o desde los módulos de memoria
##### Hilos (Thereading)
Los procesadores tienen más de un núcleo en su estructura. A su vez, estos núcleos internamente pueden estar diseñados para disponer de hilos o procesadores lógicos. Todo esto sucede a nivel de Hardware

![[Pasted image 20250924183145.png]]
==Importante: Cada procesador lógico solo puede atender a una sola aplicación (Word, Excell...)==
**Tareas mono hilo**: Son tareas que solo pueden hacer uso de un hilo. Estas requieren de un mayor tiempo de ejecución. Al hacer uso de sólo un hilo, se produce un desaprovechamiento del procesador
**Tareas multi hilo**: Utilizan más de un hilo y núcleo. Esta tecnología permite aprovechar al 100% el rendimiento del procesador al poder trabajar con más de un hilo (reducir el tiempo de ejecución). Depende tanto de la tecnología del procesador, como del propio software de la aplicación.
WinRAR es uno de los programas que puede hacer uso de todos los procesadores lógicos y núcleos (siempre y cuando estén disponibles). Esto se traduce en reducir los tiempos de compresión/descompresión de archivos.
# Memoria RAM (Random Access Memory)

Es la memoria de almacenamiento principal se encuentra conectada a la CPU, a la cual abastece almacenando instrucciones o datos de forma temporal. Memoria externa al procesador que se agrupa en forma de módulos de memoria instalados en la placa base, donde se almacenan 2 tipos de datos:
- El programa o secuencia de instrucciones a ejecutar
- Los datos que manejan dichas instrucciones
El contenido de los datos es volátil, desaparecen cuando deja de recibir tensión de la fuente de alimentación.
La lectura y escritura está manejada por la CPU, y más concretamente por la unidad de control
La memoria principal engloba varios tipos de memoria: registros, memoria caché y memoria RAM

![[Pasted image 20250924184129.png]]

Registros: Estructuras de almacenamiento pertenecientes al núcleo de la CPU de muy poca capacidad pero acceso extremadamente rápido
Memoria caché (L1, L2, L3): se encuentra entre los núcleos el procesador. Cuanto mayor capacidad, mayor capacidad de computo del procesador, ya que disminuye las veces que esta tenga que recargarse accediendo a la memoria RAM

Celdas: Cada celda de memoria puede almacenar 1 byte, es decir, una secuencia de 8 bits (0,1) que representan un número del 0 al 255. Estas celdas tienen una dirección de memoria
![[Pasted image 20250924184757.png]]
Tanto procesador como memoria RAM manejan datos digitales (bits)
La forma de comunicar los bits entre todas las unidades del sistema es por medio de buses
La transmisión se realiza de forma paralela, es decir, enviando un número de bits de forma simultánea entre dos unidades (líneas de 32/64 bits)
Parámetros a tener en cuenta:
Frecuencia: Velocidad a la que circulan los datos (GHz)
Capacidad: Cantidad de información (GB)
Ancho de banda/tasa de transferencia de datos: Máxima cantidad de información que puede transferir simultáneamente por segundo (Mb/s o Gb/s)
Dual/Triple/Quad channel: La CPU trabaja con dos o tres canales de manera simultánea. De esta manera se multiplica el ancho de banda. Esta característica la determina el propio procesador.
Latencia / tiempo de acceso (CAS): Ciclos transcurridos desde que se solicita el dato hasta que es localizado en la memoria Se mide en ciclos de reloj
Voltaje: Tensión de funcionamiento (V)
Tipo de módulo: los chips de memoria se encapsulan en módulos DIMM o SO-SIMM, según sean para equipos de sobremesa o portátiles, respectivamente, con diferente dimensión

# Buses
El procesador se comunica con la memoria RAM por el bus del sistema, que está formado a su vez por:
- Bus de control
	- Las señales de control se transmiten tanto en órdenes como información de temporización entre los módulos.
	- Es el que permite que no haya colisión de información en el sistema.
	- Habilita o deshabilita un módulo para que transmita o reciba información
- Bus de direcciones
	- Se utiliza para localizar una posición de memoria concreta. La memoria RAM es direccionable. Cada celda tiene asignado una dirección de memoria
	- Es un canal del procesador independiente del bus de datos
	- Es un conjunto de líneas o pistas eléctricas, de forma paralela, necesarias para establecer una dirección. Cada pista puede transportar 1 bit de dirección
	- La cantidad de bytes de memoria a la cual podemos acceder depende del tamaño del bus de direcciones del procesador (32/64 bits)
- Bus de datos
	- Bus bidireccional dedicado al intercambio de datos entre procesador y memoria RAM, principalmente lectura y escritura
	- Es un canal del procesador independiente del resto de buses
	- Conecta los puertos de entea/salida al procesador. Por tanto, el procesador también podrá leer o escribir datos de los puertos de entrada/salida


| Sistema en reposo                    | Lectura de un dato                   | Enviar dirección de memoria          | Enviar datos                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| ![[Pasted image 20250926164801.png]] | ![[Pasted image 20250926164824.png]] | ![[Pasted image 20250926164838.png]] | ![[Pasted image 20250926164940.png]] |


# Interfaz Gráfica
Para poder mostrar el entorno de gráfico en un ordenador, es necesario disponer de algún componente electrónico que se encargue de manejar la interfaz gráfica de usuario consiguiente mostrarla en un monitor. Este componente es conocido comúnmente como <u>TARJETA GRÁFICA</u>

##### GPU
El procesador gráfico es parte fundamental para poder ofrecer una salida de vídeo por pantalla. Este procesamiento gráfico está integrado en una gran parte de los procesador actuales. Cuando ocurre esto se le denomina <u>TARJETA GRÁFICA INTEGRADA</u>
Para el funcionamiento de una GPU, es necesario una memoria que almacene los datos de entrada/salida para poder ser procesados.
En el caso de gráfica integrada la memoria utilizada es la memoria principal propia del sistema (RAM). Por tanto, parte de la memoria del sistema será dedicada al procesamiento gráfico, quedando limitada así la memoria RAM dedicada al procesador central CPU

El CPU y GPU se encuentran en el mismo encapsulado, pero son procesadores independientes. Cada procesador trabaja a diferentes velocidades de trabajo/frecuencia (GHz). Están formados por núcleo o cores. Estos solo pueden procesar una orden en cada ciclo de trabajo (trabajan a instrucción de forma secuencial).
Los <u>núcleos</u> de una CPU están diseñados para manejar instrucciones de propósito general (diferentes órdenes dentro del sistema)
Los <u>núcleos</u> de una GPU están diseñados para procesar ordenes muy específicas dentro del sistema, que es el procesamiento de gráficos.
A diferencia del CPU que está formado por 2/4/8 núcleos, el GPU está formado por miles de núcleos
Todos los núcleos del CPU y del GPU trabajan de forma paralela

==RAMDCA==: Chip formado por una pequeña memoria RAM que actúa a modo de memoria caché, para transformar las señales digitales de la GPU a señales analógicas.

##### Tarjetas dedicadas
Las tarjetas gráficas dedicadas son tarjetas de expansión con la misma finalidad que las tarjetas gráficas integradas: procesar los datos provenientes de la CPU y transformarlos en información comprensible y representable en un dispositivo de salida (monitor/pantalla)
Poseen su propia memoria dedicada a gráficos denominada VRAM, la cual se encarga de almacenar datos referentes a gráficos mientras una aplicación gráfica los solicite
Trabajan a una frecuencia inferior a la del procesador central CPU, pero en ambos casos (integrada y dedicada) se fabrican para funcionar a una frecuencia aproximada de 1,5GHz

# Unidades de Almacenamiento Interno

También denominados dispositivos de almacenamiento secundario, se emplean para almacenar la información de manera permanente
Toda la información guardada en la memoria RAM desaparece cuando se apaga el ordenador. Se necesitan formas permanentes de almacenamiento para guardar y recuperar programas de software y archivos de datos
Dependiendo del tipo de conector interno o slot de expansión de nuestra placa base, podremos conectar un dispositivo u otro y dependiendo del tipo de tecnología empleada e interfaz de conexión en la placa, obtendremos mayor o menos velocidad de transferencia de lectura /escritura de datos
Las principales interfaces de conexión interna para este próposito son las siguientes:: 
- SATA III
- U.2 (Protocolo NVMe)
- M.2 (Protocolo NVMe). Puede conectarse con los protocolos de la interfaz SATA
- PCIe x4
![[Pasted image 20251002135307.png]]

# Discos Duros (HDD)

Un disco duro es una caja herméticamente cerrada, en cuyo interior se encuentra un conjunto de componentes electrónicos y mecánicos, capaz de sincronizar los datos de lectura/escritura de nuestro ordenador
![[Pasted image 20251002135515.png]]
Factores de forma para los HDD:
3,5´´ para equipos de sobremesa
2,5´´ para equipos portátiles

Interfaz de conexión es SATA
![[Pasted image 20251002135807.png]]

# Disco Duro SSD

Es una unidad de estado sólido de almacenamiento de datos que usa una memoria no volátil, como la memoria flash. La memoria flash permite la lectura y escritura de múltiples posiciones de memoria en la misma operación, gracias a impulsos eléctricos. Están basadas en puertas NAND, que retiene los datos sin alimentación eléctrica.
En comparación con un HDD, son menos sensibles a los golpes, livianas, silenciosas, y sobre todo, mucho más rápidas. Esto implica que las operaciones de carga a la memoria RAM se realiza en un tiempo mucho menor, por tanto, mayor rendimiento del equipo.
Las SSD se encuentran en distintos factores de forma y distintas interfaces

**Componentes Principales**
Controladora: es un circuito  integrado que se encarga de administrar, gestionar, y unir, los módulos de memoria NAND con los conectores en entrada y salida. Ejecuta software a nivel de firmware, y es con toda seguridad, el factor mas determinante para las velocidades del dispositivo
Buffer/cache: un SSD utiliza un pequeño dispositivo de memoria DRAM similar al cache de los discos duros. Los buffers disponen de condensadores para mantener los datos almacenados temporalmente en caso de pérdida de corriente (el buffer es volátil)
Memoria NAND: almacena los datos de forma binaria
![[Pasted image 20251002140654.png]]

**Factor de forma 2.5 intefaz SATA**
Podemos encontrar sistemas SSD con factor de forma 2,5" (protocolo AHCI) para sistemas portátiles y sobremesa
El sistema de conexión de datos y alimentación es idéntico al indicado para dispositivos HDD

**M2**
El slot M.2 PCIe con protocolo de comunicaciones NVMe, está desplazando a la interfaz SATA y su protocolo AHCI. Esto es debido a la velocidad de transferencia de datos que puede alcanzar, ya que NVMe utiliza los carriles (lanes) de PCIe. El ancho de banda utilizado suele ser de x4
Los módulos o dispositivos SSD conectados son de menor tamaño, lo que implica su mayor uso en los equipos actuales.
Un slot M.2 no siempre utiliza NVMe, sino que puede emplear AHCI, utilizado en la interfaz SATA

**Tarjeta de expansión PCIe x4**
Otro de los tipos de dispositivos de almacenamiento SSD, son los tipos de tarjeta de expansión para buses PCIe. Se utiliza el protocolo NVMe para PCIe y el ancho de banda suele ser x4
Suele ser una solución cuando no se dispone de un slot M2, pero debemos tener en cuenta que no todas las placas base pueden ejecutar la carga del sistema operativo desde un slot PCIe.
Tiene mejor refrigeración que un M.2

**U.2**
Dispositivo de almacenamiento que al igual que el M.2 puede utilizar los protocolos de comunicación AHCI y NVMe (x4). Se encuentra con factores de forma 2.5"
ventaja: capacidad de refrigeración, lo cual permite aumentar el rendimiento frente a un dispositivo M.2


| Ventajas SSD                                                                                                                                                                                                                                                                                                                                                                                                              | Desventajas SSD                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| - Arranque más rápido<br>- Gran velocidad de escritura<br>- Mayor rapidez de lectura y escritura<br>- Baja latencia de lectura y escritura<br>- Menor consumo de energía y producción de calor<br>- Sin ruido<br>- Rendimiento determinado<br>- El rendimiento no se deteriora mientras el medio se llena<br>- Menor peso y tamaño que un disco duro tradicional de similar capacidad<br>- Mayor resistencia a los golpes | - Los precios son más altos en relación precio/gigabyte<br>- Después de un fallo físico se pierden completamente los datos<br>- Menor capacidad |
# Unidades de Almacenamiento Externo

Se utilizan para almacenar datos (copias de seguridad) y disponer de datos para ser transportados a otros equipos principalmente.
Están diseñadas para poder ser transportadas, por lo que su tamaño y peso no suele ser demasiado elevado (diferentes factores de forma)
Podremos encontrar discos mecánicos (HDD) y unidades de estado sólido (SDD)

**¿Dónde podemos conectar una unidad de almacenamiento externo?**
eSATA: es necesario una fuente de alimentación externa para el dispositivo, debido a que los puertos eSATA convencionales no suministran alimentación
USB: localizados en los conectores externos de la placa, y en los conectores del panel frontal
Ethernet: para dispositivos NAS Network Attached Storage
![[Pasted image 20251003171155.png]]

# Unidades de Almacenamiento Cabinas de Discos

**Servidores Backup**
es un sistema de almacenamiento externo en una red, que proporciona a los ordenadores copias de seguridad de sus archivos. Además, un servidor puede proveer diferentes servicios como puede ser correo, impresión...
Son sistemas de almacenamiento de datos, formados por múltiples discos físicos. Suelen disponer de múltiples puertos e interfaces para comunicarse con los equipos.
Ofrecen distintas formas de almacenamiento basadas en la tecnología.

**Estructura**
Suelen disponer de placa base con su propio procesador, RAM... y S.O. propio.
Dependiendo de las necesidades, disponemos de cabinas atendiendo a:
- Número de unidades de almacenamiento
- Tipo de interfaz de comunicación
- Interfaz de conexión con el disco

**Interfaces de conexión**
SCSI, SAS, SATA

# RAID
Los sistemas RAID pueden estar basados en hardware o en software. La ventaja de disponer un sistema hardware, es la independencia de la plataforma o sistema operativo, ya que son vistos por este como un gran disco duro más
Hoy en día se conocen ocho niveles de RAID (0-7), además de los mixtos (combinaciones de los básicos)

### Raid 0
Consiste en dividir los datos en trozos y se escriben alternativamente en los discos que forman el RAID, permitiendo un alto rendimiento de lectura y escritura. No proporciona redundancia
La capacidad total  es el número de discos multiplicado por la capacidad del menor
![[Pasted image 20251004131222.png]]
### Raid 1
Consiste en poner dos o más discos a trabajar en paralelo consiguiendo un espejo. Toda al información se graba clonada en los discos. El sistema operativo sólo interpreta una unica unidad de disco. La capacidad total corresponde con la del menor.
Al igual que un RAID 0, tiene un alto rendimiento de lectura, pero no de escritura
Proporciona una alta seguridad de datos
![[Pasted image 20251004131455.png]]

### Raid 5
Consiste en formar un conjunto de discos independientes con paridad distribuida. Posee redundancia con baja latencia y/o aumenta el ancho de banda para leer o escribir en discos y maximizar así la posibilidad de recuperar información cuando un disco falla. La capacidad es la suma de capacidades de todos los discos.
Baja velocidad de lectura/escritura al tener que realizar operaciones de cálculo para los bloques de paridad
![[Pasted image 20251004131731.png]]

### Raid 1 + 0 (10)
Es posible combinar los sistemas RAID 1 + RAID 0 (no confundir RAID 0 + RAID 1), para obtener las ventajas de ambos sistemas. Esta configuración híbrida proporciona gran seguridad mediante el duplicado de todos los datos en unidades secundarias, al tiempo que utiliza una distribución segmentada de los datos.
Si alguno de los discos falla, puede ser remplazado sin problemas con una alta velocidad de reconstrucción de datos
![[Pasted image 20251004132038.png]]

# Dispositivos de Expansión

Las <u>tarjetas</u> son circuitos impresos, donde se alojan todos los componentes electrónicos necesarios para poder implementar una función concreta, dentro del conjunto de un ordenador
Son utilizadas en equipos para añadir una nueva función al ordenador, o mejorar una existente
Estas son instaladas físicamente en los buses de expansión, incluyendo puertos USB:
- PCIe
- M.2
- USB
Todos los dispositivos conectados al ordenador, independientemente de que sean internos o externos, necesitan utilizar alguna técnica o medio para comunicarse entre ellos y el propio procesador: **los controladores (Hardware)**
Controlador: traductor existente entre cada uno de los dispositivos y la CPU
El procesador y el chipset tienen integrados los controladores de los distintos conectores y buses vistos hasta hora
Si necesitamos añadir nuevas funcionalidades, los dispositivos que conectemos necesitarán sus propios controladores, por ello se suele nombrar comúnmente a estos dispositivos como **controladores**

**Almacenamiento**
Una tarjeta controladora consta de un conjunto de circuitos integrados, que tienen como función organizar la lectura y escritura en las unidades de disco
Las funciones básicas de las tajetas controladores se pueden resumir en las siguientes:
- Convertir datos de un formato a otro, cuando ocurra que los datos entre los distintos dispositivos y la CPU tengan distintos formatos
- Unir los dispositivos hardware, con los drivers del sistema operativo (software)
- Adecuar las velocidades de los distintos dispositivos, cuando estas sean diferentes, para hacerlas compatibles

**Controladora de Sonido**
Es un dispositivo que permite la reproducción, la grabación y la digitalización de sonido, normalmente a través de un software específico
Las placas base en equipos actuales, disponen de un sistema de sonido integrado
Los equipos son ampliados con dispositivos de sonido en casos específicos (avería o necesidad de sonido profesional)
Grabación: el sonido es recogido a través de un micrófono en formato analógico, y llevado hasta la entrada correspondiente en la placa. Esta señal es procesada y almacenada en el formato digital.
Reproducción: El sonido almacenado en formato digital es emitido en formato analógico
![[Pasted image 20251004134216.png]]
![[Pasted image 20251004134237.png]]

**Controladores de red**
Son dispositivos que nos permiten conectar nuestro equipo a una red de ordenaores para realizar la transmisión y la recepción de datos a través de ella (Wifi, Ethernet)
Función: envío y recepción de datos a través de la red
Se diferencian en el tipo de conectores, velocidades de transferencia, el acceso al medio y tipología que utilizan
Ethernet:
![[Pasted image 20251004134459.png]]

Wifi: las tarjetas de red wifi están basadas en la tecnología de comunicación inalámbrica. Dentro de estas tarjetas encontramos varios estándares:
![[Pasted image 20251004134600.png]]
Para el uso de un adaptador de red WIFI debemos disponer de un puto de acceso, que es un dispositivo puente entre la red inalámbrica y la red cableada
se justifica la instalación de una tarjeta o adaptador WIFI cuando:
- El adaptador de red actual no funcione
- Mejora de la velocidad de transmisión
Tipos de adaptadores WIFI:
![[Pasted image 20251004134818.png]]

# Periféricos

Los dispositivos a través de los cuales los usuarios interactúan con el sistema informático se denominan periféricos. Clasificación:
a) Dispositivos de entrada: permiten introducir información al sistema (teclado, ratón, micrófono...)
b) Dispositivos de salida: ofrecen información al usuario (altavoces, pantalla, impresoa...)
c) Dispositivos de entrada y salida: realizan ambas tareas (pantalla táctil, impresora con escáner)
- Dispositivos de almacenamiento: permiten almacenar y recuperar la información (disco duro externo, pendrive...)
- Comunicación: permiten la comunicación entre ordenadores o elementos de interconexión de un sistema en red (tarjeta de red, Ethernet/WIFI...)

Pueden comunicarse con nuestro ordenador por diferentes vías de comunicación. Las más comunes son conexión directa por cable, inalámbrica con receptor conectado a USB, conexión remota a punto de acceso (WIFI/Ethernet)

**Adaptadores**
Es importante destacar la existencia de diferentes adaptadores que ofrecen la posibilidad de interconectar diferentes periféricos con conexiones diferentes
![[Pasted image 20251004135818.png]]

# Fuente de Alimentación

Es el elemento indispensable de cualquier aparato electrónico.
Fuentes ATX en ordenadores: se encarga de suministrar la potencia necesaria a cada uno de los componentes del ordenador para su correcto funcionamiento
![[Pasted image 20251004140100.png]]
Para elegir correctamente una fuente de alimentación ATX, tenemos que tener en cuenta:
- Tipo de conectores en la placa
- Consumo estimado de los componentes de la placa (Potencia, W)

**Conectores**
Es popular que encontremos cables con diferentes colores para distinguirlos. Los colores nos pueden ayudar a usar un multímetro para comprobar los voltajes y así determinar si está fallando algún corrector o no
![[Pasted image 20251004140406.png]]

# Ventilación y Disipadores

**Ventilación**
Los componentes que integran un sistema informático emiten energía en forma de calor durante su funcionamiento normal. Es por ello que se tiene que proveer de una correcta ventilación, extrayendo el calor de una forma rápida y eficiente.
Una forma correcta sería hacer pasar el flujo de aire desde la parte frontal del equipo, y extraer ese flujo hacia el exterior desde diferentes puntos (parte superior y trasera). para ello se instalan ventiladores

**Disipadores**
Los componentes que más se calientan son: CPU, CHIPSET, VRM, Almacenamiento SSD...
Para conseguir disipar el calor de estos circuitos integrados, se necesita acoplar un dispositivo conductor (normalmente cobre o aluminio) pegado al circuito.. Para obtener un alto rendimiento de transferencia de calor, es necesario añadir una pasta térmica entre ambos elementos. Esta se encarga de  asegurar la transferencia en la mayor superficie posible.
Añadir un ventilador sobre el disipador facilita el proceso de transferencia de calor desde el proceso hacia el exterior
![[Pasted image 20251004141342.png]]
Disipador pasivo: no necesita ventilador para su funcionamiento

# Firmware Kernel

**Soporte Lógico Inalterable**
Un **firmware** es un software o grupo de instrucciones que va incluido dentro de un chip. Es una memoria no volátil (no pierde datos). Esta memoria es denominada EEPROM
Este software se encarga principalmente de controlar los componentes electrónicos. Uno de los firmwares más conocidos que contiene una placa base, es el que maneja la BIOS, pero podemos encontrarlos en muchos más dispositivos (dispositivos de almacenamiento, tarjetas controladoras, gráficas, de sonido...)
También se encarga de mantener una correcta comunicación entre el sistema operativo (kernel) a través de los drivers.
El firmware, se puede borrar y actualizar a una versión más nueva
Tarjeta controladora de un disco duro mecánico
![[Pasted image 20251004142009.png]]

**Núcleo**
El **Kernel** o **núcleo** es un software que constituye una parte fundamental del S.O., que facilita el acceso seguro de los programas, a los distintos componentes hardware del ordenador
Windows: completamente hermético, nadie puede modificarlo
Linux: código abierto, cualquiera puede hacerle las modificaciones que quiera, esto permite que existan distintas distribuciones de Linux

**Funciones básicas**
- Administrar la memoria para el uso de los programas y procesos
- Administra el tiempo de uso del procesador por parte de los programas (multiprogramación: hilos)
- Gestión de los recursos del sistema utilizados pro los programas a través de servicios de llamada al sistema (IRQ: interrupciones)
- Gestión de procesos hardware: memoria, procesador, periféricos, forma de almacenamiento...
![[Pasted image 20251004142617.png]]

# Driver

**Controlador**
Un driver o controlador de dispositivos, es un programa cuya finalidad es relacionar el sistema operativo con los dispositivos hardware: tarjeta gráfica, almcenamiento, tarjeta de sonido, wifi, impresora, pendrive...
Sirven para que el sistema operativo reconozca y permita trabar con los diferentes dispositivos
Los drivers pueden ser descargados de su web oficial y posteriormente instalados en el equipo.
Forman parte del Kernel de S.O.
