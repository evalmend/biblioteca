# Biblioteca (Actividad Sesión 2 · Java con Spring Boot)

Taller práctico: clases, objetos y métodos en Java, usados en una API REST con Spring Boot.

## Contenido
- `Practica.java`: Etapas 1 y 3 (Java puro) y método `calcularMulta`.
- `Libro.java`: clase con atributos privados, constructor, getters, `esAntiguo()` y `resumen()`.
- `BibliotecaController.java`: endpoints `/libro`, `/libros`, `/libro/resumen`, `/prestamo/{dias}` y `/contar/{n}` (reto).
- `BibliotecaApplication.java`: clase principal de Spring Boot.

## Cómo ejecutar
- Java puro: ejecutar el `main` de `Practica`.
- API: ejecutar `BibliotecaApplication` (o `mvn spring-boot:run`) y abrir `http://localhost:8080/libro`.

## Endpoints
| Ruta | Respuesta |
|---|---|
| `/libro` | JSON de un libro |
| `/libros` | Arreglo JSON con 3 libros |
| `/libro/resumen` | Texto con el resumen del libro |
| `/prestamo/{dias}` | "Préstamo vigente" o "Préstamo vencido. Multa: $..." (14 días, 500 pesos por día extra) |
| `/contar/{n}` | Números del 1 hasta n (reto opcional) |
