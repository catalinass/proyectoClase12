package com.mycompany.proyectoclase;

public class CLaseHija {
    
    public static void main(String[] args) {
        Clase1 carro1 = new Clase1("BMW", 2012, 4000, true, false);
        carro1.setKmRecorridos(4000);
        carro1.setAhno(2012);
        carro1.setEncendido(true);
        carro1.setLuces(false);
        
        System.out.println("-----------------");
        System.out.println("Marca del carro1: " + carro1.getMarca());
        System.out.println("Ahno de lanzamiento: " + carro1.getAhno());
        System.out.println("Kilometros recorridos: " + carro1.getKmRecorridos());
        System.out.println("El carro esta en estado encendido: " + carro1.isEncendido());
        System.out.println("El carro tiene las luces: " + carro1.isLuces());
    }
    
}
