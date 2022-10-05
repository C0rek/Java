/*
    Atributos:
 	
 	MaxTam: valor fijo que funciona como el límite de elementos almacenables en el conjunto.
 	Tam: cada conjunto tiene un valor propio, indica el total de elementos que contiene el conjunto.
 	[]elementos: vector que refiere a un elemento especifico del conjunto para su uso particular. 

    Operaciones:

	Conjunto (): crea un conjunto sin elementos.
	Conjunto (vector): crea un conjunto el cual posee los elementos del vector. 
	EsVacio (conjunto): verifica si el conjunto no tiene elementos, en cuyo caso devuelve cierto.
	Pertenece (conjunto, elemento): verifica si el elemento dado forma parte del conjunto, en cuyo caso devuelve cierto.
	Añadir (conjunto, elemento): Comprueba si el elemento forma parte del conjunto y si el tamaño no alcanzo el limite; en caso negativo, es añadido. La operación modifica al conjunto.
	Traer elemento (conjunto, elemento): Comprueba si el elemento forma parte del conjunto; en caso positivo devuelve dicho elemento, de lo contrario devuelve -1.
	Tamaño (conjunto): devuelve el número de elementos del conjunto.
	Mostrar (conjunto): muestra el conjunto solicitado.
	Intersección (conjunto, conjunto): realiza la operación matemática de la intersección de dos conjuntos. La operación devuelve un conjunto con los elementos comunes a los dos conjuntos. 
	Unión (conjunto, conjunto): realiza la operación matemática de la unión de dos conjuntos. La operación devuelve un conjunto con los elementos comunes y no comunes de los dos conjuntos.
	Inclusión (conjunto, conjunto): realiza la operación matemática de la inclusión de dos conjuntos. La operación consiste en comprobar si todos los elementos del primer conjunto están presentes en el segundo conjunto; en cuyo caso devuelve cierto.

 */
