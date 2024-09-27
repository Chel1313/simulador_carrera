package Clases;

public class Carrera {
    
    private static final int EXPERIENCIA_POR_NIVEL = 50;
    
    
    private String nombreCarrera;
    private int experiencia;
    private int nivel;
    private int añosTrabajados;

    
    public Carrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.experiencia = 0;
        this.nivel = 1;
        this.añosTrabajados = 0;
    }

    
    public void trabajar(int decision) {
        int experienciaGanada = 0;
        if (decision == 1) {
            experienciaGanada = (int)(Math.random() * 25) + 10; 
            System.out.println("Has ganado " + experienciaGanada + " de experiencia logrando tener una carrera totalmente exitosa.");
        } else {
            experienciaGanada = (int)(Math.random() * 5) + 3;  
            System.out.println("Has ganado " + experienciaGanada + " de experiencia logrando tener una carrera poco exitosa.");
        }
        experiencia += experienciaGanada;
        añosTrabajados++;

       
        if (experiencia >= nivel * EXPERIENCIA_POR_NIVEL) {
            nivel++;
            System.out.println("¡Felicidades! Has subido al nivel " + nivel + ".");
        }
    }


    public void mostrarEstado() {
        System.out.println("Nivel actual: " + nivel);
        System.out.println("Experiencia actual: " + experiencia);
    }

    
    public void mostrarResumen() {
        System.out.println("Carrera elegida: " + nombreCarrera);
        System.out.println("Años trabajados: " + añosTrabajados);
        System.out.println("Nivel alcanzado: " + nivel);
        System.out.println("Experiencia total: " + experiencia);
    }


    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}

