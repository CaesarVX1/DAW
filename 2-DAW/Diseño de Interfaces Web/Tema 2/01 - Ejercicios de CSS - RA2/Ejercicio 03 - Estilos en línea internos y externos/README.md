# Ejercicio 3. Estilos en línea internos y externos (Cuestiones)

### 1. ¿Qué tamaño de letra tienen los párrafos?

Respuesta: Los 3 párrafos tienen tamaño de letra de 18px ya que la regla de estilos de la hoja interna da ese tamaño para todos los parrafos (p).

### 2. ¿Por qué el primer párrafo aparece en rojo?

Respuesta: El primer párrafo aparece en rojo porque tiene un estilo en línea con el atributo style ="color: red;" lo que hace que tenga la letra en rojo, **los estilos de línea tienen más prioridad**.

### 3. ¿Qué ocurre si eliminas el atributo style del primer párrafo?

Respuesta: El primer párrafo deja de aparecer en rojo y se pone negro, el tamaño de letra sigue siendo 18px ya que prevalece la regla de la hoja interna

### 4. ¿Qué ocurre si eliminas la regla de la hoja interna?

Respuesta: Si la eliminamos, los párrafos pasan a tener tamaño de letra 16px por la hoja externa y el primero seguiría viéndose rojo, los otros seguirían negros

### 5. ¿Qué ventajas e inconvenientes tiene cada uno de los tres métodos?

**Respuesta (En Línea):**
- Ventajas:
    - Deja poner estilos directamente en un elemento HTML, deja hacer cambios rápidos y específicos para pruebas
- Desventajas:
    - Es más difícil mantener el código, y no se puede reutilizar

**Respuesta (CSS hoja externa):**
- Ventajas:
    - Separa el diseño del contenido lo que lo deja todo más limpio, permite reusar los mismos estilos en varias páginas
- Desventajas:
    - Necesita otro archivo (Lo que la puede liar si te equivocas en las rutas), y si el CSS no se carga bien, los estilos no se aplican

**Respuesta (CSS hoja interna):**
- Ventajas
    - Deja definir archivos dentro del HTML, no necesita un archivo adicional
- Desventajas
    - Los estilos solo afectan a ese HTML, no se pueden reusar y hace que el código luego sea lioso y poco organizado


