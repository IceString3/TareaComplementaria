# TareaComplementaria
![shop](http://photos.gograph.com/thumbs/CSP/CSP631/k21426561.jpg)

 Este programa implementa una aplicación para añadir artículos predeterminados a una "tienda", mostrarlos, añadirlos, buscarlos y eliminarlos.
 
# Cómo usar el programa.
Al iniciar el programa, dispone de 5 opciones (La opción 6 es para salir).

Éstas son las opciones:

1. Llenar almacén
2. Mostrar inventario
3. Añadir artículo
4. Eliminar artículo
5. Buscar artículo
6. Salir

# Descripción de las opciones
## 1. Llenar almacén
Añade 6 artículos preestablecidos. Útil para probar rápidamente la búsqueda y la eliminación de un artículo de manera rápida.

Estos son los artículos por defecto que se cargarán:

* Cero
* Uno
* Dos
* Tres
* Cuatro
* Cinco

## 2. Mostrar inventario
Muestra la lista de artículos que hay en la tienda.

## 3. Añadir artículo
Permite añadir un artículo a la lista. Introduzca un parámetro y pulse Enter. Éste es el orden de los parámetros:

1. Nombre
2. Precio
3. Cantidad

Nota: Si el nombre del artículo coincide con uno de los existentes, no se podrá añadir.

Ejemplo de ejecución (las líneas cursivas representan los datos introducidos por el usuario):

> Introduzca el nombre del artículo:  
> _Mascarilla quirúrgica_  
> Introduzca el precio del artículo:  
> _0.96_  
> Introduzca las unidades del artículo:  
> _50_  
> Artículo añadido. 

## 4. Eliminar artículo.
Sirve para eliminar un artículo de la tienda. Para ello introduzca el nombre del artículo que se desea eliminar.

Supongamos que tenemos cargada la lista de elementos predeterminados vía "Llenar almacén". Vamos a eliminar el elemento "Dos":

> Introduce el nombre del artículo que se desea eliminar:  
> _Dos_  
> Se ha eliminado el artículo Dos  

Para comprobarlo, mostraremos la lista con la opción 2 y miramos si sigue existiendo el artículo cuyo nombre es "Dos":

> Nombre: Cero, Precio: 10.0, Cantidad: 12  
> Nombre: Uno, Precio: 20.0, Cantidad: 9  
> Nombre: Dos, Precio: 10.0, Cantidad: 12  
> Nombre: Tres, Precio: 10.0, Cantidad: 12  
> Nombre: Cuatro, Precio: 105.0, Cantidad: 4  
> Nombre: Cinco, Precio: 99.0, Cantidad: 1  
 

## 5. Buscar artículo
Sirve para buscar un artículo en la tienda. Para ello introduzca el nombre del artículo que se desea buscar. Partiendo de la lista predeterminada:

> Introduce el nombre del artículo que se desea buscar:  
> _Cinco_  
> Nombre: Cinco  
> Precio: 99.0  
> Cantidad: 1  

## 6. Salir
Esta opción es para cerrar el programa.
