package com.ejemplo.biblioteca;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibliotecaController {

    // Devuelve un objeto Libro (Spring lo convierte a JSON)
    @GetMapping("/libro")
    public Libro libro() {
        return new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
    }

    // Devuelve una lista con 3 libros (arreglo JSON)
    @GetMapping("/libros")
    public List<Libro> libros() {
        return List.of(
                new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, true),
                new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, false),
                new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001, true)
        );
    }

    // Devuelve el resumen de un libro como texto
    @GetMapping("/libro/resumen")
    public String libroResumen() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        return libro.resumen();
    }

    // El préstamo dura 14 días; cada día después del 14 cuesta 500 pesos
    @GetMapping("/prestamo/{dias}")
    public String prestamo(@PathVariable int dias) {
        if (dias > 14) {
            int diasRetraso = dias - 14;
            return "Préstamo vencido. Multa: $" + Practica.calcularMulta(diasRetraso);
        } else {
            return "Préstamo vigente";
        }
    }

    // Reto opcional: números del 1 hasta n separados por espacios
    @GetMapping("/contar/{n}")
    public String contar(@PathVariable int n) {
        String resultado = "";
        for (int i = 1; i <= n; i++) {
            resultado = resultado + i + " ";
        }
        return resultado.trim();
    }
}
