package Clases;

import java.util.Random;

public class Evento {
   
    public static void generarEvento(Carrera carrera) {
        Random random = new Random();
        int evento = random.nextInt(11); 
        
        if (evento > 5) {  
            System.out.println("¡Has recibido una oportunidad! Obtienes un proyecto importante.");
            carrera.setExperiencia(carrera.getExperiencia() + 20); 
        } else if (evento < 5) { 
            System.out.println("¡Oh no! Has tenido un revés en tu carrera.");
            carrera.setExperiencia(Math.max(0, carrera.getExperiencia() - 10)); 
        }
    }
}

