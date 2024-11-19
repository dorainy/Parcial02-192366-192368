package Src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

enum TipoComida {
    VEGETARIANA, VEGANA, ESTANDAR
}

class Comida {
    private String nombre;
    private TipoComida tipo;
    private int disponibilidad;

    public Comida(String nombre, TipoComida tipo, int disponibilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }
    
    public boolean servir() {
        if (disponibilidad > 0) {
            disponibilidad--;
            return true;
        }
        return false;
    }
    
    public boolean reponer(int cantidad) {
        if (cantidad > 0) {
            disponibilidad += cantidad;
            return true;
        }
        return false;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public TipoComida getTipo() {
        return tipo;
    }
    
    public int getDisponibilidad() {
        return disponibilidad;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Disponibles: " + disponibilidad;
    }
}
class Estudiante {
    private String nombre;
    private String id;
    private Comida comidaSeleccionada;
    
    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public boolean seleccionarComida(Comida comida) {
        if (comida.getDisponibilidad() > 0) {
            if (comida.servir()) {
                comidaSeleccionada = comida;
                return true;
            }
        }
        return false;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Estudiante: " + nombre + " (ID: " + id + ")";
    }
}
class GestionComedor {
    private ArrayList<Comida> comidas;
    private HashMap<String, ArrayList<Consumo>> registroConsumo;
    
    public GestionComedor() {
        comidas = new ArrayList<>();
        registroConsumo = new HashMap<>();
    }
    
    public void registrarComida(Comida comida) {
        comidas.add(comida);
    }
    
    public void mostrarDisponibilidad() {
        System.out.println("");
        System.out.println("Disponibilidad de comidas:");
        for (Comida comida : comidas) {
            System.out.println(comida);
        }
    }
    
    public void registrarConsumo(Estudiante estudiante, Comida comida) {
        String fecha = "2024-11-19"; 
        
        if (!registroConsumo.containsKey(fecha)) {
            registroConsumo.put(fecha, new ArrayList<>());
        }
        
        registroConsumo.get(fecha).add(new Consumo(estudiante, comida));
    }
    
    public void mostrarConsumoDiario() {
        for (Map.Entry<String, ArrayList<Consumo>> entry : registroConsumo.entrySet()) {
            System.out.println("");
            System.out.println("Consumo del día " + entry.getKey() + ":");
            for (Consumo consumo : entry.getValue()) {
                System.out.println(consumo.getEstudiante().getNombre() + 
                                 " consumió " + consumo.getComida().getNombre());
            }
        }
    }
}

class Consumo {
    private Estudiante estudiante;
    private Comida comida;
    
    public Consumo(Estudiante estudiante, Comida comida) {
        this.estudiante = estudiante;
        this.comida = comida;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    public Comida getComida() {
        return comida;
    }
}

