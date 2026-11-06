# Ejercicio 5. Analiza el ámbito de las variables

[Enunciado en Moodle](https://aulavirtual.murciaeduca.es/mod/assign/view.php?id=1536681)

## Enunciado

Analiza el código de partida sin ejecutarlo inicialmente.

### Código de partida

```js
const precio = 100;
function calcular() {
  const precio = 80;
  function aplicarDescuento() {
    const descuento = 10;
    return precio - descuento;
  }
  return aplicarDescuento();
}
console.log(precio);
console.log(calcular());
```

### Tareas y condiciones

1. Predice los valores por consola antes de ejecutar.
2. Explica por qué el precio global no cambia; intenta acceder a descuento desde fuera y explica.
3. Modifica para usar precio global en la interna; añade otra variable homónima en otro ámbito y explica cuál se usa.
4. Distingue declarar, acceder y modificar.

## Preguntas y respuestas

### 1. Sin ejecutar inicialmente, ¿qué valores se muestran por consola?

Respuesta:

### 2. ¿Por qué no se modifica la variable precio global?

Respuesta:

### 3. Intenta acceder a descuento desde fuera de aplicarDescuento(). ¿Qué ocurre?

Respuesta:

### 4. Modifica el código para usar el precio global en la función interna. ¿Qué cambia?

Respuesta:

### 5. Añade una variable con el mismo nombre en otro ámbito. ¿Cuál se utiliza en cada caso?

Respuesta:

### 6. Distingue entre declarar una variable, acceder a ella y modificar su valor.

Respuesta:


## Comprobaciones

<!-- Escribe aquí tus pruebas y resultados. -->
