package ar.com.mascotavirtual;

public class Main {

	public static void main(String[] args) {
        MascotaVirtual mascota = new MascotaVirtual();
        System.out.println("Nivel de la mascota: " + mascota.getNivel());

        mascota.comer();
        mascota.comer();
        mascota.jugar();
        System.out.println("Nivel de la mascota: " + mascota.getNivel());

        mascota.jugar();
        mascota.jugar();
        mascota.jugar();
        System.out.println("Nivel de la mascota: " + mascota.getNivel());
        mascota.estaTriste();
        mascota.comer(); 
        
    }
}


