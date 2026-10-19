package com.ejemplo.biblioteca;

public class Libro {

    // Atributos privados: solo se pueden usar desde dentro de la clase
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible; // Reto extra

    // Constructor de la Etapa 2: recibe los tres valores y los asigna con this
    // (por defecto el libro queda disponible)
    public Libro(String titulo, String autor, int anio) {
        this(titulo, autor, anio, true);
    }

    // Constructor del reto extra: también recibe si el libro está disponible
    public Libro(String titulo, String autor, int anio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Devuelve true si el libro es anterior al año 2000
    public boolean esAntiguo() {
        return anio < 2000;
    }

    // Ejemplo: Cien años de soledad de Gabriel García Márquez (1967)
    public String resumen() {
        return titulo + " de " + autor + " (" + anio + ")";
    }
}
