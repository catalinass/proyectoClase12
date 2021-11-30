package com.mycompany.proyectoclase;

public class Clase1 {
    
    private String marca;
    private int ahno;
    private double KmRecorridos;
    private boolean encendido;
    private boolean luces;

    public Clase1(String marca, int ahno, double KmRecorridos, boolean encendido, boolean luces) {
        this.marca = marca;
        this.ahno = ahno;
        this.KmRecorridos = KmRecorridos;
        this.encendido = encendido;
        this.luces = luces;
    }
    

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAhno() {
        return ahno;
    }

    public void setAhno(int ahno) {
        this.ahno = ahno;
    }

    public double getKmRecorridos() {
        return KmRecorridos;
    }

    public void setKmRecorridos(double KmRecorridos) {
        this.KmRecorridos = KmRecorridos;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }
    
}
