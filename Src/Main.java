package Src;


public class Main {
    public static void main(String[] args) {
       
        GestionComedor gestor = new GestionComedor();
        System.out.println("");
        
        Comida arrozVerduras = new Comida("Arroz con verduras", TipoComida.VEGETARIANA, 50);
        Comida ensaladaQuinoa = new Comida("Ensalada de quinoa", TipoComida.VEGANA, 30);
        Comida polloArroz = new Comida("Pollo con arroz", TipoComida.ESTANDAR, 100);
        
        gestor.registrarComida(arrozVerduras);
        gestor.registrarComida(ensaladaQuinoa);
        gestor.registrarComida(polloArroz);
        
        Estudiante estudiante1 = new Estudiante("Ana García", "E001");
        Estudiante estudiante2 = new Estudiante("Juan Pérez", "E002");
        
        gestor.mostrarDisponibilidad();
        
        if (estudiante1.seleccionarComida(arrozVerduras)) {
            gestor.registrarConsumo(estudiante1, arrozVerduras);
            System.out.println(estudiante1.getNombre()+"ha escogio "+arrozVerduras.getNombre());
        }
        if (estudiante2.seleccionarComida(polloArroz)) {
            gestor.registrarConsumo(estudiante2, polloArroz);
            System.out.println(estudiante2.getNombre()+"ha escogio "+polloArroz.getNombre());
        }

        gestor.mostrarDisponibilidad();
        gestor.mostrarConsumoDiario();
    }
} 
