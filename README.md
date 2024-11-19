# Parcial02-192366-192368
Clase comida:

    Se crea una clase llamada enum, ya que este tipo de dato reprenseta valores que no cambian. como el tipo de comida que siempre va a ser vegerariana, vegana y estandar. evitando errores para que no se puede crear otro tipo de comida

    Se crea la clase comida y se inicializa los atributos con el constructor

    Se crea un metodo tipo booleano servir, y se condiciona que si el valor de disponibilidad es mayor a 0, entonces significa que todavia hay disponibilidad, y se procede a restarle uno y retorna true, y sino, retorna falso, es decir, sin disponibilidad.

    Se crea otro metodo tipo boleano para reponer la comida y se le asigna un parametro que es cantidad. se condiciona que si la cantidad es mayor a 0, se agrega la cantidad a la disponibilad y retorna true. y sino retorna false, es decir, que la cantidad ingresada es menor o igual a 0

    Se crean metodos "getters" para obtener o retornar el nombre, tipo de comida y la disponibilidad

    Se crea un @override para sobre-escribir y se crea un metodo tipo string que retorna el nombre del estudiante, tipo de comida y si hay disponibilidad

Clase Estudiante:
    Se crean atributos como nombre, id y comidaSeleccionada.
    
    Se crea su respectivo constructor

    Se crea una clase boleana para seleccionar la comida, y tiene como parametros comida. se condiciona dentro de la clase que si la disponibilidad de dicha comida es mayor a 0, se ejecuta otra condicion con el metodo servir para que la disponibilidad se reste, y comidaSeleccionada sea igual a comida. esto retorna tru.
    por otro lado, si la disponibilidad es menor o igual a 0 retorna false

    Se crean dos getters y para obtener el nombre y el id.
    se crea otra sobreescritura para retornar el nombre y el id del estudiante

Clase GestionComedor:
    Se crea un arraylist con una instancia de la clase comida que va 
    Un hashmap para el registro del consumo

    se crea un nuevo objeto GestionComedor que inicializa el nuevo objeto de arraylist para comida y registroConsumo

    se crea un metodo registrar comida donde tiene como parametro comida y se añade al arraylist la informacion de la clase comida

    Se crea un metodo para mostrar disponibildad de la comida y con un for se recorre el arraylist comidas, imprimiendo cada "comida" del arrayslist comidas.

    
