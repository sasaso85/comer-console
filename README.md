# Requerimientos:
***

### Has una clase llamada *Persona* que siga las siguientes condiciones:
- Sus atributos son:
  - nombre
  - edad
  - NSS (Numero de Seguro Social)
  - sexo (H hombre, M mujer)
  - peso 
  - altura. 

  > No queremos que se accedan directamente a ellos. 
  > Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes 
  > hacerlo.

- Por defecto, todos los atributos menos el NSS serán valores por defecto según su tipo (0 números, cadena vacía 
para String, etc.). Sexo será hombre por defecto, usa una constante para ello.
- Se implementará:
  - Un constructor con todos los atributos como parámetro.
- Los métodos que se implementaran son:
  - **calcularIMC()**: calculará si la persona está en su peso ideal (peso en kg/(Estatura^2 en m)), devuelve un -1 si está 
  por debajo de su peso ideal, un 0 si está en su peso ideal y un 1 si tiene sobrepeso .Te recomiendo que uses 
  constantes para devolver estos valores
  
    |                   | **Hombre**       | **Mujer**        |
    |-------------------|------------------|------------------|
    | **Falta de peso** | por debajo de 20 | por debajo de 19 |
    | **Peso normal**   | 20-25            | 19-24            |
    | **Sobrepeso**     | mayor de 25      | mayor de 24      |
  
  - **esMayorDeEdad()**: indica si es mayor de edad, devuelve un booleano.
  - **comprobarSexo(char sexo)**: comprueba que el sexo introducido es correcto. Devolver el valor en booleano. No será 
  visible al exterior. 
  - **toString()**: devuelve toda la información del objeto. 
  - **generaNSS()**: genera una expresión de 8 caracteres con números y letras al azar. Este método será invocado cuando se 
  construya el objeto. Puedes dividir el método en partes para que te sea más fácil. No será visible al exterior.
  - Métodos set de cada parámetro, excepto de NSS. 

