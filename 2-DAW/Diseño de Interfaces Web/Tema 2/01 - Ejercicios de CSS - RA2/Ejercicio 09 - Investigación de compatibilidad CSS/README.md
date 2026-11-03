# Ejercicio 9. Investigación de compatibilidad CSS
## Respuestas y comprobaciones

### Propiedad 1

- Nombre: opacity
- Utilidad: Controla la transparencia de un elemento (Va desde 0 hasta el 1)
- Ejemplo: 
```css
    .imagen {
        opacity: 0.5;
    }
```
- Navegadores y versiones:Chrome, Firefox, Safari
- Limitaciones: Si se usa un valor muy bajo es dificil leer o verlo directamente
- Fuente consultada: https://caniuse.com/css-opacity

### Propiedad 2

- Nombre: box-shadow
- Utilidad: Añade sombras alrededor de un elemento (Caja, imagen o tarjeta)
- Ejemplo:
```css
.tarjeta {
    box-shadow 5px 5px 8px blue;
}
```
- Navegadores y versiones: Chrome, Safari, Brave, Firefox
- Limitaciones: No funciona en Internet Explorer versión 8 (Por decir algo la verdad) y las sombras grandes hay documentación que dice que afecta el rendimiento si se abusa de ella
- Fuente consultada: https://caniuse.com/css-boxshadow

### Propiedad 3

- Nombre: text-transform
- Utilidad: Puede convertir la apariencia de las letras por ejemplo de minúsculas a mayúsculas o poner la primera letra de cada palabra en mayúscula sin cambiarlo en el HTML
- Ejemplo:
```css
.titulo {
    text-transform: uppercase;
}
```
- Navegadores y versiones: Chrome, Firefox, Safari, Edge
- Limitaciones:
- Fuente consultada: https://caniuse.com/mdn-css_properties_text-transform

### Conclusión
Estas propiedades son útiles para mejorar el diseño web ya sea para sombrear, controlar la transpariencia o modificar la apariencia de los textos
Son compatibles con casi todos los navegadores de hoy en día
