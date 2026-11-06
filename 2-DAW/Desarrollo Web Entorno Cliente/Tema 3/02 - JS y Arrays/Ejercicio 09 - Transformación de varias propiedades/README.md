# Ejercicio 9. Transformación de varias propiedades

[Enunciado en Moodle](https://aulavirtual.murciaeduca.es/mod/assign/view.php?id=1535699)

## Enunciado

Utiliza map() para generar un nuevo array de objetos a partir de los equipos proporcionados.

### Código de partida

```js
const equipos = [
  { nombre: "PC01", ram: 8, precio: 450 },
  { nombre: "PC02", ram: 16, precio: 700 },
  { nombre: "PC03", ram: 4, precio: 300 },
  { nombre: "PC04", ram: 32, precio: 1100 }
];
```

### Tareas y condiciones

1. Genera con map() objetos con nombre (identificador original), ram (memoria original), precioIVA (precio con 21 % de IVA) y categoria.
2. Categorias: "Básica" para 4 GB, "Media" para 8–16 GB y "Alta" para más de 16 GB.
3. Comprueba que los precios originales siguen intactos.
4. Explica por qué debes devolver un objeto en cada callback.

## Preguntas y respuestas

### 1. ¿Por qué es necesario devolver un objeto en cada llamada al callback?

Respuesta:


## Comprobaciones

<!-- Escribe aquí tus pruebas y resultados. -->
