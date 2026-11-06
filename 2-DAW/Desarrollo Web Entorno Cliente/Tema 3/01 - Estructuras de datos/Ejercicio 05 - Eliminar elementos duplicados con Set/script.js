// Ejercicio 5. Eliminar elementos duplicados con Set
// Datos de partida del enunciado; la solución queda pendiente.
let asistentes = ["Ana", "Luis", "Ana", "Marta", "Luis", "Pedro"];
// Muestra el array original
console.log("Array original: ", asistentes);

// Creamos un conjunto Set con sus elementos
let SetAsistentes = new Set(asistentes);

// Muestra el conjunto resultante
console.log("Set resultante: ", SetAsistentes);

//Añade el nombre de Sonia
SetAsistentes.add("Sonia");

// Intenta volver a añadir a Ana otra vez
SetAsistentes.add("Ana");

// Muestra el conjunto final
console.log("Set final: ", SetAsistentes)