package com.ejemplo.biblioteca;

public class Practica {

    // Etapa 1, tarea 4: método estático que calcula la multa (500 pesos por día)
    public static int calcularMulta(int diasRetraso) {
        return diasRetraso * 500;
    }

    public static void main(String[] args) {

        // ===== ETAPA 1: Java puro =====
        System.out.println("=== ETAPA 1 ===");

        // Tarea 1: variables
        String titulo = "Cien años de soledad";
        int anio = 1967;
        boolean disponible = true;
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anio);
        System.out.println("Disponible: " + disponible);

        // Tarea 2: if/else con dos años distintos
        int[] anios = {1967, 2015};
        for (int a : anios) {
            if (a < 2000) {
                System.out.println(a + " -> Clásico");
            } else {
                System.out.println(a + " -> Contemporáneo");
            }
        }

        // Tarea 3: ciclo for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ejemplar " + i);
        }

        // Tarea 4: método calcularMulta llamado tres veces
        System.out.println("Multa por 3 días: $" + calcularMulta(3));
        System.out.println("Multa por 10 días: $" + calcularMulta(10));
        System.out.println("Multa por 20 días: $" + calcularMulta(20));

        // ===== ETAPA 3: Crear y usar objetos =====
        System.out.println();
        System.out.println("=== ETAPA 3 ===");

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985);
        Libro libro3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001);

        System.out.println(libro1.resumen());
        System.out.println(libro2.resumen());
        System.out.println(libro3.resumen());

        System.out.println("¿libro1 es antiguo? " + libro1.esAntiguo());
        System.out.println("¿libro2 es antiguo? " + libro2.esAntiguo());
        System.out.println("¿libro3 es antiguo? " + libro3.esAntiguo());

        // Instrucción 4: esta línea NO compila porque "titulo" es private en Libro.
        // La dejo comentada para que el proyecto compile:
        // libro1.titulo = "Otro";   // error: titulo has private access in Libro
    }
}
