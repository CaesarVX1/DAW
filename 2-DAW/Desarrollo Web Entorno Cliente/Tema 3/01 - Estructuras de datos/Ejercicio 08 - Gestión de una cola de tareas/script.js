// Ejercicio 8. Gestión de una cola de tareas
// Datos de partida del enunciado; la solución queda pendiente.

let cola = [];

//1. Añade "Documento_A", "Documento_B" y "Documento_C" en ese orden.
cola.push("Documento_A");
cola.push("Documento_B");
cola.push("Documento_C");

//2. Muestra la cola.
console.log(cola);

//3. Procesa el primer trabajo utilizando el método adecuado.
cola.shift();

//4. Muestra la cola restante.
console.log(cola);

//5. Añade "Documento_D" al final.
cola.push("Documento_D");

//6. Procesa el siguiente trabajo.
cola.shift();

//7. Muestra la cola final.
console.log(cola);