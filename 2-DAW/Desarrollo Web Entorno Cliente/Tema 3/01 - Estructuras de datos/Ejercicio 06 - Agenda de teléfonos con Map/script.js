// Ejercicio 6. Agenda de teléfonos con Map

// Contactos iniciales del enunciado:
// Ana: 600111222
// Luis: 600333444
// Marta: 600555666

// 1 Crea un mapa vacío
let Agenda = new Map();

// 2. Introduce los 3 contactos usando set().
Agenda.set("Ana", "600111222");
Agenda.set("Luis", "600333444");
Agenda.set("Marta", "600555666");

// 3. Consulta el teléfono de Luis usando get().
console.log("El teléfono de Luís es: ", Agenda.get("Luis"));

// 4. Añade a Pedro con el teléfono 600777888
Agenda.set("Pedro", "600777888");

// 5. Cambia el teléfono de Ana por 600999000
Agenda.set("Ana", "600999000");

// 6. Muestra el teléfono actualizado de Ana
console.log("El nuevo teléfono de Ana es: ", Agenda.get("Ana"));

// Muestra el número total de contactos, puedes usar size.
console.log("El número total de contactos en la agenda es de: ", Agenda.size)