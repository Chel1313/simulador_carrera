package Clases;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nombreCarrera = "";
        int eleccion = 0;
        
        
        while (eleccion < 1 || eleccion > 3) {
            System.out.println("Elige tu camino profesional:");
            System.out.println("1. Tecnología");
            System.out.println("2. Artes");
            System.out.println("3. Ciencias");
        
            System.out.print("Digita tu opción: ");
            eleccion  = scanner.nextInt();
            
            switch (eleccion) {
                case 1:
                    nombreCarrera = "Tecnología";
                    break;
                case 2:
                    nombreCarrera = "Artes";
                    break;
                case 3:
                    nombreCarrera = "Ciencias";
                    break;
                default:
                    System.out.println("Opción inválida, por favor elige entre las opciones que aparecen (1, 2 o 3).");
                    break;
            }
        }

        Carrera carrera = new Carrera(nombreCarrera);

        
        for (int año = 1; año <= 5; año++) {
            System.out.println("\nAño " + año + " en tu carrera de " + carrera.getNombreCarrera() + ".");
            System.out.println("¿Prefieres tener una carrera en la que estés muy ocupado pero seas muy exitoso (1)\n"
                    + "o una carrera en la que estés más relajado pero no tan exitoso? (2)");
            System.out.print("Digita tu opción: ");
            int decision = scanner.nextInt();
            
            
            carrera.trabajar(decision);
            Evento.generarEvento(carrera); 
            
            carrera.mostrarEstado(); 
        }

        
        System.out.println("\nResumen de tu carrera:");
        carrera.mostrarResumen();
        
        scanner.close();
    }
}
