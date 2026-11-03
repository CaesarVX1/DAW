# Ejercicio 7. Corrección y validación de una hoja CSS
## Respuestas y comprobaciones

### 1. ¿Qué errores detectaste visualmente?

**Respuesta**:
- body
    - El background color está sin cerrar (;)
    - Además, el font family, le falta ":"
- h1
    - En el text-align, pone centre y es center
- p
    - En el font-size, falta la unidad de medida, si no, se queda como un "16" seco
- .destacado
    - Está sin cerrar la llave "}"

### 2. ¿Qué errores o advertencias indicó el validador?

Respuesta:
- Que faltaba un punto y coma (;) después de background-color
- Que faltaban los dos puntos (:) en font-family
- Que centre no es un valor válido para text-align
- Que font-size: 16 no tiene una unidad de medida
- Que faltaba cerrar la llave (}) de .destacado

### 3. ¿Cómo has corregido cada error?

Respuesta:
- En background-color añadí el punto y coma al final
- En font-family añadí los dos puntos (:)
- En text-alñign añadí la unidad de medida px
- En .destacado añadí la llave de cierre

### 4. ¿Qué diferencia hay entre error de sintaxis y declaración válida sin el efecto visual esperado?

Respuesta:
- **Error de sintaxis**: Pasa cuando escribimos algo mal en el CSS y el navegador no puede interpretarlo bien
- **Declaración válida sin efecto visual**: Pasa cuando el código está bien escrito pero el resultado no es el que queremos