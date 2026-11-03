## Respuestas y comprobaciones
### 1. Predice los colores antes de cambiar el código y compruébalos.

Respuesta:
- **Primer párrafo**: Azul, se aplica el selector p del CSS interno
- **Segundo párrafo**: Verde, la clase .aviso tiene más prioridad que el selector de p
- **Tercer párrafo**: Morado, el id especial tiene más prioridad que la clase y selector de etiqueta
- **Cuarto párrafo**: Rojo, tiene un estilo en línea que tiene más prioridad que la hoja interna y externa

### 2. ¿Qué ocurre al eliminar style del cuarto párrafo?

Respuesta: Al eliminar el estilo en línea del cuarto párrafo, pasa a ser morado porque se aplica el id especial que tiene más prioridad que la clase aviso y el selector de p

### 3. ¿Qué ocurre al eliminar después su id especial?

Respuesta: Al eliminar el id especial, el cuarto párrafo se vuelve verde, porque  ahora tiene el de la clase aviso que tiene más prioridad que el selector de p

### 4. ¿Por qué prevalece el estilo en línea en este ejemplo?

Respuesta:

| Párrafo | Color previsto | Color observado | Explicación |
|---|---|---|---|
| 1 | Azul | Azul | Se aplica el p de la hoja CSS interna |
| 2 | Verde | Verde | La clase tiene más prioridad que el selector de p |
| 3 | Morado | Morado | El id especial tiene más prioridad |
| 4 | Rojo | Rojo | El estilo en línea tiene más prioridad |