// Antes de ejecutar, escribe tus predicciones en README.md.
// Ejercicio 5. Analiza el ámbito de las variables
// Datos de partida del enunciado; la solución queda pendiente.

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

// TODO: escribe tu solución y tus comprobaciones.
