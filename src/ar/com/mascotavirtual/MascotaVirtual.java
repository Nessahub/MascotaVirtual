package ar.com.mascotavirtual;

import java.time.Duration;
import java.time.Instant;

public class MascotaVirtual {
    private int nivel;
    private boolean puedeJugar;
    private boolean estaHambrienta;
    private boolean estaContenta;
    private Instant ultimoTiempoAburrida;

    
    public MascotaVirtual() {
        nivel = 0;
        puedeJugar = true;
        estaHambrienta = true;
        estaContenta = false;
        ultimoTiempoAburrida = Instant.now();
    }

    
    public void comer() {
        if (estaHambrienta) {
            System.out.println("¡Ñam ñam! La mascota está comiendo y se pone contenta.");
            estaHambrienta = false;
            estaContenta = true;
        } else if (estaContenta) {
            System.out.println("¡Ñam ñam! La mascota está comiendo y su nivel aumenta en una unidad.");
            nivel++;
        } else {
            Instant ahora = Instant.now();
            Duration duracionAburrida = Duration.between(ultimoTiempoAburrida, ahora);
            if (duracionAburrida.toMinutes() > 80) {
                System.out.println("¡Ñam ñam! La mascota está comiendo y se pone contenta.");
                estaContenta = true;
            } else {
                System.out.println("¡Ñam ñam! La mascota está comiendo, pero no le pasa nada más.");
            }
        }
        actualizarEstado();
    }

    
    public void jugar() {
        if (estaHambrienta) {
            System.out.println("La mascota no puede jugar ahora porque está hambrienta.");
        } else {
            if (estaContenta) {
                System.out.println("La mascota está jugando y su nivel aumenta en dos unidades.");
                nivel += 2;
            } else {
                System.out.println("La mascota está jugando y se pone contenta.");
                estaContenta = true;
            }
        }
        actualizarEstado();
    }

    private void actualizarEstado() {
        if (nivel >= 10) {
            puedeJugar = false;
        } else {
            puedeJugar = true;
        }
    }
    
    public void estaTriste () {
    	if (estaHambrienta = true) {
    		System.out.println("La mascota esta triste :(");
    	}
    	
    	
    }

    public int getNivel() {
        return nivel;
    }


}